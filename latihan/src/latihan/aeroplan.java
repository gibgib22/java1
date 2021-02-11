package latihan;

public class aeroplan extends vehicle{
    public void walk(){
        System.out.println("Aeroplan is Flying");
    }
    public static void main (String[]args){
        aeroplan i = new aeroplan();
        i.function();
        i.fuel();
        i.walk();
    }
}