import java.util.*;
import java.util.Random;
class Sarkofaga2 extends Sarkofaga{
     private int pregnancy=2;//guroi pou xreiazetai na perasoun gia na genisei.
     private boolean flag=true;
     private int i=0;
     private int steps=3;//kelia pou kounietai to zwo. 
         public int pregnancy(){
        return pregnancy;
    }
       private int food=4;//guroi pou  antexei xwris trofh.
        public int food(){
        return food;
    }
    
       public int steps(){
        return steps;
    }
    
                public Sarkofaga2 (int life,int hunger,int z,int k,int f ,int i){
        super(life,hunger,z,k,f,i);
    }
    
}