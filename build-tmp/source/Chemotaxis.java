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

Bacteria [] colony;
int x = 250;
int y = 250;

 public void setup()   
 {     
 	
 	size(500,500);
 	colony = new Bacteria[100];
 	for (int i = 0; i < colony.length; i ++)
 	{
 		colony[i] = new Bacteria(x, y);
 		
 	}
 	
 }   
 public void draw()   
 {  
 
 	background(255,255,255);
 	
 	
 		for (int i = 0; i < colony.length; i ++)
 	{
 		
 		colony[i].move();
 		colony[i].show();
 	}
 	
 	
 	
 }  
 class Bacteria    
 {     
 	  int myColor;
 	  int myX, myY;
 	  Bacteria( int x,int y)
 	  {
 	  	 myX = x;
         myY = y;
         myColor = color ((int)(Math.random()*255));
 	  }

 	  public void move()
 	  {
 	  	myX = myX + (int)(Math.random()*3)-1;
 		myY = myY + (int)(Math.random()*3)-1;
 	  	if(myX == 500)
 	  	{
 	  		myX = myX - 1;
 	  	}
 	  	if(myX == 0)
 	  	{
 	  		myX = myX + 1;
 	  	}
 	  	if(myY == 500)
 	  	{
 	  		myY = y - 1;
 	  	}
 	  	if(myY == 0)
 	  	{
 	  		myY = myY + 1;
 	  	}

 	  }
 	  public void show()
 	  {
 	  
 	  	fill(myColor);
 	ellipse( myX, myY, 25, 25);
 
 	  }
    
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
