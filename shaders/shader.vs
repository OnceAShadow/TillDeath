#version 120

attribute vec3 vertices;

void main(void) {
    gl_Position = vec4(vertices, 1);
}