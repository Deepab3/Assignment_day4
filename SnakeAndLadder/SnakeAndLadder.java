package com.SnakeAndLadder;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class SnakeAndLadder {

    static int playerPosition1 = 0;
    static int playerPosition2 = 0;
    static final int NO_PLAY = 1;
    static final int LADDER = 2;
    static final int SNAKE = 3;
    static final int INITIAL_POSITION = 0;
    static final int FINAL_POSITION = 100;

    private static int dieRoll() {
        int dievalue = (int) (Math.random() * 10 % 6) + 1;
        return dievalue;
    }

    private static int getOption() {
        int option = (int) (Math.random() * 10 % 3) + 1;
        return option;
    }

    public static void main(String[] args) {

        int dieCount = 0;
        int chance = 0;
        while (playerPosition1 < FINAL_POSITION && playerPosition2 < FINAL_POSITION) {
            int dievalue = dieRoll();
            dieCount++;
            System.out.println("Die:" + dievalue);
            int option = getOption();
            System.out.println("Option:" + option);
            if (chance % 2 == 0) {
                switch (option) {
                    case NO_PLAY:
                        System.out.println("No Play");
                        break;
                    case LADDER:
                        if (playerPosition2 + dievalue <= FINAL_POSITION)
                            playerPosition2 = playerPosition2 + dievalue;
                        break;
                    case SNAKE:
                        if (playerPosition2 - dievalue < INITIAL_POSITION)
                            playerPosition2 = 0;
                        else
                            playerPosition2 = playerPosition2 - dievalue;
                        break;
                    default:
                        System.out.println("Wrong option");
                }
                        System.out.println("Position:" + playerPosition2);
                    if(playerPosition2 == FINAL_POSITION)
                    System.out.println("Player 2 won the game!!") ;
                }
            else{
                    switch (option) {
                        case NO_PLAY:
                            System.out.println("No Play");
                            break;
                        case LADDER:
                            if (playerPosition1 + dievalue <= FINAL_POSITION)
                                playerPosition1 = playerPosition1 + dievalue;
                            break;
                        case SNAKE:
                            if (playerPosition1 - dievalue < INITIAL_POSITION)
                                playerPosition1 = 0;
                            else
                                playerPosition1 = playerPosition1 - dievalue;
                            break;
                        default:
                            System.out.println("Wrong position");
                    }
                    System.out.println("Position Player 1:" + playerPosition1);
                    if(playerPosition1 == FINAL_POSITION)
                        System.out.println("Player 1 won the game!!") ;
                }
                chance++;
            }
            System.out.println("Dice Count:" + dieCount);
        }
}


