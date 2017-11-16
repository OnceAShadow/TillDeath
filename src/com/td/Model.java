package com.td;
import org.lwjgl.BufferUtils;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import static org.lwjgl.opengl.GL11.*;
import static org.lwjgl.opengl.GL15.*;

public class Model {
    
    private int drawCount;
    private int vertID;
    private int textID;
    private int indiID;
    
    public Model(float[] vertices, float[] textureCoords, int[] indices) {
        drawCount = indices.length;

        vertID = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, vertID);
        glBufferData(GL_ARRAY_BUFFER, createBuffer(vertices), GL_STATIC_DRAW);
        
        textID = glGenBuffers();
        glBindBuffer(GL_ARRAY_BUFFER, textID);
        glBufferData(GL_ARRAY_BUFFER, createBuffer(textureCoords), GL_STATIC_DRAW);
    
        indiID = glGenBuffers();
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, indiID);
        IntBuffer indicesBuffer = BufferUtils.createIntBuffer(indices.length);
        indicesBuffer.put(indices);
        indicesBuffer.flip();
        
        glBufferData(GL_ELEMENT_ARRAY_BUFFER, indicesBuffer, GL_STATIC_DRAW);
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
        
        glBindBuffer(GL_ARRAY_BUFFER, 0);
        glBindBuffer(GL_ELEMENT_ARRAY_BUFFER, 0);
        glDisableClientState(GL_VERTEX_ARRAY);
        glDisableClientState(GL_TEXTURE_COORD_ARRAY);
     }
     
     private FloatBuffer createBuffer(float[] data) {
         FloatBuffer buffer = BufferUtils.createFloatBuffer(data.length);
         buffer.put(data);
         buffer.flip();
         
         return buffer;
     }
}