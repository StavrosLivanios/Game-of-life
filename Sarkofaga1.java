import java.util.*;
import java.util.Random;
class Sarkofaga1 extends Sarkofaga{
   private int food=1;//guroi pou  antexei xwris trofh.
   private int pregnancy=7;//guroi pou xreiazetai na perasoun gia na genisei.
   private int steps=1;//kelia pou kounietai to zwo. 
   
   public int food(){
        return food;
   }
   
   public int steps(){
        return steps;
    }
    
   public int pregnancy(){
        return pregnancy;
   }
   
   public Sarkofaga1 (int life,int hunger,int z,int k,int f ,int i){
        super(life,hunger,z,k,f,i);
   }
  
}
   