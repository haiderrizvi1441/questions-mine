package SOLIDPrinciples.OpenClosedPrinciple;

public class AddOperation implements Operation {

    @Override
    public int perform(int x, int y) {
        return x + y;
    }
    
    
}
