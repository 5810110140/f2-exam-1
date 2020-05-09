public class Rectangle extends Shape implements AreaCalculable{
    private double width;
    private double height;

    public Rectangle(String name, double width, double height){
        super(name);
        this.width = width;
        this.height = height;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public void zoom(double factor){
        width = width * factor;
        height = height * factor;
    }
} 