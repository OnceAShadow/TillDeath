package com.td;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import static org.lwjgl.opengl.GL20.*;

public class Shader {

    private int program;
    private int vs; // Works all Vertices
    private int fs; // Gives Things Color/Texture/Effects
    
    public Shader(String filename) {
        program = glCreateProgram();
    
        vs = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(vs, readFile(filename + ".vs"));
        glCompileShader(vs);
        if (glGetShaderi(vs, GL_COMPILE_STATUS) != 1) {
            System.out.println("Vertex Shader Error");
            System.err.println(glGetShaderInfoLog(vs));
            System.exit(1);
        }
        
        fs = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(fs, readFile(filename + ".fs"));
        glCompileShader(fs);
        if (glGetShaderi(fs, GL_COMPILE_STATUS) != 1) {
            System.out.println("Fragment Shader Error");
            System.err.println(glGetShaderInfoLog(fs));
            System.exit(1);
        }
        
        glAttachShader(program, vs);
        glAttachShader(program, fs);
        validateProgram();
    }
    
    private void createVertexShader(String filename) {
        vs = glCreateShader(GL_VERTEX_SHADER);
        glShaderSource(GL_VERTEX_SHADER, readFile(filename));
        glCompileShader(vs);
        if (glGetShaderi(vs, GL_COMPILE_STATUS) != 1) {
            System.out.println("Vertex Shader Error");
            System.err.println(glGetShaderInfoLog(vs));
            System.exit(1);
        }
        glAttachShader(program, vs);
    }
    
    private void createFragmentShader(String filename) {
        fs = glCreateShader(GL_FRAGMENT_SHADER);
        glShaderSource(GL_FRAGMENT_SHADER, readFile(filename));
        glCompileShader(fs);
        if (glGetShaderi(fs, GL_COMPILE_STATUS) != 1) {
            System.out.println("Fragment Shader Error");
            System.err.println(glGetShaderInfoLog(fs));
            System.exit(1);
        }
        glAttachShader(program, fs);
    }

    private void validateProgram() {
        glBindAttribLocation(program, 0, "vertices");
        
        glLinkProgram(program);
        if (glGetProgrami(program, GL_LINK_STATUS) != 1) {
            System.err.println(glGetProgramInfoLog(program));
            System.exit(1);
        }
    
        glValidateProgram(program);
        if (glGetProgrami(program, GL_VALIDATE_STATUS) != 1) {
            System.err.println(glGetProgramInfoLog(program));
            System.exit(1);
        }
    }
    
    private String readFile(String filename) {
        StringBuilder string = new StringBuilder();
        BufferedReader br;
        
        try {
            br = new BufferedReader(new FileReader(new File("./res/shaders/" + filename)));
            String line;
            while ((line = br.readLine()) != null) {
                string.append(line);
                string.append("\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return string.toString();
    }
    
    public void bind() {
        glUseProgram(program);
    }
}
