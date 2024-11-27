Ball redball
//happens once at launch
void setup(){
    size(1280,720);
    background(200,200,200);
    redball = new Ball();
    
}

//hapensconstantly(screen refresh)
void draw(){
    background(200,200,200);
    redball.display();
    reball.move();
}


class Ball{
    int x,y,r;
    //constructor
    Ball(){
        x = 300;
        y = 300;
        

    }
    void display(){
        
    }
    void move(){
        if (y<=height-r){
            y++;
            x++;
        }
    }
}
