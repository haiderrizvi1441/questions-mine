package interviewquestions.Java_Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListTut {
// LINKED LIST - can be found in both of the queue and list
// List<Integer> llist = new LinkedList<>();

// First In First Out


    public static void main(String[] args){

        Queue<Integer> queue = new LinkedList<>();

        // Addition / offer
        queue.offer(12);
        queue.offer(13);
        queue.offer(14);
        queue.offer(15);
        queue.offer(16);

        // add and remove does the same but return exception if it fails
        // offer and poll retuns false if they fails

        System.out.println(queue);

        // Deletion / poll
        System.out.println(queue.poll());
        System.out.println("peek function: "); // gives next element to come
        System.out.println(queue.peek());



        
    }
}
