package interviewquestions;

import java.util.Arrays;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class interviewfailed {

    // Input - syedMohammadHaiderRizvi
    // Output- Syed Mohammad Haider Rizvi

    public static void myfnc(String s){

        //split by capital 
        String [] strArr = s.split("(?=\\p{Upper})");
        int size = strArr.length;
        String [] newStr = new String[size];
        // loop
        for (int i=0 ; i<=(size-1) ; i++){
            newStr[i] = strArr[i].substring(0,1).toUpperCase() + strArr[i].substring(1);
            
        }
        String finnal = String.join(" ", newStr);
        System.out.println("Input: " + s);
        System.out.println("Output: " + finnal);


    }





    public static void main(String[] args){

        String inpt = "syedMohammadHaiderRizvi";
        myfnc(inpt);

    }
    
}
