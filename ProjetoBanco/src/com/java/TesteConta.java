package com.java;

public class TesteConta {

    public static void main(String[] args) {

        Conta contaCorrente = new Conta();
        Conta contaPoupança = new Conta();
        Conta contaInvestimento = new Conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 20.5;
        contaCorrente.cliente.nome = "Igor";
        contaCorrente.cliente.idade = 20;

        contaPoupança.numero = 22;
        contaPoupança.saldo = 30;
        contaPoupança.cliente.nome= "Fulano";
        contaPoupança.cliente.idade= 21;

        contaInvestimento.numero = 33;
        contaInvestimento.saldo = 40;
        contaInvestimento.cliente.nome = "Ciclano";
        contaInvestimento.cliente.idade = 22;

        System.out.println(contaCorrente.numero);
        System.out.println(contaCorrente.saldo);
        System.out.println(contaCorrente.cliente.nome);
        System.out.println(contaCorrente.cliente.idade);
    }
}
