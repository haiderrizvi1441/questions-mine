package SOLIDPrinciples.OpenClosedPrinciple;

public class BadCalc {
    
    public int calculateNumber(int number1, int number2, String operationType){

        int result = 0;
        switch (operationType){
            case "add":
                result = number1 + number2;
                break;
            case "subtract":
                result = number1 - number2;
                break;
            default:
                result = 0;
        }

        return result;
    }

    public String testBadCalculator(){
        return "Bad Calculator is working";
    }


    public static void main(String[] args){

        
    }
}
