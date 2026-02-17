import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Calculator calculator = new Calculator();
    
    while (true) {
      boolean kondisi = true;
      System.out.print("Masukkan Angka Ke-1: ");
      int numA = input.nextInt();
      System.out.print("Masukkan Angka Ke-2: ");
      int numB = input.nextInt();
      while (kondisi) {
        System.out.println("======Pilih======");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. Masukkan Ulang Angka");
        System.out.println("6. Keluar");
        System.out.print("Masukkan Pilihan: ");
        int select = input.nextInt();
        if (select == 1) {
          System.out.println("Hasil Penjumlahan: " + calculator.add(numA, numB));
        }else if(select == 2){
          System.out.println("Hasil Penjumlahan: " + calculator.sub(numA, numB));
        }else if(select == 3){
          System.out.println("Hasil Penjumlahan: " + calculator.multiple(numA, numB));
        }else if(select == 4){
          System.out.println("Hasil Penjumlahan: " + calculator.divison(numA, numB));
        }else if(select == 5){
          kondisi = false;
        }else if(select == 6){
          System.out.println("Program Selesai");
          input.close();          
          return;
        }else{
          System.out.println("Pilihan tidak di temukan");
        }
      }

    }
  }

}
