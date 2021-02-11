package latihan;

public class rectangle extends shape{
    private int length;
    private int width;
    
    public rectangle(String color,int length,int width) {
        super(color);
        this.length=length;
        this.width=width;
    }
    public String toString(){
        return "rectangle[length = " + length + " width = " + width + " ," + super.toString() + "{";
    }
    public double getArea() {
        return length*width;
    }
}
