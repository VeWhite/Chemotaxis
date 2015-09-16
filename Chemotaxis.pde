Bacteria joe;
Bacteria bob;
Bacteria jill;
Bacteria clay; 
int x = 250;
int y = 250; 
 void setup()   
 {     
 	size(500,500);
 }   
 void draw()   
 {    
 	background(0,0,0);
 	joe = new Bacteria();
 	bob = new Bacteria();
 	jill = new Bacteria();
 	clay = new Bacteria();
 	//joe.walk();
 	joe.show();
 	//bob.walk();
 	bob.show();
 	//jill.walk();
 	jill.show();
 	//clay.walk();
 	clay.show();
 	ellipse(x, y, 25, 25);
 	x = x + (int)(Math.random()*5)-1;
 	y = y + (int)(Math.random()*5)-1;
 }  
 class Bacteria    
 {     
 	  
 }    