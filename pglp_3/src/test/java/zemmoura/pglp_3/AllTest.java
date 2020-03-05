package zemmoura.pglp_3;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class AllTest 
{
    Employe employe1;
    
    
    
    @Before
    public void InstanceEmploye() 
    {
    	employe1=new Employe(2400.0,"bill","zemmoura"); 
    }



    @Test
	public void afficheTest( )
   {
       
       employe1.AfficheCordonnes();
       employe1.AfficheSalaire();
      
   }


   @Test
   public void calculSalaire() {
   assertTrue(employe1.calculSalaire()==(2400.0*12));

   }







}

