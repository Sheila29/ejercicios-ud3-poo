package com.company;


public class Robot {


    private int x = 0;
    private int y = 0;

    public void mover(int x, int y){

        if ( x == 1 && y == 0){
            this.x +=1;
        }
        if ( x == -1 && y == 0){
            this.x -=1;
        }
        if ( x == 0 && y == 1){
            this.y +=1;
        }
        if ( x == 0 && y == -1){
            this.y -=1;
        }

        System.out.println("X: "+this.x+" Y: "+this.y);
    }
}
