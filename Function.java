package Methods;
public class Function {
   
    static int mySum (int a, int b){
        int c = a+b;
        return c;
    }

    static int logic (int a ,int b){
        int c;
        if(a>b){
            c = a+b;
        }
        else{
            c = (a+b)*5;
        }
        return c;
    }
    public static void main(String[] args) {
        int x = 3;
        int y = 4;
        int sum = mySum(x,y);
        int ifelse = logic(x, y);
        System.out.println(sum);
        System.out.println(ifelse);

    }
}
