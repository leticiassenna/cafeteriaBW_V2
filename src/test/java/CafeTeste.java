/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.ifes.edu.model.Cafe;
import br.ifes.edu.model.FabricaCafe;
import br.ifes.edu.model.FabricaCafeCappuccino;
import br.ifes.edu.model.FabricaCafeDescafeinado;
import br.ifes.edu.model.FabricaCafeNormal;
import br.ifes.edu.model.Ingrediente;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author Leticia
 */
public class CafeTeste extends TestCase {
    
    //private FabricaCafeNormal fabricaCafeNormal;
    private FabricaCafe fabricaCafe;
    
	
    @Before
    public void before()
    {
        
        //fabricaCafeNormal = new FabricaCafeNormal();
    }

    @Test
    public void testFactoryCafeNormal() throws Exception
    {
        fabricaCafe = new FabricaCafe();
        Cafe cafe = fabricaCafe.fazerCafe("normal");
        Assert.assertSame(cafe.getNome(), new FabricaCafeNormal().criarCafe().getNome());
    }
    
    @Test
    public void testFactoryCafeCappuccino() throws Exception
    {
        fabricaCafe = new FabricaCafe();
        Cafe cafe = fabricaCafe.fazerCafe("cappuccino");
        Assert.assertSame(cafe.getNome(), new FabricaCafeCappuccino().criarCafe().getNome());
    }
    
    @Test
    public void testFactoryCafeDescafeinado() throws Exception
    {
        fabricaCafe = new FabricaCafe();
        Cafe cafe = fabricaCafe.fazerCafe("descafeinado");
        Assert.assertSame(cafe.getNome(), new FabricaCafeDescafeinado().criarCafe().getNome());
    }

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
}
