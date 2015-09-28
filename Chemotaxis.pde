Bacteria [] colony;
int x = 250;
int y = 250;

 void setup()   
 {     
 	
 	size(500,500);
 	colony = new Bacteria[100];
 	for (int i = 0; i < colony.length; i ++)
 	{
 		colony[i] = new Bacteria(x, y);
 		
 	}
 	
 }   
 void draw()   
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

 	  void move()
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
 	  void show()
 	  {
 	  
 	  	fill(myColor);
 	ellipse( myX, myY, 25, 25);
 
 	  }
    
 }    