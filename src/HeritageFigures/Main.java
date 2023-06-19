package HeritageFigures;

public class Main {
    public static void main(String[] args) {
        for(Color colors : Color.values()){
            System.out.println(colors.name());
            System.out.println(colors.getColor());
            System.out.println(colors);

        }
        Shape myTriangle = new Triangle(5, 0, 3, 1, 1, 8);
        Shape myTriangle1 = new Triangle(5, 0, 3, 1, 1, 8);


        Shape myCircle = new Circle(7,3,0,-5);
        Shape myCircle1 = new Circle(7,3,0,-5);


        Shape myRectangle = new Rectangle(3, 4, 5, 8, 4, 3, 2, 1, "Прямокутник");
        Shape myRectangle1 = new Rectangle(3, 4, 5, 8, 4, 3, 2, 1, "Інший прямокутник");

        Shape[] arrayOfShapes = { myCircle, myRectangle, myTriangle};
        for (Shape arrayOfShape : arrayOfShapes) {
            if(arrayOfShape == myTriangle) {
                arrayOfShape.paint(Color.Блакитний, myTriangle);
            }else if(arrayOfShape == myCircle) {
                arrayOfShape.paint(Color.Червоний, myCircle);
            } else  arrayOfShape.paint(Color.Чорний, myRectangle);

//         Закоментувала цю частину коду для чистоти результату
//            System.out.println("Equals для трикутника: " + myTriangle.equals(myTriangle));
//            System.out.println("Equals для трикутника та кола: " + myTriangle.equals(myCircle));
//            System.out.println("Equals для прямокутника: " + myRectangle.equals(myRectangle));
//            System.out.println("Equals для прямокутника з різними назвами: " + myRectangle.equals(myRectangle1));
//            System.out.println("Equals для кола: " + myCircle.equals(myCircle1));
//            System.out.println("Equals для кола та прямокутника : " + myCircle.equals(myRectangle) + "\n");
//            System.out.println("Hashcode Трикутника: " + myTriangle.hashCode());
//            System.out.println("Hashcode Прямокутника: " + myRectangle.hashCode());
//            System.out.println("Hashcode Кола: " + myCircle.hashCode());
        }
    }
}
