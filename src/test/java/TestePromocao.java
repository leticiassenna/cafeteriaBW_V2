
import br.ifes.edu.model.AbstractFactoryCafe;
import br.ifes.edu.model.Cafe;
import br.ifes.edu.model.FabricaCafe;
import br.ifes.edu.model.FabricaCafeCappuccino;
import br.ifes.edu.model.FabricaCafeDescafeinado;
import br.ifes.edu.model.FabricaCafeNormal;
import br.ifes.edu.model.Promocao;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Leticia
 */
public class TestePromocao  extends TestCase{
    
    //private FabricaCafeNormal fabricaCafeNormal;
    private FabricaCafe fabricaCafe;
    private Promocao promocao = new Promocao();
    //private AbstractFactoryCafe absFactoryCafe;
    
	
    @Before
    public void before()
    {
        
        //fabricaCafeNormal = new FabricaCafeNormal();
    }

    @Test
    public void testPromocao() throws Exception
    {
        
        Cafe cafe = promocao.promocao(1).criarCafe();
                
        Assert.assertSame(cafe.getNome(), new FabricaCafeNormal().criarCafe().getNome());
       
    }
   

    // TODO add test methods here. The name must begin with 'test'. For example:
    // public void testHello() {}
    
}
