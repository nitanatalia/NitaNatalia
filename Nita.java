/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package nita.natalia;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class Nita {

    public static void main(String[] args) {
        System.out.println("nita natalia");
        System.out.println("operator penugasan");
        Scanner userInput = new Scanner (System.in);
        System.out.println("Gunakan angka untuk memilih opsi");
        System.out.println("1. Penambahan +=");
        System.out.println("2. Pengurangan -=");
        System.out.println("3. Pengkalian *=");
        System.out.println("4. Pembagian /=");
        System.out.println("5. Sisa bagi %=");
        
        System.out.print("input:");
        int input = userInput.nextInt();
//        OPERATOR PENUGASAN
//        PENAMBAHAN
    if (input == 1){
        System.out.println("Penambahan +=");
        System.out.println("Masukan angka Ke1");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka ke2");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1+nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    }   else{
        System.out.println("masukan nilai");
    }
    
//        PENGURANGAN
    if (input == 2){
        System.out.println("Pengurangan -=");
        System.out.println("Masukan angka Ke1");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka Ke2");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1-nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
//        PERKALIAN
    if (input == 3){
        System.out.println("Perkalian *=");
        System.out.println("Masukan angka Ke1");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka Ke2");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1*nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    }
//        PEMBAGIAN
    if (input == 4){
        System.out.println("Pembagian /=");
        System.out.println("Masukan angka Ke1");
        int nilai1 = userInput.nextInt();
        System.out.println("Masukan angka Ke2");
        int nilai2 = userInput.nextInt();
        
        int Hasil = nilai1/nilai2;
        System.out.println("Hasilnya adalah:" + Hasil);
    
        
//    }   SISA BAGI
    if (input == 5){
        System.out.println("Sisa bagi %=");
        System.out.println("Masukan angka ke1");
        int nilai7 = userInput.nextInt();
        System.out.println("Masukan angka ke2");
        int nilai8 = userInput.nextInt();
        
        int Hasill = nilai1%nilai2;
        System.out.println("Hasilnya adalah:" + Hasill);
    }
    
    
    
    
    
        System.out.println("Operator Pembanding");
     
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan angka K1: ");
        int angka1 = scanner.nextInt();
        
        System.out.print("Masukkan angka Ke2: ");
        int angka2 = scanner.nextInt();

        
        boolean Lebih_besar = (angka1 > angka2);
        boolean Lebih_kecil = (angka1 < angka2);
        boolean Sama_dengan = (angka1 == angka2);
        boolean Tidak_sama_dengan = (angka1 != angka2);
        boolean Lebih_besar_sama_dengan = (angka1 >= angka2);
        boolean LEbih_kecil_sama_dengan = (angka1 <= angka2);
        

        
        System.out.println(angka1 + " > " + angka2 + " adalah " + Lebih_besar);
        System.out.println(angka1 + " < " + angka2 + " adalah " + Lebih_kecil);
        System.out.println(angka1 + " == " + angka2 + " adalah " + Sama_dengan);
        System.out.println(angka1 + " != " + angka2 + " adalah " + Tidak_sama_dengan);
        System.out.println(angka1 + " >= " + angka2 + " adalah " + Lebih_besar_sama_dengan);
        System.out.println(angka1 + " <= " + angka2 + " adalah " + LEbih_kecil_sama_dengan);

        
        
 
        System.out.println("Operator Bitwise");
        
        
        Scanner baru = new Scanner(System.in);

        System.out.print("Masukkan angka Ke1 (bilangan bulat): ");
        int angka3 = scanner.nextInt();

        System.out.print("Masukkan angka Ke2 (bilangan bulat): ");
        int angka4 = scanner.nextInt();

        
        int And = angka3 & angka4;
        int Or = angka3 | angka4;
        int Xor = angka3 ^ angka4;
        int Negatif_kembali = ~angka3;
        int Negatif_kembali2 = ~angka4;
        int Left_shift = angka3 << angka4;
        int Right_shift = angka3 >> angka4;
        int Right_shift_unsigned = angka3 >>> angka4;


        
        System.out.println(angka3 + " & " + angka4 + " = " + And);
        System.out.println(angka3 + " | " + angka4 + " = " + Or);
        System.out.println(angka3 + " ^ " + angka4 + " = " + Xor);
        System.out.println("~" + angka1 + " = " + Negatif_kembali);
        System.out.println("~" + angka2 + " = " + Negatif_kembali2);
        System.out.println(angka3 + " << " + angka4 + " = " + Left_shift);
        System.out.println(angka3 + " >> " + angka4 + " = " + Right_shift);
        System.out.println(angka3 + " >>> " + angka4 + " = " + Right_shift_unsigned);



        
        scanner.close();
    }
    }
}
