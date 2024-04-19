/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.carro;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author IFSul
 */
public class MainTest {
    Carro carro;
    Banco banco;
    Farol farol;
    Motor motor;
    Painel painel;
    Pneu pneu;
    Porta porta;
    SistemaEletrico sistElet;
    TanqueCombustivel tnqComb;
    Transmissao trans;
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        carro = new Carro("Model S Plaid", "Tesla", 0, 0, 0, "Black", 1.7);
        banco = new Banco(0, Boolean.TRUE, Boolean.TRUE, Boolean.FALSE, Boolean.TRUE, Boolean.TRUE);
        farol = new Farol(Boolean.TRUE);
        motor = new Motor("Elétrico", 0, 0, "Tesla");
        painel = new Painel();
        pneu = new Pneu(0, 0, "Baixo", "Pirelli");
        sistElet = new SistemaEletrico(Boolean.TRUE, Boolean.FALSE);
        tnqComb = new TanqueCombustivel(0, "Elétrico", 0);
        trans = new Transmissao("Automática", 0, Boolean.TRUE);
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
