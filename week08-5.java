//week08_5_bubble_balloon_part2
void setup(){
  size(500, 400);
}
void draw(){
  background(204);
  ellipse(x,y-s/2,s*0.75,s);//�e��y
  if(mousePressed) s += 2;//�@����mouse�N�|�ܤj
  if(mousePressed==false && y>s) y--;
}
float x = 0, y = 0, s = 0;//��y���y�СB�j�p
void mousePressed(){
  x = mouseX;//��y���y��
  y = mouseY;
  s = 1;//��y�@�}�l�j�p�O1(�Ʀr)
}
