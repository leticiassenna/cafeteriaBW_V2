/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.view;

import java.util.Scanner;

/**
 *
 * @author Leticia
 */
public class TelaPromocao {
    private int diaSemana;
    Scanner in = new Scanner(System.in);
    
    public void telaPromocao(){
        
        System.out.println("Dia da semana: ");
        System.out.println("1 - Segunda-Feira");
        System.out.println("2 - Terca-Feira");
        System.out.println("3 - Quarta-Feira");
        System.out.println("4 - Quinta-Feira");
        System.out.println("5 - SextaFeira");
        System.out.println("6 - Sabado");
        System.out.println("7 - Domingo");
        setDiaSemana(Integer.parseInt(in.nextLine()));
       
    }

    /**
     * @return the diaSemana
     */
    public int getDiaSemana() {
        return diaSemana;
    }

    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(int diaSemana) {
        this.diaSemana = diaSemana;
    }
}
