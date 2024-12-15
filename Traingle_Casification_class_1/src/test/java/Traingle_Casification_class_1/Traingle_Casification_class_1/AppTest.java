package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;


/**Sally Hiajney 206189805
 * 
 * Hiba  Akla    324006147
 */

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	
	@Test
	public void TC1(){
		int a = 5;
        int b = 1;
        int c = 1;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
		
	    }
		
       
	@Test
	public void TC2(){
		    int a = 2;
	        int b = 4;
	        int c = 1;
	        triangle.classifyTriangle(a,b,c);
	        String expected =Triangle_Types.Nottriangle.toString();
	        String result = triangle.get_type().toString();
	        assertEquals(expected, result.toString());
       
    }
	public void TC3(){
		int a = 1;
        int b = 2;
        int c = 7;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());

    }
	
	public void TC4(){
        int a = 3;
        int b = 3;
        int c = 3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	public void TC5(){
		int a = 5;
        int b = 5;
        int c = 3;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
        
    }
	
	public void TC6(){
			int a = 7;
	        int b = 4;
	        int c = 7;
	        triangle.classifyTriangle(a,b,c);
	        String expected =Triangle_Types.isosceles.toString();
	        String result = triangle.get_type().toString();
	        assertEquals(expected, result.toString());
       
    }
	
	public void TC7(){
			int a = 3;
	        int b = 4;
	        int c = 4;
	        triangle.classifyTriangle(a,b,c);
	        String expected =Triangle_Types.isosceles.toString();
	        String result = triangle.get_type().toString();
	        assertEquals(expected, result.toString());
		 
	    }

       
	
	public void TC8(){
      
        int a = 9;
        int b = 6;
        int c = 5;
        triangle.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = triangle.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	
	
	
}  