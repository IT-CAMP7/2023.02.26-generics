package pl.camp.it.generics;

import java.util.*;

public class App {
    public static void main(String[] args) {
        Box<Integer> box = new Box<>();
        box.setValue(10);

        int x = box.getValue();

        System.out.println(box.getValue());

        Box<String> stringBox = new Box<>();
        stringBox.setValue("ABC");

        System.out.println(stringBox.getValue());

        String s = stringBox.getValue();

        TestBox testBox = new TestBox();
        testBox.setValue(15);
        int x2 = (int) testBox.getValue();
        System.out.println(testBox.getValue());

        testBox.setValue("kjashdtgf");
        String s2 = (String) testBox.getValue();
        testBox.setValue(true);
        boolean b = (boolean) testBox.getValue();

        Triplet<Integer, Boolean, String> triplet = new Triplet<>();

        triplet.setFirst(10);
        triplet.setSecond(true);
        triplet.setThird("ABC");

        Triplet<Double, Float, Character> triplet2 = new Triplet<>();

        Figure f = new Circle();
        //Box<Figure> figureBox = new Box<Circle>();
        Optional<Circle> optionalInteger = Optional.empty();
        genericMethod(optionalInteger);

        Box<?> box10 = generateBox(4);

        box10.setValue(null);
    }

    public static void genericMethod(Optional<? extends Figure> o) {

    }

    public static <T extends Figure> void genericMethod2(T x) {

    }

    public static Box generateBox(int a) {
        return switch (a) {
            case 1 -> new Box<Figure>();
            case 2 -> new Box<String>();
            default -> new Box<Integer>();
        };
    }
}
