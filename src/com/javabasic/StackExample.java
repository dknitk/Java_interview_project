package com.javabasic;

import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<String> games = new Stack();
        games.add("Call of Duty");
        games.add("Guitar Hero");
        games.add("Super Monkey Ball");

        System.out.println(games.pop());
        System.out.println(games);
        System.out.println(games.peek());


        Stack<Character> tower = new Stack<>();
        tower.add('R');
        tower.add('B');
        tower.add('Y');
        System.out.println(tower.get(1));
        System.out.println(tower.peek());
        // System.out.println(tower.stream().peek(e -> e == 'B'));
    }
}
