/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.model;

import br.ifes.edu.view.TelaCafe;
import br.ifes.edu.view.TelaPromocao;
import java.util.Scanner;

/**
 *
 * @author Leticia
 */
public class Promocao {
    TelaPromocao telaProm = new TelaPromocao();
    private int diaSemana;
        AbstractFactoryCafe fabricaCafe = new AbstractFactoryCafe() {

            @Override
            public Cafe criarCafe() {
                Cafe cafezinho = new Cafe();
               return cafezinho;
            }
        } ;
    
    
    public AbstractFactoryCafe promocao(int dia) {
        
        setDiaSemana(dia);
        try{
            if(getDiaSemana() == 1 || getDiaSemana() == 3 || getDiaSemana() == 5){
                //Cafe cafe = new FabricaCafe().fazerCafe("normal");
                fabricaCafe = new FabricaCafeNormal();
                float novoPreco = fabricaCafe.criarCafe().getPreco()/2;
                fabricaCafe.criarCafe().setPreco(novoPreco);
                Cafe cafeFeito = fabricaCafe.criarCafe();
                System.out.println(cafeFeito.getNome());
                System.out.println(cafeFeito.ingredientes);
            }
            if(getDiaSemana() == 2 || getDiaSemana() == 4 || getDiaSemana() == 6){
                fabricaCafe = new FabricaCafeDescafeinado();
                float novoPreco = fabricaCafe.criarCafe().getPreco()/2;
                fabricaCafe.criarCafe().setPreco(novoPreco);
                Cafe cafeFeito = fabricaCafe.criarCafe();
                System.out.println(cafeFeito.getNome());
                System.out.println(cafeFeito.ingredientes);
                
            }
            if(getDiaSemana() == 7){
                fabricaCafe = new FabricaCafeCappuccino();
                float novoPreco = fabricaCafe.criarCafe().getPreco()/2;
                fabricaCafe.criarCafe().setPreco(novoPreco);
                Cafe cafeFeito = fabricaCafe.criarCafe();
                System.out.println(cafeFeito.getNome());
                System.out.println(cafeFeito.ingredientes);
            }
            return fabricaCafe;
        }
        catch (Exception e) {
            //throw new Exception("Invalido");
        }
        return fabricaCafe;
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
