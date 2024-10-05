class ABC {
	ABC() {
		System.out.println( "Object is created." );
	}
}

class XYZ  {
	XYZ() {
		System.out.println( "Object is created." );
	}
}

public class OpInstanceOf {
	public static void main( String args[ ] ) {
		ABC a = new ABC();
        XYZ b = new XYZ();


		if( a  instanceof  ABC ) {
			System.out.println( "a is an instance of class ABC." );
		} else {
			System.out.println( "a is not an instance of class ABC." );
		}

		// if( b  instanceof  XYZ ) {
		// 	System.out.println( "a is an instance of class XYZ." );
		// } else {
		// 	System.out.println( "a is not an instance of class XYZ." );
		// }
	}
}