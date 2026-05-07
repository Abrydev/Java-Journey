package VariableScope;

public class VariableScope {
    static int x = 3;// CLASS scope
    public static void main(String[] args) {
        // variable scope = where a variable can be accessed

        int x = 1; //LOCAL Variable
        // int x = 2;

        System.out.println(x);
        doSomething();
    }

    static void doSomething(){
        int x = 2; //LOCAL variable

        System.out.println(x);
    }
    
}
