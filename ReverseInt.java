package interviewquestions;

public class ReverseInt {

    public static void fncreverseint(int n){
        int rem, res=0, temp;

        temp = n;

        while(temp>0){
            rem = temp % 10;
            res = (res*10) + rem;
            // System.out.println(rem);
            temp = temp/10;
        }
        System.out.println(res);
        
    }
    public static void main(String[] args){

        fncreverseint(1302);

    }

    
}
