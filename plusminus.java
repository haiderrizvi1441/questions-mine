package interviewquestions;

public class plusminus {
// provides the ratio of pos, neg, zeroes in the array
    public static void plusminusfnc(int [] arr){
        int total = arr.length;
        float posCounter = 0;
        float negCounter = 0;
        float zerCounter = 0;

        for(int i=0 ; i<total ; i++){
            int element = arr[i];
            if(element > 0){
                posCounter++;
            }
            if(element < 0){
                negCounter++;
            }
            if(element == 0){
                zerCounter++;
            }

            
        }

        System.out.printf("%1.6f\n", (posCounter/total));
        System.out.printf("%1.6f\n", (negCounter/total));
        System.out.printf("%1.6f\n", (zerCounter/total));

    }
    public static void main(String[] args){
        int [] intarr1 = {1,2,3,0,-9,-8};
        plusminusfnc(intarr1);

    }
    
}
