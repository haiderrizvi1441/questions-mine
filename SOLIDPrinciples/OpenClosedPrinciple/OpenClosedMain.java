package SOLIDPrinciples.OpenClosedPrinciple;

public class OpenClosedMain {
    

    public static void main(String[] args){
        BadCalc badCalculator = new BadCalc();

        int res = badCalculator.calculateNumber(1, 2, "subtract");
        System.out.println(res);

    }
}
