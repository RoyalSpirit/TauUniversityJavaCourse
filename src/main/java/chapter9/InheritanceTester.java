package chapter9;

public class InheritanceTester {

    public static void main(String[] args) {

        Mother mother = new Mother();
        mother.setName("Tatiana");

        System.out.println(mother.getName() + " is a "  + mother.getGender());



//        Rectangle rectangle = new Rectangle();
//        rectangle.print();
//
//        Square square = new Square();
//        square.print("square");

//        testSquareOverride();
    }

    public static void testSquareOverride() {
        Rectangle rectangle = new Rectangle();
        rectangle.setLength(4);
        rectangle.setWidth(8);
        System.out.println(rectangle.calculatePerimeter());

        Square square = new Square();
        square.setLength(4);
        square.setWidth(4);
        System.out.println(square.calculatePerimeter());
    }

}
