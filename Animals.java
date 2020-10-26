import java.util.*;
abstract class Animals
{
 //life = guroi pou exoun perasei xwris na exei genisei, hunger =guroi pou exei na faei 
 // z,k suntetagmenes tou zwou ston pinaka ,   f= trofh pou trone , i=eidos tou kathe zwou
 
private int life,hunger,z,k,f,i ;

public Animals (int life,int hunger,int z,int k,int f,int i){
}
//Methodos pou epistrefei posous gurous antexei xwris trofh to kathe zwo.    
abstract int food();
//Methodos pou epistrefei posoi guroi xreiazetai na perasoun gia na genisei to kathe zwo .   
abstract int pregnancy();
 //Methodos pou epistrefei posa kelia kounietai to kathe zwo. 
abstract int steps();
 
public void hunger(int r){
       hunger=r;
}
    
public void life(int e){
       life=e;
}
    
public void setposition(int a,int v){
       z=a;
       k=v;
}
    
public void setspecies(int qw,int we){
       f=qw;
       i=we;
}
//Methodos pou epistrefei tous gurous pou exoun perasei xwris na exei genisei to kathe zwo
public int getlife(){
       return life;
}
//Methodos pou epistrefei tous gurou pou exei na faei to kathe zwo    
public int gethunger(){
       return hunger;
}
//Methodoi pou epistrefoun tis suntetagmenes tou zwou ston pinaka    
public int getx(){
       return z;
}
   
public int gety(){
       return k;
}
//Methodos pou epistrefei thn trofh pou trwei to kathe zwo   
public int getf(){
       return f;
}
 //Methodos pou epistrefei to eidos tou kathe zwou   
public int geti(){
       return i;
}
// eatenfromf2=plhthos futofagwn 2 pou fagothikan.
// eatenfromf1=plhthos futofagwn 1 pou fagothikan.
// deathfoodf1=plhthos futofagwn 1 pou pethana apo thn peina.
// deathfoodf2=plhthos futofagwn 2 pou pethana apo thn peina.
// deathfoods1=plhthos sarkofagwn 1 pou pethana apo thn peina.
// deathfoodf2=plhthos sarkofagwn 2 pou pethana apo thn peina.
static int eatenfromf2=0,eatenfromf1=0,deathfoodf1=0,deathfoodf2=0,deathfoods1=0,deathfoods2=0;
   
public static void  seteatenfromf1(int a){
       eatenfromf1=a;
}
    
public  static int  geteatenfromf1(){return eatenfromf1;}
    
public static void seteatenfromf2(int a){
        eatenfromf2=a;
}
    
public static int  geteatenfromf2(){
     return eatenfromf2;
}
    
public  static void setdeathfoodf1(int a){
        deathfoodf1=a;
}
   
public static int  getdeathfoodf1(){
     return deathfoodf1;
}
   
public static void setdeathfoodf2(int a){
        deathfoodf2=a;
}
   
public static int  getdeathfoodf2(){
     return deathfoodf2;
}
   
public static void setdeathfoods1(int a){
        deathfoods1=a;
}
 
public  static int  getdeathfoods1(){
     return deathfoods1;
} 
 
public static void setdeathfoods2(int a){
         deathfoods2=a;
}
    
public  static int  getdeathfoods2(){
     return deathfoods2;
}
    
public void eat(int pos1,int pos2,String map[][],int x,int y,ArrayList<Animals> al,int metrs1,int metrs2,int metrf1,int metrf2){
}
    
public void eat(int pos1,int pos2,String map[][],int x,int y,boolean plants[][],ArrayList<Animals> al,int metrf1,int metrf2){
    
}
 

       
public void move(int pos1, int pos2, int x, int y, ArrayList<Animals> al,String map[][],boolean plants[][],int steps){
  Random rt =new Random();
  int c=0;  
  String temp;
  int rn,i=steps;
  boolean fl=true,fl2=true,fl3=true;
  //Xrhsimopoioume thn metavlhth c gia na dwsoume mexri 6 fores sthn random thn dunatothta 
 // na epileksei mia apo tis 4 kateuthinseis.
  while(fl && c<6){
    rn=rt.nextInt(4);
     if(rn==0 || rn==1){
     //Kinhsh pros ta deksia.
     if(rn==0){    
        while(fl2 && i>=0  && i<=steps && fl3){  
         if(pos1+i<x){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka.
            if(map[pos1+i][pos2]=="  " || map[pos1+i][pos2]=="x "){//Elegxei an to keli auto einai keno h' periexei futo . 
             fl2=false;
             //Allagh twn suntetagmenwn tou antikeimenou ston pinaka
             setposition(pos1+i,pos2);
             temp=map[pos1][pos2];
             map[pos1+i][pos2]=temp;
             
              if(plants[pos1][pos2]==true)
                map[pos1][pos2]="x ";
              else 
                map[pos1][pos2]="  ";
              
              fl=false;
           }
          
         }
         else{fl3=false;} 
          i--;
       }
     }
     else{
      //Kinhsh pros ta aristera.
      while(fl2 && i<=steps && i>=0 && fl3){  
        if(pos1-i>=0){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka.
           if(map[pos1-i][pos2]=="  " || map[pos1-i][pos2]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .
            //Allagh twn suntetagmenwn tou antikeimenou ston pinaka
            temp=map[pos1][pos2];  
            fl2=false;
            map[pos1-i][pos2]=temp;
            setposition(pos1-i,pos2);
            if(plants[pos1][pos2]==true)
               map[pos1][pos2]="x ";
            else 
               map[pos1][pos2]="  ";
            fl=false;
          }
          }
        else{fl3=false;} 
        i--;
      }
     }
    }
    else{
      if(rn==2){
        //Kinhsh pros ta panw.
         while(fl2 && i>=0 && i<=steps && fl3){   
             if(pos2-i>=0){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka.
            if(map[pos1][pos2-i]=="  " || map[pos1][pos2-i]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .
             fl2=false;
             //Allagh twn suntetagmenwn tou antikeimenou ston pinaka
             setposition(pos1,pos2-i);
             temp=map[pos1][pos2];
             map[pos1][pos2-i]=temp;
             
             if(plants[pos1][pos2]==true)
                 map[pos1][pos2]="x ";
            else 
                  map[pos1][pos2]="  ";
             fl=false;
           }
           
         }
         else{fl3=false;} 
         i--;
        }
       }
       else{
       //Kinhsh pros ta katw.
          while(fl2 && i<=steps && i>=0 && fl3){  
          if(pos2+i<y){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka.
            if(map[pos1][pos2+i]=="  " || map[pos1][pos2+i]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .
              fl2=false;
              //Allagh twn suntetagmenwn tou antikeimenou ston pinaka
              setposition(pos1,pos2+i);
            
              temp=map[pos1][pos2];
              map[pos1][pos2+i]=temp;
             
               if(plants[pos1][pos2]==true)
               map[pos1][pos2]="x ";
              else 
                 map[pos1][pos2]="  ";
            
              fl=false;
            }
            }
            else{fl3=false;} 
            i--;
       }
      } 
     }
    c++;
  }
 }
 
 public void birth(int pos1,int pos2,int x,int y,ArrayList<Animals> al,Animals pa[],String map[][],int metr2){
  boolean flag2=false;
  boolean flag=true;  
  int posx=0,posy=0;
  int i=0;
       
  while(flag==true){
        if (pos1==al.get(i).getx() && pos2==al.get(i).gety()){      
            flag=false;
        }
        i++;        
  }         
  i--;
    
  if(i<al.size()){   
    
    if (al.get(i).getlife()>=al.get(i).pregnancy()){
        //Elegxos twn gurwn gia na exoun na genisei to zwo.
        //Elegxos gia diathesimh thesh deksia.
        if (pos1+1<x ){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka.
               if(map[pos1+1][pos2]=="  " || map[pos1+1][pos2]=="x " ){ //Elegxei an to keli auto einai keno h' periexei futo .
                  flag2=true;
                  //apothikeush suntetagmenwn
                  posx=pos1+1;
                  posy=pos2;
               }
           } 
        //Elegxos gia diathesimh thesh katw deksia.    
        if (pos1+1<x && pos2+1<y && flag2==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag2 einai false.
            if(map[pos1+1][pos2+1]=="  " || map[pos1+1][pos2+1]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .
               flag2=true;
               //apothikeush suntetagmenwn
               posx=pos1+1;
               posy=pos2+1;
            }
        }
        //Elegxos gia diathesimh thesh katw.    
        if (pos2+1<y && flag2==false){//Elegxei an h suntetagmenh auth vrisketai entos tou pinaka kai an to flag2 einai false.
             if(map[pos1][pos2+1]=="  " || map[pos1][pos2+1]=="x "){ //Elegxei an to keli auto einai keno h' periexei futo .
                flag2=true;
                //apothikeush suntetagmenwn
                posx=pos1;
                posy=pos2+1;
             }
        }
        //Elegxos gia diathesimh thesh katw aristera.
        if (pos1-1>0 && pos2+1<y && flag2==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag2 einai false.
            if(map[pos1-1][pos2+1]=="  " || map[pos1-1][pos2+1]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .     
               flag2=true;
               //apothikeush suntetagmenwn
               posx=pos1-1;
               posy=pos2+1;
            }
        }
        //Elegxos gia diathesimh thesh aristera.
        if (pos1-1>0 && flag2==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag2 einai false.
            if(map[pos1-1][pos2]=="  " || map[pos1-1][pos2]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .     
               flag2=true;
               //apothikeush suntetagmenwn
               posx=pos1-1;
               posy=pos2;
            }
        }
        //Elegxos gia diathesimh thesh panw aristera.    
        if (pos1-1>0 && pos2-1>0 && flag2==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag2 einai false.
            if(map[pos1-1][pos2-1]=="  " || map[pos1-1][pos2-1]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .       
               flag2=true;
               //apothikeush suntetagmenwn
               posx=pos1-1;
               posy=pos2-1;
            }
        }
        //Elegxos gia diathesimh thesh panw.
        if (pos2-1>0 && flag2==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag2 einai false.
            if(map[pos1][pos2-1]=="  " || map[pos1][pos2-1]=="x "){//Elegxei an to keli auto einai keno h' periexei futo .  
               flag2=true;
               //apothikeush suntetagmenwn
               posx=pos1;
               posy=pos2-1;
            }     
        }
        //Elegxos gia diathesimh thesh panw deksia.
        if (pos1+1<x && pos2-1>0 && flag2==false){//Elegxei an oi suntetagmenes autes vriskontai entos tou pinaka kai an to flag2 einai false.
            if(map[pos1+1][pos2-1]=="  " || map[pos1+1][pos2-1]=="x "){//Elegxei an to keli auto einai keno h' periexei futo . 
               flag2=true;
               //apothikeush suntetagmenwn
               posx=pos1+1;
               posy=pos2-1;
            }
        }
        //Dhmiourgeia twn newn antikeimenwn me tis apothikeumenes suntetagmenes kai kathorismos tou eidous tous.  
        if(flag2==true ){
          metr2++;
          al.get(i).life(0);
          if (al.get(i).geti()==1 && al.get(i).getf()==1 ){
               pa[al.size()]=new Sarkofaga1(0,0,posx,posy,1,1);
               al.add(pa[al.size()]);
               al.get(al.size()-1).setspecies(1,1);
               al.get(al.size()-1).setposition(posx,posy);
          }
          else  if (al.get(i).geti()==2 && al.get(i).getf()==1 ){
                pa[al.size()]=new Sarkofaga2(0,0,posx,posy,1,2);
                al.add(pa[al.size()]);
                al.get(al.size()-1).setspecies(1,2);
                al.get(al.size()-1).setposition(posx,posy);
          }
          else if (al.get(i).geti()==1 && al.get(i).getf()==2 ){
                   pa[al.size()]=new Futofaga1(0,0,posx,posy,2,1);
                   al.add(pa[al.size()]);
                   al.get(al.size()-1).setspecies(2,1);
                   al.get(al.size()-1).setposition(posx,posy);
          }
          else  if (al.get(i).geti()==2 && al.get(i).getf()==2 ){
                    pa[al.size()]=new Futofaga2(0,0,posx,posy,2,2);
                    al.add(pa[al.size()]);
                    al.get(al.size()-1).setspecies(2,2);
                    al.get(al.size()-1).setposition(posx,posy);
          }
        }
    }
    else{//Auksish twn gurwn pou exoun perasei xwris na exei genisei.
        al.get(i).life(al.get(i).getlife()+1);
    }
  }
 }
}
