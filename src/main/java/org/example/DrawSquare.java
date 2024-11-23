package org.example;

import com.google.inject.Inject;
import org.example.annotations.ColorValue;
import org.example.annotations.SquareLength;

public class DrawSquare implements DrawShape{

    private final String color;
    private final Integer length;

    @Inject
    public DrawSquare(@ColorValue String color, @SquareLength Integer length) {
        this.color = color;
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing square of color = "+color+" with length = "+length);
    }
}
