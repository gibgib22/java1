package latihan;

public class line implements relation {

    private double x1;
    private double x2;
    private double y1;
    private double y2;

     line(double x1, double x2, double y1, double y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public double getLenght() {
        double length = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        return length;
    }

    public boolean isGreater(Object a, Object b) {
        double alen = ((line) a).getLenght();
        double blen = ((line) b).getLenght();
        return (alen < blen);
    }

    public boolean isLess(Object a, Object b) {
        double alen = ((line) a).getLenght();
        double blen = ((line) b).getLenght();
        return (alen > blen);
    }

    public boolean isEqual(Object a, Object b) {
        double alen = ((line) a).getLenght();
        double blen = ((line) b).getLenght();
        return (alen == blen);
    }

    public static void main(String[] args) {
        line div = new line(1, 2, 3, 4);
        line div2 = new line(10, 7, 8, 9);
        
        div.getLenght();
        div2.getLenght();
        div.isGreater(div, div2);
        div.isLess(div, div2);
        div.isEqual(div, div2);

        System.out.println("A : " +div.getLenght());
        System.out.println("B : " +div2.getLenght());
        System.out.println("A Lebih besar dari B : "+div.isGreater(div, div2));
        System.out.println("A Lebih kecil dari B : "+div.isLess(div, div2));
        System.out.println("A Sama dengan B : "+div.isEqual(div, div2));
    }
}
