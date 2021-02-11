package luassegtiga;
import java.util.Scanner;
public class Luassegtiga {
    public static void main(String[] args) {
       //deklarasi
       double luas;
       int alas, tinggi;
       
       //membuat Scanner baru
       Scanner baca = new Scanner (System.in);
       
       //input
      System.out.println("== program hitung luas segitiga ==");
      System.out.print("input alas=");
      alas = baca.nextInt();
      System.out.print(" input tinggi = ");
      tinggi = baca.nextInt();
      
      //proses
      luas = Double.valueOf((alas*tinggi)/2);
      
      //output
      System.out.println("luas = " +luas );
      
   
    }
    
}
