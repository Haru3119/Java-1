import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        int bil;
        System.out.println("Ganjil/Genap");
        System.out.println("-------------------");
        System.out.print("Masukan Bilangan = ");
        bil=input.nextInt();
        
        if (bil%2==0){
            System.out.println("Bilangan "+bil+" adalah bilangan genap");
        }else {
             System.out.println("Bilangan "+bil+" adalah bilangan ganjil");
        }
  }
}