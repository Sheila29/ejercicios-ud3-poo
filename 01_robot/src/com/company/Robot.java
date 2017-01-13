package com.company;


public class Robot {


    private int x = 0;
    private int y = 0;

    public Robot(){

    }

    public Robot(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void mover(int dx, int dy) {

        if (dx < 10 && dy < 10 && dx > -10 && dy > -10) {
            if (dx == x && dy == y + 1) {
                y += 1;
            }

            if (dx == x + 1 && dy == y) {
                x += 1;

            }

            if (dx == x && dy == y - 1) {
                y -= 1;
            }

            if (dx == x - 1 && dy == y) {
                x -= 1;
            }
        }

    }



    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


}
