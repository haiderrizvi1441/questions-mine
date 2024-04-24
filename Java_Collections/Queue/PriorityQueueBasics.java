package interviewquestions.Java_Collections.Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueBasics {

    public static void main(String[] args){

        // MINHEAP is default , smallest element in front
        // add comparator to change to MAX HEAP
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.offer(12);
        pq.offer(40);
        pq.offer(65);
        pq.offer(7);
        pq.offer(10);
        


        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.peek());



    }
}
