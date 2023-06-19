package HeritageFigures;

public class Shape {
    public Shape(){

    }
    public String color;
    public String name;

    public void calculateArea(){
        System.out.println("Цей метод вираховує площу фігури");
    }
    public void calculatePerimeter(){
        System.out.println("Цей метод вираховує периметр фігури");
    }
    public void paint(Color color, Object exp){
        this.color = color.name();
        this.name = String.valueOf(exp);
        System.out.println( this.name + ", обраний колір це  " + this.color);
    }
}
