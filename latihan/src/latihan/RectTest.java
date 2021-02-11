package latihan;

/**
 *
 * @author DIVANA
 */
public class RectTest extends rect {

    public static void main(String[] args) {
        rect u = new rect();
        rect t = new rect();
        t.move(1, 1);
        int x1 = t.x1;
        int x2 = t.x2;
        int y1 = t.y1;
        int y2 = t.y2;
        
        System.out.println("Awali [" + x1 + "," + y1 + ";" + x2 + "," + y2 + "]");
        rect utama = new rect(x1, y1, x2, y2);
        System.out.println("<" + "2,3" + "> inside the union = " + utama.isInside(2, 3));
        
        rect akhir = new rect(2, 3, 5, 6);
        u = utama.union(akhir);
        x1 = u.x1;
        x2 = u.x2;
        y1 = u.y1;
        y2 = u.y2;

        System.out.println("(1,1,4,4) union (2,3;5,6) = [" + x1 + "," + y1 + ";" + x2 + "," + y2 + "]");
        u = utama.intersection(akhir);
        x1 = u.x1;
        x2 = u.x2;
        y1 = u.y1;
        y2 = u.y2;
        System.out.println("[1,1,4,4] intereaction [2,3;5,6] = [" + x1 + "," + y1 + ";" + x2 + "," + y2 + "]");
    }
}
