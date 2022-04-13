import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    System.out.println("Menghitung Bilangan 1 sampai n bilangan");
     System.out.println("________________________________________________");
    
     int n;
     int hasil = 0;

     Scanner x = new Scanner(System.in);
     System.out.print("Masukan banyak bilangan = ");
     n = x.nextInt();

     for (int i=1; i<=n; i++)
     hasil += i;
     System.out.println("Jumlah bilangan = " + hasil);
  }
}