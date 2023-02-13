import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
    int i;
    double[] Num = new double[50];
    double media = 0;
    double soma = 0;

    Scanner scanner = new Scanner(System.in);

    for(i=0;i<50;i++) {
      System.out.print("Digite o " + (i+1) + "º número: ");
      Num[i] = scanner.nextDouble();
      soma += Num[i];
    }

    media = soma / 50;

    System.out.println("A média dos números é: " + media);
  }
}