package interviewquestions.Data_Structures.Strings;

public class stringBuilder {
    public static void main(String[] args){
        // STRING vs STRING BUILDER 
        // heap and stack memory

        // We use String Builder as it is mutable

        StringBuilder sb = new StringBuilder("John");
        System.out.println(sb);

        //char at 
        System.out.println(sb.charAt(0));

        // setchar - Modiy the char at given index
        sb.setCharAt(0, 'R');
        System.out.println(sb);
        
        // Insert -
        sb.insert(1, 'h');
        System.out.println(sb);

        // delete - from Rhohn to Rohn
        sb.delete(1, 2);
        System.out.println(sb);

        // append -
        sb.append("ny");
        System.out.println(sb);

        // LENGTH
        System.out.println(sb.length());
        
    }
}
