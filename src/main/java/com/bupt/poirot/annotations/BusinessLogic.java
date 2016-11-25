package com.bupt.poirot.annotations;

import java.lang.reflect.Method;

/**
 * Created by hui.chen on 11/25/16.
 */
public class BusinessLogic {
    @Todo(priority = Todo.Priority.MEDIUM, author = "Yashwant", status = Todo.Status.STARTED)
    public void incompleteMethod1() {
        //Some business logic is written
        //But it’s not complete yet
    }

    public static void main(String[] args) {
        Class businessLogicClass = BusinessLogic.class;
        for(Method method : businessLogicClass.getMethods()) {
            Todo todoAnnotation = method.getAnnotation(Todo.class);
            if(todoAnnotation != null) {
                System.out.println(" Method Name : " + method.getName());
                System.out.println(" Author : " + todoAnnotation.author());
                System.out.println(" Priority : " + todoAnnotation.priority());
                System.out.println(" Status : " + todoAnnotation.status());
            }
        }
    }
}
