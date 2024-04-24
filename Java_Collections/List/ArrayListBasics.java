package interviewquestions.Java_Collections.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasics {
    public static void main(String[] args){

        // *A*R*R*A*Y*L*I*S*T*
        // ArayList Decleration
        ArrayList<String> myarraylist = new ArrayList<>();
        
        // Dynamic array , first create a default array of n=10 then as it fills it increases size by n+(n/2)+1

        List<Integer> mylist = new ArrayList<>();


        // ADDITION
        mylist.add(1);
        mylist.add(2);
        mylist.add(6);
        mylist.add(15); // element is always added at the end.

        System.out.println(mylist);


        // A new List can be added to this existing list
        List<Integer> addonlist = new ArrayList<>();
        addonlist.add(56);
        addonlist.add(89);
        addonlist.add(150);

        // add this list to another list
        mylist.addAll(addonlist);
        System.out.println("The added list: "+ mylist);


        // GET 
        mylist.get(2);

        // DELETION

        //delete by Index
        mylist.remove(2);
        //delete by Element
        mylist.remove(Integer.valueOf(89));

        // SET 
        mylist.set(0, 1000);
        System.out.println(mylist);

        //Contains
        mylist.contains(55);

        // ITERATING
        //for loop
        for (int i = 0; i < mylist.size(); i++) {

            System.out.println("Element is: " + mylist.get(i));
            
        }
        
        //for each loop
        for(Integer element: mylist){
            System.out.println("Element by for each" + element);

        }

        // ###### IMP ####//######
        // ITERATOR
        Iterator<Integer> it = mylist.iterator();

        while(it.hasNext()){
            System.out.println("Element through iterator" + it.next());
        }



    }
}
