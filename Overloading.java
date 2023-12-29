package Methods;

public class Overloading {
    static void foo(){
        System.out.println("Good Morning bro!!");
    }
    static void foo(int a){
        System.out.println("Good Morning " + a + " bro!!");
    }
     static void foo(int a, int b){
        System.out.println("Good Morning " + a + " bro!!");
        System.out.println("Good Morning " + b + " bro!!");

    }
    public static void main(String[] args) {
        foo();
        foo(3000);
        foo(3000 , 4000);

    }
}
