package interviewquestions.RandomQs;

// HackerRank Milatary Time conversion Question

/*
 * INPUT - 07:05:45PM
 * OUTPUT - 19:05:45
 */
public class timeconversion {


    static void fnc1(String s){
        int hours = Integer.parseInt(s.substring(0, 2));
        int minutes = Integer.parseInt(s.substring(3,5 ));
        int seconds = Integer.parseInt(s.substring(6, 8));
        String time = s.substring(8);
        System.out.println(hours);
        System.out.println(minutes);
        System.out.println(seconds);
        System.out.println(time);

        String newTime ="";
        // case 1 - 0<= hr <12 && AM- No change
        //case 2 - 0<= hr <12 && PM - Add 12 to hour
        // case 3 - hr == 12 && AM - Make hour 00
        // case 4 - hr == 12 && PM - No changes
        if((0<=hours && hours<12) && (time == "AM")){
            newTime = String.format("%02d", hours) + ":" + minutes + ":" + seconds;
        }
        else if((0<=hours && hours<12) && (time == "PM")){
            hours +=12;
            newTime = String.format("%02d", hours) + ":" + minutes + ":" + seconds;
        }
        else if(hours==12 && time=="AM"){  
            hours = 0;
            newTime = String.format("%02d", hours) + ":" + minutes + ":" + seconds;
        }
        else if(hours==12 && time=="PM"){
            newTime = String.format("%02d", hours) + ":" + minutes + ":" + seconds;
        }
        else{
            System.out.println("Does not fall in case");
            return;
        }

        System.out.println(newTime);




    }

    static void fnc2(String s){
        
    }
    public static void main(String[] args){

        fnc1("07:05:45PM");

    }
    
}
