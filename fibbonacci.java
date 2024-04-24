package interviewquestions;

public class fibbonacci {

    public static void fncfibbo(int n){
        int a = 0;
        int b = 1;

        System.out.println(a);
        System.out.println(b);
        for(int i=0 ; i<=n ; i++){
            int c = a + b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }
    public static void main(String[] args){

        fncfibbo(7);

    }
    
}
