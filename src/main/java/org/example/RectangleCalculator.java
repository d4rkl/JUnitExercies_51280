package org.example;

public class RectangleCalculator {
    public int area(int width, int height) {
        return width * height;
    }
    public int perimeter(int width, int height) {
        return 2 * width + 2 * height;
    }
    public int isTriangle(int a, int b, int c) {
        if ( a<b+c && b<a+c && c<a+b){
            return 1;
        }
        else{
            return 0;
        }

    }
}
