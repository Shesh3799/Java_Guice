package org.example;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import org.example.annotations.ColorValue;
import org.example.annotations.SquareLength;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
//        This will return new object everytime injector.getInstance is called
//        bind(DrawShape.class).to(DrawSquare.class);
//        This will return same instance everytime we invoke it
        bind(DrawShape.class).to(DrawSquare.class).in(Singleton.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("Red");
        bind(Integer.class).annotatedWith(SquareLength.class).toInstance(2);
//        To make request object singleton
        bind(ShapeRequest.class).in(Singleton.class);
    }
}
