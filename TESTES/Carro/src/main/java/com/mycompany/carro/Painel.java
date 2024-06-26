package com.mycompany.carro;

import java.util.Date;
import java.util.Scanner;

public class Painel {

    Carro carro = new Carro(null, null, 0, 0, 0, null, null);
    Banco banco = new Banco(0, null, null, null, null, null);
    Farol farol = new Farol(null);
    Motor motor = new Motor(null, 0, 0, null);
    Pneu pneu = new Pneu(0, 0, null, null);
    Porta porta = new Porta(null, 0, null);
    SistemaEletrico sistemaEletrico = new SistemaEletrico(null, null);
    TanqueCombustivel tanqueCombustivel = new TanqueCombustivel(0, null, 0);
    Transmissao transmissao = new Transmissao(null, 0, null);

    public void teste() {
        carro.setMarca("Tesla");
        carro.setModelo("Model S Plaid");
        carro.setAno(2024);
        carro.setVelocidadeMax(322);
        carro.setPotencia(1020);
        carro.setCor("Preto");
        carro.setZeroACem(4.1);
        carro.Acelerar();

        banco.setInclinacao(8);
        banco.setAquecimento(true);
        banco.setVentilacao(true);
        banco.setMassageador(true);
        banco.setAjusteLombar(true);
        banco.setAjusteAltura(true);
        banco.ajustarAltura();

        farol.setLigado(true);

        motor.setTipoConbustive("Eletrico");
        motor.setPotencia(1020);
        motor.setCilindrada(4);
        motor.setMarca("Tesla");

        pneu.setLargura(9);
        pneu.setMarca("Pirelli");
        pneu.setPerfil("Baixo");
        pneu.setTamanho(19);

        porta.setFechada(true);
        porta.setNumeroPortas(4);
        porta.setVidroFechado(true);

        sistemaEletrico.setBateriaCarregada(true);
        sistemaEletrico.setFusivels(true);
        sistemaEletrico.ligar();
        sistemaEletrico.ligarFusivels();

        tanqueCombustivel.setCapacidade(100);
        tanqueCombustivel.setTipoCombustivel("Eletrico");
        tanqueCombustivel.setNivelCombustivel(50);
        tanqueCombustivel.abastecerCarregar();

        transmissao.setAutomatica(true);
        transmissao.setMarcha(1);
        transmissao.setTipo("Automático");

        Scanner scanner = new Scanner(System.in);
        boolean carroLigado = true; // Variável para controlar o estado do carro

        do {
            System.out.println("Deseja ligar o carro: ");
            String ligarCarro = scanner.nextLine();
            if (ligarCarro.equalsIgnoreCase("sim")) {
                
                System.out.println("Deseja fechar a porta?");
                String fecharPorta = scanner.nextLine();
                if (fecharPorta.equalsIgnoreCase("sim")) {
                    porta.fechar();
                } else {
                    System.out.println("Atenção PORTA ABERTA!");
                }
              
                banco.ajustarAltura();
                banco.ajustarLombar();
                banco.aquecer();
                motor.ligar();
                farol.ligar();
                transmissao.trocarMarcha();
                pneu.rodar();
                pneu.acelerar();
                transmissao.trocarMarcha();
            } else if (ligarCarro.equalsIgnoreCase("desligar")) {
                motor.desligar();
                carroLigado = false; // Desliga o carro e sai do loop
            } else {
                System.out.println("Comando inválido. Tente novamente.");
            }
        } while (carroLigado);

    }

}
