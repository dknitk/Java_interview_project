package com.dsa.queue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.SynchronousQueue;

public class KWPriorityQueue {

    public static void main(String[] args) {
        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(1.5);
        queue.offer(4.2);
        System.out.println("Priority Queue :::" + queue);

        Queue<String> queue1 = new LinkedList<>();
        queue1.offer("C");
        queue1.offer("A");
        queue1.offer("D");
        queue1.offer("R");
        System.out.println("LinkedList :::"+queue1);
        System.out.println("Poll :::" + queue1.poll());
        System.out.println("Size :::" + queue1.size());
        System.out.println("Top Element :::" + queue1.peek());

        Queue<String> queue2 = new SynchronousQueue<>();
        queue2.offer("A");
        queue2.offer("V");
        queue2.offer("F");
        System.out.println(queue2);
    }
}
