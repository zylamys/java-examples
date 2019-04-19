package com.github.mousemove;

import java.awt.*;
import java.util.Random;

public class MouseMove {
    public static final int TWO_MINUTES = 120000;

    public static void main(String... args) throws Exception {
        Robot robot = new Robot();
        Random random = new Random();

        //for (int i = 0; i < 12 * 190; i++) {

        while (true) {
            PointerInfo a = MouseInfo.getPointerInfo();
            Point b = a.getLocation();
            int x = (int) b.getX();
            int y = (int) b.getY();


            robot.mouseMove(x + random.nextInt(3) - 1, y + random.nextInt(3) - 1);
            Thread.sleep(TWO_MINUTES);
            //Thread.sleep(1000);
        }
    }
}
