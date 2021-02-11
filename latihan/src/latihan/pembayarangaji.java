package latihan;

public class pembayarangaji {
    public int hitungGaji(pegawai peg){
        int uang=peg.gaji();
        if(peg instanceof direktur)
            uang+=((direktur)peg).tunjangan();
        if(peg instanceof staf)
            uang+=((staf)peg).bonus();
        return uang;
    }
     public static void main (String []args){
         pembayarangaji pg = new pembayarangaji();
         staf ali =new staf();
         direktur tony = new direktur();
         System.out.println("Gaji yang di bayarkan untuk staf =" +pg.hitungGaji(ali));
         System.out.println("Gaji yang di bayarkan untuk direktur =" +pg.hitungGaji(tony));
     }   
}
