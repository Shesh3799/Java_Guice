package org.example;

import com.google.inject.Inject;

public class ShapeRequest {
//    Field Injection
    @Inject
    DrawShape d;

//    Constructor Injection
//    @Inject
//    ShapeRequest(DrawShape d){
//        this.d = d;
//    }

//    We can remove above constructor and use setter injection as follows
//    @Inject
//    void setDrawShape(DrawShape d){
//        this.d = d;
//    }

    public void makeRequest(){
        d.draw();
    }

    public DrawShape getShapeObject(){
        return d;
    }
}
