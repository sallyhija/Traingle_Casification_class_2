package Traingle_Casification_class_1.Traingle_Casification_class_1;


/**
 * Hello world!
 *
 */
/**Sally Hiajney 206189805
 * 
 * Hiba  Akla    324006147
 */

enum Triangle_Types {
	  equilateral,
	  isosceles,
	  Scalene,
	  Nottriangle,
    ERROR
    
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static void classifyTriangle(int a, int b, int c) {
			
	        
	        if (isEquilateral(a, b, c)) {
	        	triangle= Triangle_Types.equilateral;
	        }else if(isIsosceles(a, b, c)) {
	        	triangle= Triangle_Types.equilateral;
	        }else if(isTriangle(a, b, c)){
	        	triangle= Triangle_Types.Scalene;
	        }else {
	        	
	        	triangle=Triangle_Types.Nottriangle;
	        }

	       
	    }

	    private static boolean isTriangle(int a, int b, int c) {
	    	
	       if (( b + a > c)  &&( a + c > b) && (b + c > a))
	        return isTriangle;
	    }

	    private static boolean isIsosceles(int a, int b, int c) {
	        if ((a + b > c)|| ( b + c > b) || ( b + c > a)||( a == b)||( b == c))
	        return isIsosceles;
	    }    
	    	


	    private static boolean isEquilateral(int a, int b, int c ) {
	    	if ((a + b > c)|| ( a + c > b) || (b + c > a) || (a == b)|| (b == c)|| (c == a))
	    	return isEquilateral;
	    }
	   
	    
	    public static Triangle_Types get_type() {
	    	return triangle;
	    }
}
