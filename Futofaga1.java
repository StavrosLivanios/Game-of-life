import java.util.*;import java.util.Random;
class Futofaga1 extends Futofaga{
    private int pregnancy=3;//guroi pou xreiazetai na perasoun gia na genisei.
    private int food=2;//guroi pou  antexei xwris trofh.
    private int steps=4;//kelia pou kounietai to zwo. 
    private int i=0;
    private boolean flag=true;
                    public Futofaga1 (int life,int hunger,int z,int k,int f ,int i){
        super(life,hunger,z,k,f,i);
    }

        public int steps(){
        return steps;
    }
    
            public int pregnancy(){
        return pregnancy;
    }
    
            public int food(){
        return food;
    }
    
}