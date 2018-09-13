

public class Vetor {
    double x, y, z;
    
    Vetor(double x1, double y1, double z1) {
    	x = x1;
    	y = y1;
    	z = z1;
    }
    
    public double normaEuclideana() {
    	double resultEuclides = 0;
    	
    	resultEuclides = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2));  
    	
    	return resultEuclides;
    }
    public double normaManhattan() {
    	double resultManhattan = 0;
    	
    	resultManhattan = Math.abs(x) + Math.abs(y) + Math.abs(z);
    	return resultManhattan;
    }
    
    public double normaChebychev() {
    	double maiorChebychev = x;
    	if(y > maiorChebychev)
    		maiorChebychev = y;    
        if(z > maiorChebychev)
        	maiorChebychev = z;
        return maiorChebychev;
    }
    
}
