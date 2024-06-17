import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String nomeCliente;
        String agencia;
        DecimalFormat saldo;
        System.out.println("Por favor digite o numero da sua conta: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor digite o numero da agencia: ");
        agencia = System.console().readLine();
        System.out.println("Por favor digite o nome do cliente: ");
        nomeCliente = System.console().readLine();
        System.out.println("Por favor digite o saldo a ser depositado:");
        
        saldo = new DecimalFormat (System.console().readLine());
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
        ",conta"+ numero +" e seu saldo " + saldo.format(saldo) + " já está disponivel para saque.");
    }
}