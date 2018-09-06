
/*Nome: Henrique Borges de Almeida Filho
 * 2. Vetores em R
3: cálculo de normas de Manhattan,
Euclideana e de Chebyshev
- Bônus: generalize para R
n(para qualquer n)*/
import java.util.*;

public class Vetor {
    double x, y, z;
    
    Vetor(double x1, double y1, double z1) {
    	x = x1;
    	y = y1;
    	z = z1;
    }
    
    public double normaManhattan() {
    	double manhattan = 0;
    	
    	manhattan = Math.abs(x) + Math.abs(y) + Math.abs(z);
    	return manhattan;
    }
    
    public double normaEuclideana() {
    	double euclides = 0;
    	
    	euclides = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));  
    	return euclides;
    }
    
    public double normaChebychev() {
    	double chebychev = x;
    	if(y > chebychev)
    		chebychev = y;    
        if(z > chebychev)
        	chebychev = z;
        return chebychev;
    }
    
}
