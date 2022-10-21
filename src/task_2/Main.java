package task_2;

import task_2.data.Area;
import task_2.data.Point;
import task_2.data.Rectangle;
import task_2.logic.Calculations;

public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1,2,3,4);
        Rectangle r2 = new Rectangle(-3,1,7,5);
        Area.addRect(r1);
        Area.addRect(r2);
        System.out.println(Calculations.CheckPointPosition(1,-1));
        System.out.println(Calculations.CheckPointPosition(new Point(2,7)));
    }
}
