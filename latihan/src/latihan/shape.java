package latihan;

public class shape {
    private String color;
    public shape (String color){
        this.color=color;
    }
    //@Override
    public String toString(){
        return "shape[color=" + color + "]";
    }
    public double getArea(){
        System.err.println("shape unknown! Cannot cpmpute area!");
        return 0;
    }
}
