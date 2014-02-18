/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import softwareengeniering2.KaffeeKochen;

/**
 *
 * @author little Dragon
 */
public class Kaffetest {
    
    public Kaffetest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
	public void test() {
		//fail("Not yet implemented");
		assertNotNull("Es gibt keine Waage", KaffeeKochen.m_Waage);
		assertNotNull("Es gibt keine KaffeFoerderschnekcke",KaffeeKochen.KaffeeFoerderschnecke);
//		assertNotNull("Es wurde keine Dosierung eingestellt",KaffeeKochen.m_Dosierung);
		assertNotNull("Es gibt keine Temperaturfuehler",KaffeeKochen.temperaturfuehler);
		assertNotNull("Es gibt keinen Wasserkacher",KaffeeKochen.Wasserkocher);
		assertNotNull("Es gibt keinen Wasserpumpe",KaffeeKochen.Wasserpumpe);
	}
	/*
	@Test(timeout=10000000)
	public void timeout() {
		KaffeeKochen.kaffeeKochen();
	}*/
}
