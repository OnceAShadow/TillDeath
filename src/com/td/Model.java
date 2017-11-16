package com.td;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;
import static org.lwjgl.opengl.GL20.*;

public class Model {
    
    private int drawCount;
    private int vertID;
    private int textID;
    private int indiID;
    
    public Model(float[] vertices, float[] textureCoords, int[] indices) {
        drawCount = indices.length;

        vertID = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, vertID);
        glBufferData(GL_ARRAY_BUFFER, createFloatBuffer(vertices), GL_STATIC_DRAW);
        
        textID = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, textID);
        glBufferData(GL_ARRAY_BUFFER, createFloatBuffer(textureCoords), GL_STATIC_DRAW);
    
        indiID = glGenBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, indiID);
        glBufferData(GL_ELEMENT_ARRAY_BUFFER, createIntBuffer(indices), GL_STATIC_DRAW);
        
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
        glBindBuffer(GL_ARRAY_BUFFER, 0);
     }
     
     public void render() {
        glEnableClientState(GL_VERTEX_ARRAY);
        glEnableClientState(GL_TEXTURE_COORD_ARRAY);
        
        glBindBuffer(GL_ARRAY_BUFFER, vertID);
        glVertexPointer(3, GL_FLOAT, 0, 0);
        
        glBindBuffer(GL_ARRAY_BUFFER, textID);
        glTexCoordPointer(2, GL_FLOAT, 0, 0 );
    
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, indiID);
        glDrawElements(GL_TRIANGLES, drawCount, GL_UNSIGNED_INT, 0);
        
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glDisableClientState(GL_VERTEX_ARRAY);
        glDisableClientState(GL_TEXTURE_COORD_ARRAY);
     }
     
     private FloatBuffer createFloatBuffer(float[] data) {
         FloatBuffer buffer = BufferUtils.createFloatBuffer(data.length);
         buffer.put(data);
         buffer.flip();
         return buffer;
     }
     
     private IntBuffer createIntBuffer(int[] data) {
         IntBuffer buffer = BufferUtils.createIntBuffer(data.length);
         buffer.put(data);
         buffer.flip();
         return buffer;
     }
}