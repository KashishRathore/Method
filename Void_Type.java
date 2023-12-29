package Methods;

public class Void_Type {
    static void tellJoke(){
        System.out.println("What's the best thing about Switzerland? I don't know, but the flag is a big plus.");
    }
     static void change(int x){
       x = 98;
    }

    static void change2(int [] arr){
       arr[0] = 98;
    }

    public static void main(String[] args) {
        tellJoke();
        //Case 1 : Changing the integer 
        //int x = 45;
        //change(x);
        //System.out.println("the value of x after running of x is : " + x);

        //Case 2 : Changing the Array
        int [] marks = {52, 73, 77, 89, 98, 94};
        change2(marks);
        System.out.println("The value of x after running is : " +marks[0]);
    }
}
