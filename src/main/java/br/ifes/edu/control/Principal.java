/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifes.edu.control;

import br.ifes.edu.model.Cafe;
import br.ifes.edu.model.FabricaCafe;
import br.ifes.edu.model.Promocao;
import br.ifes.edu.view.TelaCafe;
import br.ifes.edu.view.TelaPromocao;

/**
 *
 * @author 20111bsi0161
 */
public class Principal {
    
    public static void main(String [] args)throws Exception{
        //MAIN QUANDO HOUVER PROMOCAO
        Promocao promocao = new Promocao();
        TelaPromocao telaProm = new TelaPromocao();
        telaProm.telaPromocao();
        promocao.promocao(telaProm.getDiaSemana());
        
        //CODIGO PARA QUANDO NÃO HOUVER PROMOCAO
        //FabricaCafe fabricaCafe = new FabricaCafe();
        //TelaCafe telaCafe = new TelaCafe();
        //Cafe cafe = fabricaCafe.fazerCafe(telaCafe.telaCafe());
        //System.out.println(cafe.getNome());
        //cafe.getIngredientes();
        
       
    }
    
}
