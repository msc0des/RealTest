package org.example;

import java.util.function.Consumer;
@java.lang.FunctionalInterface
public interface FunctionalInterface {
    String abc = null;
    void dance();
    //void play();
    default void sing(){
        System.out.println("from default");
    }
    default void singandsing(){
        System.out.println("from default");
    }

}
