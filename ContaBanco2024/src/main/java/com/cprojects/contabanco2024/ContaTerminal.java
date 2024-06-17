package com.cprojects.contabanco2024;

import java.text.DecimalFormat;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String nomeCliente;
        String agencia;
        double saldo;
        DecimalFormat df = new DecimalFormat("#.00");
       
        System.out.println("Por favor digite o numero da sua conta: ");
        numero = Integer.parseInt(System.console().readLine());
        System.out.println("Por favor digite o numero da agencia: ");
        agencia = System.console().readLine();
        System.out.println("Por favor digite o nome do cliente: ");
        nomeCliente = System.console().readLine();
        System.out.println("Por favor digite o saldo a ser depositado:");
        saldo = df.parse(System.console().readLine()).doubleValue();
        
        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia e (" + agencia +
        "),conta ("+ numero +") e seu saldo (" + saldo + ") ja esta disponivel para saque.");
    }
}
