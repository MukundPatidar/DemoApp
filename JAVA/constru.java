// class A{
//     private double r;

//     A(){
//         r = 0.0;
//     }

//     A(double redius){
//         this.r = redius;
//     }

//     double area(){
//         return 3.14 * r * r;
//     }
// }

class constru {
    public static void main( String args[] ) {
		System.out.println( "AAA" );
		funTest();
		System.out.println( "DDD" );
	}
	
	public static void funTest() {
		int a = 10;
		System.out.println( "BBB" );
		if( a == 10 )
			// System.exit(1);
            return;
		System.out.println( "CCC" );
	}
}