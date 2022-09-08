import java.util.Scanner;

public class CaixaDeBanco {

  static void Depositar(float saldoDisponivel) {

    System.out.print("Digite o valor do depósito: R$ : ");
    Scanner in = new Scanner(System.in);
    float deposito;
    deposito = in.nextFloat();
    if (deposito >= 0) {
      saldoDisponivel += deposito;
    } else {
      System.out.println("Valor inválido! (valor negativo)");
    }

  }

  static void Sacar(float saldoDisponivel) { // MÉTODO SAQUE

    System.out.print("Digite o valor do saque: R$ : ");
    Scanner in = new Scanner(System.in);
    float saque;
    saque = in.nextFloat();
    if (saque >= 0) {
      if (saque <= saldoDisponivel) {
        saldoDisponivel -= saque;
      } else {
        System.out.println("Saldo indisponível.");
      }
    } else {
      System.out.println("Valor inválido! (valor negativo)");
    }

  }

  public static void main(String[] args) {

    final float SALDOINICIAL = 0.00f;
    int opcao;
    float saldoDisponivel = SALDOINICIAL;
    Scanner in = new Scanner(System.in);

    do {
      System.out.println("============ MENU ==============");
      System.out.println("1 - Depositar");
      System.out.println("2 - Sacar");
      System.out.println("3 - Saldo");
      System.out.println("4 - Sair");
      System.out.println("==========================");
      System.out.print("Digite a opção desejada: ");
      opcao = in.nextInt();
      System.out.println("==========================");

      switch (opcao) {
        case 1: // depositar
          Depositar(saldoDisponivel);
          break;
        case 2: // sacar
          Sacar(saldoDisponivel);
          break;
        case 3: // saldo
          System.out.println("Saldo: R$ : " + saldoDisponivel + " reais");
          break;
        case 4: // sair
          System.out.println("Saindo do Sistema...");
          break;
        default:
          System.out.println("Opção informada não disponível no MENU.");
          break;
      }
      System.out.print("\nAperte ENTER para continuar...");
    } while (opcao != 4);
    in.close();
  }
}