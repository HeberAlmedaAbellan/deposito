import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;



	
	@RunWith(Parameterized.class)
public class DepositoTestParametrizada{
	private double num1;
	private double num2;
	private double con;
	private double res;
		
	public DepositoTestParametrizada(double n1,double n2,double con, double r) {
			
			num1=n1;
			num2=n2;
			this.con=con;
			res=r;
		}
		@Parameters
		public static Collection<Object[]> numeros(){
			return Arrays.asList(new Object[][] {
				{1000,500,300,200},{10,5,2,3},{300,150,-5,155}
			});
		}
			
		@Test
		public void testConsumir() {
			
			
			DepositoCombustible dc=new DepositoCombustible (num1,num2);
			dc.consumir(con);
			assertEquals(res,dc.getDepositoNivel());
			
			
		}
		
		
}
		
	

