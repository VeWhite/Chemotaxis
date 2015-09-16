import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class Chemotaxis extends PApplet {

Bacteria joe;
Bacteria bob;
Bacteria jill;
Bacteria clay; 
int x = 250;
int y = 250; 
 public void setup()   
 {     
 	size(500,500);
 }   
 public void draw()   
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
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "Chemotaxis" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
