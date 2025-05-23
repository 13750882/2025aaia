//week14_5_sound
//選單 Sketch- Library = Manage Libraries...
//安裝sound後,開始寫
//選單File - Examples 選 Libraries核心函式庫Sound-Soundfile-JumbleSounfile
//再自己寫
import processing.sound.*;//Java使用Sound外掛
SoundFile music;//宣告一個變數music
void setup(){
  size(640,360); //記得要把音樂檔,拉到程式裡
  music = new SoundFile(this,"sword slash.mp3");
  music.play();//play()播放
}
void draw(){
  //裡面是空白
}
