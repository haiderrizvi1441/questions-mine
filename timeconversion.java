package interviewquestions;

public class timeconversion {
    //Given a time in -hour AM/PM format, convert it to military (24-hour) time.

    // my function
    public static void timeconversionfnc(String t){

        String [] parts = t.split(":");
        int hours = Integer.parseInt(parts[0]);
        int mins = Integer.parseInt(parts[1]);
        int sec = Integer.parseInt(parts[2].substring(0,2));
        String am_pm = parts[2].substring(2);

        System.out.println("The time is now");
        System.out.println(hours);
        System.out.println(mins);
        System.out.println(sec);
        System.out.println(am_pm);

        // Conversion to milatary time
        // if AM and hours == 12 then hours = 0
        if(am_pm.charAt(0) == 'A' && hours == 12){
            hours = 0;
            String hrs = String.valueOf(hours);
            hours = Integer.parseInt(hrs);
        }
        //if PM and hours == 12 then hours = 12
        if(am_pm.charAt(0) == 'P' && hours == 12){
            hours = 12;
        }
        // if PM and hours < 12 then hours += 12
        if(am_pm.charAt(0) == 'P' && hours < 12){
            hours += 12;
        } 

        System.out.println(hours + ":" + mins + ":" + sec);
    }

    // Tutorial
    public static void timetutorialfnc(String s){

    }
    



        


    
    public static void main(String[] args){
        timeconversionfnc("12:45:23AM");

    }   
    
}
