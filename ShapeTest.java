package main.java.ModuleSeven.HomeWork;

public class ShapeTest {

    public static void main(String[] args) {
        Shape shape = new Shape();

        shape.print(new Circle());
        shape.print(new Quad());
        shape.print(new Qube());
        shape.print(new Triangle());
    }
}


    class Shape {
        String getName(){
            return "shape";
        }


        public void print(Shape shape) {
            System.out.println(shape.getName());
        }
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


