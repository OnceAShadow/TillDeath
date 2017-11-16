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
        
        Model model = Helper.createModel();
        Shader shader = new Shader("shader");
        
        //Texture tex = new Texture("./res/Toon004.png");

        while(!glfwWindowShouldClose(win)) {
            keyboard.checkKeyboardAndMouse();
            glfwPollEvents();
            glClear(GL_COLOR_BUFFER_BIT);
            
            //tex.bind();
            shader.bind();
            shader.setUniform("green", 0);
            model.render();
            
            glfwSwapBuffers(win);
        }
    
        glfwTerminate();
    }
}