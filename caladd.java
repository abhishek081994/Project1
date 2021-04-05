public class caladd {
    public static void main(String[] args) { 
        Circle c1 = new Circle(2.5f);
       // c1.radius = 2.5f Abhishek Singh;
        Circle c2 = new Circle(3.0f);
        //c2.radius = 3.0f;
        
        System.out.println("Area of Circle 1 " + c1.findArea() + " Area of Circle2 " +c2.findArea());
    }
}
class Circle{
    public  float radius;
    public Circle(float radius){
        this.radius = radius;
    }
    public  double findArea(){
        return 3.14*radius*radius;
    }
}
