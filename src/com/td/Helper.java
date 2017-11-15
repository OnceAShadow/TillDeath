package com.td;

public class Helper {

    public static Model createModel() {
        
        float[] verticies = new float[] {
                -0.5f, 0.5f, 0, // Top Left
                0.5f, 0.5f, 0, // Top Right
                0.5f, -0.5f, 0, // Bottom Right
            
                0.5f, -0.5f, 0, // Bottom Right
                -0.5f, -0.5f, 0, // Bottom Left
                -0.5f, 0.5f, 0, // Top Left
        };
        float[] textures = new float[] {
                0,0,
                1,0,
                1,1,
            
                1,1,
                0,1,
                0,0
        };
        return new Model(verticies, textures);
    }
}
