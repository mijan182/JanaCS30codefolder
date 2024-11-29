Ball redball;

//happens once at launch
void setup() {
    size(1280,720);
    background(200,200,200);
    redball = new Ball();
}

//happens constantly(screen refresh)
void draw(){
    background(200,200,200);
    redball.display();
    redball.move();
}

class Ball{
    int x,y,r;

    //constructor
    Ball(){
        x = 300;
        y = 300;
        r = 100;

    }
    void display(){
        circle(x,y,r*2);
    }
    void move(){
        if (y <= height-r){
            y++;
            x++;
        }
    }
}
