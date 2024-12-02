//Walker Demo
/*Intro to keyboard input for movement*/

Walker joe;

void setup(){
    size(1500,700);
    joe = new Walker(width/2, height/2);
}

void draw(){
    background(255);
    joe.display();

}

void mousePressed(){

}
void keyPressed(){
    //for arrows. use 'keyCode' and UP,DOWN,ENTER,ETC.
    //for ASCII char's, use 'key' and 'a', 'w', etc.

    if(keyCode == UP||key=='w'){
        joe.move(0);
    }else if(keyCode==RIGHT|\key=='d'){
        joe.move(1);
    }else if(keyCode== DOWN||key=='s'){
        joe.move(2);
    }else if(keyCode ==LEFT|| key=='a'){
        joe.move(3);
    }

}