package main.java.ModuleSeven.HomeWork;

public class ShapeTest {

    public static void main(String[] args) {
        Main shape = new Main();

        shape.print(new Circle());
        shape.print(new Quad());
        shape.print(new Qube());
        shape.print(new Triangle());
        shape.print(new Rhombus());
    }
}

class Main {
    public void print(Shape shape) {
        System.out.println(shape.getName());
    }
}


    abstract class Shape {
        abstract String getName();
    }

    class Circle extends Shape {
        @Override
        String getName() {
            return "Circle";
        }
    }

    class Quad extends Shape {
        @Override
        String getName() {
            return "Quad";
        }
    }

    class Qube extends Shape {
        @Override
        String getName() {
            return "Qube";
        }
    }

    class Triangle extends Shape {
        @Override
        String getName() {
            return "Triangle";
        }
    }
    class Rhombus extends Shape {
        @Override
        String getName() {
            return "Rhombus";
        }
    }


