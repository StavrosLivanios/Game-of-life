import java.util.*;
abstract class Futofaga extends Animals{
 private int i;
 private boolean flag;
 abstract int food();
 abstract int steps();
 abstract int pregnancy();
 public Futofaga (int life,int hunger,int z,int k,int f ,int i){
        super(life,hunger,z,k,f,i);
 }

 public void eat(int pos1,int pos2,String map[][],int x,int y,boolean plants[][],ArrayList<Animals> al,int metrf1,int metrf2){
   i=0;
   flag=true;
   boolean flag0=false;
  if (i<al.size()){ 
   if(plants[pos1][pos2]==true && flag0==false ){//Elegxei an to keli auto periexei futo kai an to flag0 einai false.
      plants[pos1][pos2]=false;
      map[pos1][pos2]="  ";
      while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                al.get(i).hunger(0);
                flag=false;
            }
       i++;
          }
      flag0=true;
   }
   if (pos1+1<x && flag0==false){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka kai an to flag0 einai false.
        if(plants[pos1+1][pos2]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
          plants[pos1+1][pos2]=false;
          map[pos1+1][pos2]="  ";
          i=0;
          while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
            }
            i++;          
          }
          flag0=true;
        }
    }
   if (pos1+1<x && pos2+1<y && flag0==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag0 einai false.
      if(plants[pos1+1][pos2+1]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
         plants[pos1+1][pos2+1]=false;
         map[pos1+1][pos2+1]="  ";
         i=0;
         while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
                }
            i++;        
         }
         flag0=true;
      }
   }
   if (pos2+1<y && flag0==false){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka kai an to flag0 einai false.
         if(plants[pos1][pos2+1]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
          plants[pos1][pos2+1]=false;
          map[pos1][pos2+1]="  ";
          i=0;
          while(flag==true){
             if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
             }
            i++;
          }
          flag0=true;
         }
   }
   if (pos1-1>0 && pos2+1<y && flag0==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag0 einai false.
      if(plants[pos1-1][pos2+1]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
         plants[pos1-1][pos2+1]=false;
         map[pos1-1][pos2+1]="  ";
         i=0;
         while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
            }
            i++;
         }
         flag0=true;
      }
   }
   if (pos1-1>0 && flag0==false){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka kai an to flag0 einai false.
         if(plants[pos1-1][pos2]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
          plants[pos1-1][pos2]=false;
          map[pos1-1][pos2]="  ";
          i=0;
          while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
                }
            i++;    
          }
          flag0=true;
            }
   }
   if (pos1-1>0 && pos2-1>0 && flag0==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag0 einai false.
         if(plants[pos1-1][pos2-1]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
          plants[pos1-1][pos2-1]=false;
          map[pos1-1][pos2-1]="  ";
          i=0;
          while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
                }
            i++;
          }
          flag0=true;
         }
   }
   if (pos2-1>0 && flag0==false){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka kai an to flag0 einai false.
         if(plants[pos1][pos2-1]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
          plants[pos1][pos2-1]=false;
          map[pos1][pos2-1]="  ";
          i=0;
          while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
            }
            i++;
          }
          flag0=true;
         }
   }
   if (pos1+1<x && pos2-1>0 && flag0==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag0 einai false.
        if(plants[pos1+1][pos2-1]==true){//Elegxei an to keli auto periexei futo kai to afairoume apo ton pinaka.
         plants[pos1+1][pos2-1]=false;
         map[pos1+1][pos2-1]="  ";
         i=0;
         while(flag==true){
            if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){//Elegxei an uparxei sthn lista antikeimeno me tis arxikes suntetagmenes kai mhdenizei tous gurous pou exei na faei.
                 al.get(i).hunger(0);
                 flag=false;
                }
            i++;
         }
         flag0=true;
        }
   }
   if (flag0==false){
          
        i=0;
        flag=false;
        //Elegxei an uparxei sthn lista antikeimeno me autes tis suntetagmenes kai auksanei tous gurous pou exei na faei.
        while(i<al.size() || flag==false){
              if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){
                  flag=true;
              }
              i++;
        }          
                        
        al.get(i-1).hunger( al.get(i-1).gethunger()+1);
        
        //Elegxei an oi guroi pou exei na faei isounte me tous gurous pou antexei xwris trofh.             
        if( al.get(i-1).gethunger()==al.get(i-1).food()){
             if (al.get(i-1).geti()==1 && al.get(i-1).getf()==2 ){
                 setdeathfoodf1(getdeathfoodf1()+1);
                  metrf1--;
             }
             else if(al.get(i-1).geti()==2 && al.get(i-1).getf()==2 ){
                      setdeathfoodf2(getdeathfoodf2()+1);
                      metrf2--;
             }
             al.remove(i-1);//afaireitai to sigekrimeno stoixeio(futofago) apo thn lista.
        }
              
   }
  }
 }
}