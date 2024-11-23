package org.example;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class Main {
    enum RequestType{
        DRAW_SQUARE,
        DRAW_CIRCLE
    }

    private static void sendRequest(RequestType requestType){
//        DrawShape shape = null;
//        switch (requestType){
//
//            case DRAW_SQUARE -> {
//                shape = new DrawSquare();
//            }
//            case DRAW_CIRCLE -> {
//                shape = new DrawCircle();
//            }
//            default ->
//                throw new IllegalArgumentException("Request type is invalid");
//        }
        Injector injector = Guice.createInjector(new AppModule());
//        Injector injector1 = Guice.createInjector(new AppModule());
//        DrawShape shape = injector.getInstance(DrawShape.class);
//        ShapeRequest request = new ShapeRequest(shape);
        ShapeRequest request1 = injector.getInstance(ShapeRequest.class);
        request1.makeRequest();

        ShapeRequest request = injector.getInstance(ShapeRequest.class);
        request.makeRequest();

//        Make changes in app module to see the effect
//        If we create two injector even though scope is singleton
//        the objects will be different
        if(request1.getShapeObject().equals(request.getShapeObject()))
            System.out.println("Objects are same");
        else
            System.out.println("Objects are not equal");

        if(request1.equals(request))
            System.out.println("Request objects are same");
        else
            System.out.println("Request objects are different");

    }

    public static void main(String[] args) {
        sendRequest(RequestType.DRAW_SQUARE);
//        sendRequest(RequestType.DRAW_CIRCLE);
    }
}