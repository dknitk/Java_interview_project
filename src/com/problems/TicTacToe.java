package com.problems;

import java.util.*;

public class TicTacToe {
    static List<Integer> playerPositions = new ArrayList<>();
    static List<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args) {

        // Tic Tac toe Game Board
        char[][] gameBoard = {
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}
        };
        printBoard(gameBoard);
        while(true){
            // Player Execution
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your Placement (1-9):");
            int playerPos = scanner.nextInt();
            while (playerPositions.contains(playerPos) || cpuPositions.contains(playerPos)) {
                //System.out.println("Position Taken! Enter a correct position.");
                playerPos = scanner.nextInt();
            }
            placePiece(gameBoard,playerPos,"player");
            String result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                printBoard(gameBoard);
                break;
            }
            //printBoard(gameBoard);
            // CPU Execution
            System.out.println();
            Random random = new Random();
            int cpuPos = random.nextInt(9) + 1;
            while (playerPositions.contains(cpuPos) || cpuPositions.contains(cpuPos)) {
                //System.out.println("Position Taken! Enter a correct position.");
                cpuPos = random.nextInt(9) + 1;
            }
            placePiece(gameBoard,cpuPos,"cpu");
            printBoard(gameBoard);
            result = checkWinner();
            if(result.length() > 0){
                System.out.println(result);
                printBoard(gameBoard);
                break;
            }
        }
    }

    private static void printBoard(char[][] gameBoard){
        for(char[] row : gameBoard){
            for(char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    private static void placePiece(char[][] gameBoard, int pos, String user){

        char symbol = ' ';
        if (user.equals("player")){
            symbol = 'X';
            playerPositions.add(pos);
        }else{
            symbol = 'O';
            cpuPositions.add(pos);
        }
        switch(pos){
            case 1:
                gameBoard[0][0] = symbol;
                break;

            case 2:
                gameBoard[0][2] = symbol;
                break;

            case 3:
                gameBoard[0][4] = symbol;
                break;

            case 4:
                gameBoard[2][0] = symbol;
                break;

            case 5:
                gameBoard[2][2] = symbol;
                break;

            case 6:
                gameBoard[2][4] = symbol;
                break;

            case 7:
                gameBoard[4][0] = symbol;
                break;

            case 8:
                gameBoard[4][2] = symbol;
                break;

            case 9:
                gameBoard[4][4] = symbol;
                break;
            default:
                break;
        }
    }

    private static String checkWinner(){
        List topRow = Arrays.asList(1,2,3);
        List midRow = Arrays.asList(4,5,6);
        List botRow = Arrays.asList(7,8,9);

        List leftCol = Arrays.asList(1,4,7);
        List midCol = Arrays.asList(2,5,8);
        List rightCol = Arrays.asList(3,6,9);

        List cross1 = Arrays.asList(1,5,9);
        List cross2 = Arrays.asList(3,5,7);

        List<List> winning = new ArrayList<>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for(List list : winning){
            if(playerPositions.containsAll(list)){
                return "Congratulations you won!";
            }else if(cpuPositions.containsAll(list)){
                return "CPU wins! Sorry :(";
            }else if(playerPositions.size() + cpuPositions.size() == 9){
                return "CAT!";
            }
        }
        return "";
    }
}
