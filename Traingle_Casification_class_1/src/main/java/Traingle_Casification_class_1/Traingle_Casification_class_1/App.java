package Traingle_Casification_class_1.Traingle_Casification_class_1;


/**
 * Hello world!
 *
 */

enum Triangle_Types {
	  equilateral, //שווה צלעות
	  isosceles, // שווה שוקיים
	  Scalene,//שונה צלעות
	  Nottriangle, 
	  ERROR
    
	} 

class TriangleClassifier {
	
	private static Triangle_Types triangle;
	
	public static void classifyTriangle(int a, int b, int c) {
			
	        
	        if (isEquilateral(a, b, c)) {
	        	triangle= Triangle_Types.equilateral;
	        }
	        else if(isIsosceles(a, b, c)) {
	        	triangle= Triangle_Types.isosceles;
	        }
	        else if(isTriangle(a, b, c)){
	        	triangle= Triangle_Types.Scalene;
	        }
	        else {
	        	triangle=Triangle_Types.Nottriangle;
	        }

	       
	    }
//האם משולש
	    private static boolean isTriangle(int a, int b, int c) {
	        return (a + b > c && a + c > b && b + c > a);
	    }
//שווה שוקיים
	    private static boolean isIsosceles(int a, int b, int c) {
	        return isTriangle(a, b, c) && (a == b || a == c || b == c) && !(a == b && a == c && b == c);
	    }    
	    	

//שווה צלעות
	    private static boolean isEquilateral(int a, int b, int c ) {
	    	return (a > 0 && b > 0 && c > 0) && (a == b && b == c);
	    }
	   
	//מחזיר את הסוג משולש    
	    public static Triangle_Types get_type() {
	    	return triangle;
	    }
}
