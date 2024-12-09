ArrayList<Ball> ballGroup;
//Ball[] ballGroup;
//int pos = 0;

void setup() { // Happens once at launch
    size(1280, 720);
    background(200,200,200);
    ballGroup = new ArrayList<Ball>();
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);


  for(Ball theBall : ballGroup){
    theBall.display();
    theBall.move();
    
    
    for(Ball otherBall:ballGroup){
      theBall.checkCollision(otherBall);
    }
  }
  //old loop
    //for (int i = 0; i < ballGroup.size(); i++) {
    //    ballGroup.get(i).display();
    //    ballGroup.get(i).move();
    //}

}

void mousePressed() {
 // ballGroup[pos] = new Ball(mouseX, mouseY, 70);
    ballGroup.add(new Ball(mouseX, mouseY, 50, false));
}

void keyPressed() {
    if (key == 'c') {
        for (int i = ballGroup.size()-1; i >= 0; i--) {
            ballGroup.remove(i);
        }
    }
    
    else if (key=='j'){
      ballGroup.add(new Ball(width/2, height/2, 50, true));
    }
  
}


class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity
    int cr, cg, cb; //RGB Values
    int grav; //Gravity
    boolean infected;

    //Constructor
    Ball(int tempx, int tempy, int tempr, boolean tempinf) {
        x = tempx; //set the x cord
        y = tempy; //set the y cord
        r = tempr; //set the radius
        
        infected = tempinf;
        
        

        //Set the colour
        cr = int( random(0,255));
        cg = int( random(0,255));
        cb = int( random(0,255));

        //Set Velocity & Gravity
        dx = int( random(-10,10));
        dy = int( random(-10,10));
        grav = 0;
    }

    void display() {
      //infection properties
      if(infected == true){
       cr = 255;
       cg = 0;
       cb = 0;
      }
        fill(cr, cg, cb);
        circle(x,y,r*2);
        
    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy = dy - grav;

        if (y >= height - r || y <= 0+r) {
            dy = dy * -1;
        }
        if (x >= width-r || x <= 0+r) {
            dx = dx * -1;
        }
    }
    
    void checkCollision(Ball otherBall){
      double distanceApart = dist(x,y, otherBall.x, otherBall.y);
      double threshold = r + otherBall.r;
      
      //bounce the ball
      if(distanceApart < threshold){
        //store the first velocity
        int tempdx = dx;
        int tempdy = dy;
        
       //ball 1 gets velocity 2
       dx = otherBall.dx;
       dy = otherBall.dy;
       
       //ball 2 gets velocity 1
       otherBall.dx = tempdx;
       otherBall.dy = tempdy;
       
       //pass the infection
       if(otherBall.infected == true){
        infected = true; 
       }
       
       else if (otherBall.infected == false && infected == true){
         otherBall.infected = true;
       }
      }
    }
    
    
    
}
