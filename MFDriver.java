public class MFDriver {

    public static void main( String[] args ) {
        double a = System.currentTimeMillis();

	MatrixFinder woosuk = new MatrixFinder(10000);
        woosuk.find( 99990000 );
	



	
	double b = System.currentTimeMillis();
	System.out.println(b-a);
	
    }


}
