import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;


public class DepositoTestPruebas {
	
	private DepositoCombustible dc=new DepositoCombustible(1000,500);


	@Test
	public void getDepositoNivel() {
		assertEquals(500.0,dc.getDepositoNivel());
		
	}
	
	@Test
	public void getDepositoMax() {
		assertEquals(1000.0,dc.getDepositoMax());
		
	}
	
	
	
	@Test
	public void estaVacio() {
		assertEquals(false,dc.estaVacio());
		
	}
	
	
	@Test
	public void mitadCapacidad() {
		
		assertEquals(true,dc.getDepositoNivel()==dc.getDepositoMax()/2);
		
	}
		

}