package com.td;
import static org.lwjgl.glfw.GLFW.*;
import static org.lwjgl.opengl.GL11.GL_TRUE;

public class Keyboard {
    
    private long window;
    private boolean printKeysAndMouseToConsole = true;
    
    public Keyboard(long win) {
        window = win;
    }
    
    public void checkKeyboardAndMouse() {
    
        if (glfwGetMouseButton(window, 0) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" Mouse-1 ");
            }
        }
    
        if (glfwGetMouseButton(window, 1) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" Mouse-2 ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_ESCAPE) == GL_TRUE) {
            glfwSetWindowShouldClose(window, true);
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" ESC ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_ENTER) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" ENTER ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_TAB) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" TAB ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_SPACE) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" SPACE ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_LEFT_SHIFT) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" L-SHIFT ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_LEFT_CONTROL) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" L-CTRL ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_LEFT_ALT) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" L-ALT ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_GRAVE_ACCENT) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" Console ");
            }
        }
        
        ////
        // A - Z
        ////
        if (glfwGetKey(window, GLFW_KEY_W) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" W ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_S) == GL_TRUE) {
    
    
            if (printKeysAndMouseToConsole) {
                System.out.print(" S ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_A) == GL_TRUE) {
    
    
            if (printKeysAndMouseToConsole) {
                System.out.print(" A ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_D) == GL_TRUE) {
    
    
            if (printKeysAndMouseToConsole) {
                System.out.print(" D ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_Q) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" Q ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_E) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" E ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_R) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" R ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_F) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" F ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_Z) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" Z ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_X) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" X ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_C) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" C ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_V) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" V ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_B) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" B ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_N) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" N ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_M) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" M ");
            }
        }
        
        ////
        // 1 - 0
        ////
        if (glfwGetKey(window, GLFW_KEY_1) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 1 ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_2) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 2 ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_3) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 3 ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_4) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 4 ");
            }
        }
        
        if (glfwGetKey(window, GLFW_KEY_5) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 5 ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_6) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 6 ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_7) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 7 ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_8) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 8 ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_9) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 9 ");
            }
        }
    
        if (glfwGetKey(window, GLFW_KEY_0) == GL_TRUE) {
        
        
            if (printKeysAndMouseToConsole) {
                System.out.print(" 0 ");
            }
        }
    }
}
