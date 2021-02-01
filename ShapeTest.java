package main.java.ModuleSeven.HomeWork;

public class ShapeTest {

    public static void main(String[] args) {
        Main figure = new Main();

        //Circle
        figure.print(new Main.Circle());

        //Quad
        figure.print(new Main.Quad());

        //Qube
        figure.print(new Main.Qube());

        //Rhombus
        figure.print(new Main.Rhombus());

        //Triangle
        figure.print(new Main.Triangle());
    }
}

class Main {
    static abstract class Shape {
        abstract String getName();
    }

    public void print(Shape shape) {
        System.out.println(shape.getName());
    }

     static class Circle extends Shape {
        @Override
        String getName() {
            return "Circle";
        }
    }

    static class Quad extends Shape {
        @Override
        String getName() {
            return "Quad";
        }
    }

    static class Qube extends Shape {
        @Override
        String getName() {
            return "Qube";
        }
    }

    static class Triangle extends Shape {
        @Override
        String getName() {
            return "Triangle";
        }
    }

    static class Rhombus extends Shape {
        @Override
        String getName() {
            return "Rhombus";
        }
    }

}
