package com.td;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.*;
import org.lwjgl.opengl.GL;

public class Main {
    
    public static Keyboard keyboard;
    public static float toonPosX;
    public static float toonPosY;
    
    public static void main(String[] args) {
        if (!glfwInit()) {
            System.err.println("GLFW Failed to initialize!");
            System.exit(1);
        }
        
        long win = glfwCreateWindow(1280,800, "Window", 0 , 0);
        keyboard = new Keyboard(win);
        glfwShowWindow(win);
        glfwMakeContextCurrent(win);
        GL.createCapabilities();
        glEnable(GL_TEXTURE_2D);
        
        
        
        
        float[] vertices = new float[] {
                -0.5f, 0.5f, 0, // Top Left         0
                0.5f, 0.5f, 0, // Top Right         1
                0.5f, -0.5f, 0, // Bottom Right     2
                -0.5f, -0.5f, 0 // Bottom Left     3
        };
        
        float[] textures = new float[] {
                0,0,
                1,0,
                1,1,
                0,1
        };
    
        int[] indices = new int[] {
                0,1,2,
                2,3,0
        };
        
        Model model = new Model(vertices, textures, indices);
        Shader shader = new Shader("shader");
        //Texture tex = new Texture("./res/Toon004.png");

        while(!glfwWindowShouldClose(win)) {
            keyboard.checkKeyboardAndMouse();
            glfwPollEvents();
            glClear(GL_COLOR_BUFFER_BIT);
            
            //tex.bind();
            
            //shader.setUniform("green", 0);
            shader.bind();
            model.render();
            
            glfwSwapBuffers(win);
        }
    
        glfwTerminate();
    }
}