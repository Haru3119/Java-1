import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int Bilangan[] = new int[100];
    int max=0, A=0, B=0, Tertinggi=0;

    System.out.print("Masukan Bilangan : ");
    int in = input.nextInt();

    for(int x=1; x<=in; x++){
      System.out.print("Bilangan ke-"+x+":");
      Bilangan[x]=input.nextInt();
    }

    System.out.print("\nJadi Bilangan = ");
    for(int x=1; x<=in; x++){
      System.out.print(Bilangan[x]+" ");
    }

    for(int x=1; x<=in; x++){
      if (Bilangan[x]>Tertinggi){
        Tertinggi=Bilangan[x];
      }
    }System.out.println("\n\nBilangan Terbesar Adalah : "+Tertinggi);
  }
}