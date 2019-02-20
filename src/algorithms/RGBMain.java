package algorithms;

import algorithms.controller.RGBController;
import algorithms.model.RGB;

public class RGBMain {
    public static void main(String[] args) {
        RGBController rgb = new RGBController();
        RGB red = rgb.setRGB(255, 0, 0);
        RGB green = rgb.setRGB(0, 255, 0);
        RGB blue = rgb.setRGB(0, 0, 255);
        RGB yellow = rgb.setRGB(255, 255, 100);

        System.out.println("Czerwony : " + red);
        System.out.println("Zielony: " + green);
        System.out.println("Niebieski: " + blue);
        System.out.println("Zółty: " + yellow);

        System.out.println(rgb.mixColor(red,blue));
        System.out.println(rgb.mixColor(green,blue));
        System.out.println(rgb.mixColor(yellow,red));

        System.out.println("Czyszczenie koloru "+rgb.clearColor(yellow));

    }
}
