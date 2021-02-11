
package login;

import java.util.Scanner;

public class login2 {
    public static void main (String[]args){
        Scanner scan = new Scanner (System.in);
            String user,pass,ulang ="";
        
        do {//kondisi
            System.out.print("masukan username: ");
            user = scan.nextLine();
            System.out.print("masukan pass: ");
            pass = scan.nextLine();
            
        if (user.equals("nggituk")&& pass.equals("div")) {
            System.out.println("login berhasil"); break;
            
        } else {
            System.out.println("login gagal");
            System.out.println("silahkan login kembali");
            ulang = scan.nextLine();
            System.out.println("");
            System.out.flush();
            }
        
        } while (ulang.equals("ya")|| ulang.equals("y") || ulang.equals("Y") || ulang.equals("ok") || ulang.equals("oke"));
            System.out.println("");
            System.out.println("===Terima Kasih===");
    }
}
