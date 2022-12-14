package task_9;

import task_9.data.Ball;
import task_9.data.Basket;
import task_9.data.Colour;
import task_9.logic.Controller;

public class Main {
    public static void main(String[] args) {
        Basket bskt = new Basket();
        bskt.addBall(new Ball(5, Colour.BLUE,222));
        bskt.addBall(new Ball(2, Colour.WHITE,199));
        bskt.addBall(new Ball(7, Colour.BLACK,544));
        bskt.addBall(new Ball(3, Colour.BLUE,108));
        bskt.addBall(new Ball(5, Colour.BLACK,237.1));
        Controller.checkBsktWeight(bskt);
        Controller.countBalls(bskt, Colour.WHITE);



    }
}
