package interviewquestions.Java_Collections.Queue;

import java.util.ArrayDeque;

public class Arraydeque {
    
    // ELEMENT can be added or deleted from both the ends

    // ArrayDeque implements queue so it utilizes its function
    // also it has EXTRA unique features 

    public static void main(String[] args){
        

        ArrayDeque<Integer> adq = new ArrayDeque<>();

        // Add
        adq.offer(5);

        // ADD at First
        adq.offerFirst(12);

        //ADD at Last
        adq.offerLast(20);

        adq.offer(17);


        System.out.println("Queue:  x" + adq);


        // PEEK
        System.out.println("Peek: " + adq.peek());
        System.out.println("Peek first: " + adq.peekFirst());
        System.out.println("Peek last: " + adq.peekLast());


        // POLL , Removal

        System.out.println(adq.poll());
        System.out.println(adq.pollFirst()); // pollfirst and poll have same effect
        System.out.println(adq.pollLast());
    }
}
