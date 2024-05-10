import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    
    // Variavel Scanner    
    Scanner input = new Scanner(System.in);
    
    //Variaveis do ususario
    String Agencia;
    String NomeDoCliente = "MARIO ANDRADE";
    int Numero = 1021;
    double Saldo = 237.48;

   // Interacao com ususario
   System.out.println("Por favor, digite o número da Agência !");
   Agencia = input.nextLine();
   //Condicionais
    if (Agencia.equals("067-8")) {
        System.out.println("Olá "+NomeDoCliente+" ,obrigado por criar uma conta em nosso banco, sua agência é "+Agencia+", conta "+Numero+ " e seu saldo "+Saldo+" já está disponível para saque");
   }else
            System.out.println("Não Localizado");
    }
}
