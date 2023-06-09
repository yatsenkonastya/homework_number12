package HeritageFigures;

public class Shape {
    public Shape(){

    }
    public String color;

    public void calculateArea(){
        System.out.println("Цей метод вираховує площу фігури");
    }
    public void calculatePerimeter(){
        System.out.println("Цей метод вираховує периметр фігури");
    }
    public void paint(String color){
        this.color = color;
        System.out.println("Обраний колір " + this.color);
    }
}
