package latihan;

public class triangle extends shape{
    private int base;
    private int height;
    
    public triangle(String color,int base, int height) {
        super(color);
        this.base=base;
        this.height=height;
    }
    public String toString(){
        return "triagle[base = " +base+ " height = " +height+ " ," +super.toString()+ "]";
    }
    public double getArea(){
        return 0.5*base*height;
    }
}
