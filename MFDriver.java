public class MFDriver {
    
    public static void main( String[] args ) {

	double[] data = new double[100];
	int i = 0;
	
	for ( int n = 1000; n < 10000; n += 100 ) {
	    
	    double a = System.currentTimeMillis();	     

	    MatrixFinder woosuk = new MatrixFinder(n);
	    woosuk.find( n * (n-1) );

	    double b = System.currentTimeMillis();

	    data[i] = (b-a);
	    i++;
       	}

	for (int l = 0; l < i; l++) {
	    System.out.println(data[l]);
	}
    }
}
