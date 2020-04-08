/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pert_2_rekursif;

/**
 *
 * @author mumta
 */
public class DrawingRuler {

    public static void drawOneTick(int tickLength) {
        drawOneTick(tickLength, -1);
    }

    public static void drawOneTick(int tickLength, int tickLabel) {
        for (int i = 0; i < tickLength; i++) {
            System.out.print("-");
        }
        if (tickLabel >= 0) {
            System.out.print(" " + tickLabel);
        }
        System.out.print("\n");
    }

    public static void drawTicks(int tickLength) {
        if (tickLength > 0) {
            drawTicks(tickLength - 1);
            drawOneTick(tickLength);
            drawTicks(tickLength - 1);
        }
    }

    public static void drawRuler(int nInches, int majorLength) {
        drawOneTick(majorLength, 0);
        for (int i = 1; i <= nInches; i++) {
            drawTicks(majorLength - 1);
            drawOneTick(majorLength, i);
        }
    }

    public static void main(String[] args) {
        drawRuler(5, 4);

    }
}
