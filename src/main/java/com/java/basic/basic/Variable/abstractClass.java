package com.java.basic.basic.Variable;

abstract class JSP { abstract void crud(); }
class PHP extends JSP {
    void crud() {
        System.out.println("PHP > Laravel");
    }
}
class ASP extends JSP {
    void crud() {
        System.out.println("ASP > .NET");
    }
}

public class abstractClass {

    public static void main(String[] args) {
        PHP php = new PHP();
        ASP asp = new ASP();
        php.crud();
        asp.crud();
    }
}
