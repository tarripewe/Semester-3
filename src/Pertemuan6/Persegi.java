package src.Pertemuan6;


     public class Persegi {
         private int panjang;
         private int lebar;

         public int getLebar(){

             return lebar;
         }
         public void setLebar(int lebar) {
             this.lebar = lebar;
         }
         public int getPanjang() {

             return panjang;
         }
         public void setPanjang(int panjang) {

             this.panjang = panjang;
         }

         public Persegi(){
             int p = 0;
             int l = 0;
         }

         public int luas(int p, int l){
             int hitungLuas = p * l;
             return hitungLuas;
         }

         public int getLuas(){
             return luas(panjang , lebar);
         }
     }

