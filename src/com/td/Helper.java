package com.td;

public class Helper {

    public static Model createModel() {
        
        float[] vertices = new float[] {
                -0.5f, 0.5f, 0, // Top Left         0
                0.5f, 0.5f, 0, // Top Right         1
                0.5f, -0.5f, 0, // Bottom Right     2
                -0.5f, -0.5f, 0, // Bottom Left     3
        };
        float[] textures = new float[] {
                0,0,
                1,0,
                1,1,
                0,1,
        };
        
        int[] indices = new int[] {
                0,1,2,
                2,3,0,
        };
        
        return new Model(vertices, textures, indices);
    }
}
