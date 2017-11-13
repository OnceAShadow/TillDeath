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
    
        long win = glfwCreateWindow(800,600, "Window", 0 , 0);
        keyboard = new Keyboard(win);
        glfwShowWindow(win);
        glfwMakeContextCurrent(win);
        GL.createCapabilities();
        
        glEnable(GL_TEXTURE_2D);
        Texture tex = new Texture("./res/Drive.png");
        
        while(!glfwWindowShouldClose(win)) {
            keyboard.checkKeyboardAndMouse();
            glfwPollEvents();
            glClear(GL_COLOR_BUFFER_BIT);
            
            glBegin(GL_QUADS);
                glTexCoord2f(0,0);
                glVertex2f(-0.20f + toonPosX, 0.20f + toonPosY);
    
                glTexCoord2f(1,0);
                glVertex2f(0.20f + toonPosX, 0.20f + toonPosY);
                
                glTexCoord2f(1,1);
                glVertex2f(0.20f + toonPosX, -0.20f + toonPosY);
                
                glTexCoord2f(0,1);
                glVertex2f(-0.20f + toonPosX, -0.20f + toonPosY);
            glEnd();
    
            tex.bind();
            glfwSwapBuffers(win);
        }
    
        glfwTerminate();
    }
}