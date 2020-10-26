import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.Color;
public class printresults extends JFrame
{
 //dhlwsh antikeimenwn tupou jtextfield.
  private JTextField ant1;
  private JTextField ant2;
  private JTextField ant3;
  private JTextField ant4;
  private JTextField ant5;
  private JTextField ant6;
  private JTextField ant7;
  private JTextField ant8;
  private JTextField ant9;
  private JTextField ant10;
  private JTextField ant11;
  private JTextField ant12;
  private JTextField ant13;
  private int i,j;
 public printresults(String map[][],boolean plants[][],int y,int x,int turn){    //1os constructor.
    super("guros "+turn);//vazoume ton guro kai ton arithmo tou gurou ws titlo.
    setLayout(new GridLayout(x,y)); //vazoume to layout na einai grid gia na moiazei me pinaka.
    for (i=0;i<x;i++){
        for (j=0;j<y;j++){
            if (map[i][j]=="x ")
             ant1=new JTextField("  ",40);//dhmiourgoume antikeimeno kai an uparxei futo ston map den emfanizoume tpt.
             else
            ant1=new JTextField(map[i][j],40);//alliws emfanizoume oti exei o map dld eite zwo eite keno.
            ant1.setEditable(false);//to vazoume false gia na min mporei na to epeksergastei o xrhsths.
            add(ant1);
            if (plants[i][j]==true){
             ant1.setBackground(new Color(0,153,0));}//allazoume to xrwma sto backround gia ta futa prasino gia ta alla kafe.
             else{
              ant1.setBackground(new Color(102,51,0));}
              
            if (map[i][j]=="s1")//vazoume kathe zwo na grafetai me diaforetiko xrwma grammatwn analoga me to eidos tous.
            ant1.setForeground(Color.RED);
            else if (map[i][j]=="s2")
            ant1.setForeground(Color.ORANGE);
            else if (map[i][j]=="f1")
            ant1.setForeground(Color.WHITE);
            else if (map[i][j]=="f2")
            ant1.setForeground(Color.BLUE);
        }  
       }
    }
  public printresults(float fu,int turn,int deathfoodf1,int deathfoodf2,int deathfoods1,int deathfoods2,int metr,int metrs1,int metrs2,int metrf1,int metrf2,int eatenfromf2,int eatenfromf1){
      //2os constructor
     super("soixeia "+turn+" gurou");//vazoume titlo.
     setLayout(new GridLayout(0,1)); //xrhsimopoioume to idio layout alla me diaforetikes metavlhtes gia na ta grafei ola katakorufa.
     ant2=new JTextField("ola ta zwa einai "+metr,40);//dhmiourgoume kai vazoume to munhma tou jtextfiels .
     ant2.setEditable(false);//to vazoume false gia na min mporei na to epeksergastei o xrhsths.
     add(ant2);//to vazoume sto parathiro.
     ant3=new JTextField("ta futofaga f1 einai "+metrf1,40);
     ant3.setEditable(false);
     add(ant3);
     ant4=new JTextField("ta futofaga f2 einai "+metrf2,40);
     ant4.setEditable(false);
     add(ant4);
     ant5=new JTextField("ta sarkofaga s1 einai "+metrs1,40);
     ant5.setEditable(false);
     add(ant5);
     ant6=new JTextField("ta sarkofaga s2 einai "+metrs2,40);
     ant6.setEditable(false);
     add(ant6);
     ant7=new JTextField("apo peina pethanan "+deathfoodf1+" futofaga f1",40);
     ant7.setEditable(false);
     add(ant7);
     ant8=new JTextField("apo peina pethanan "+deathfoodf2+" futofaga f2",40);
     ant8.setEditable(false);
     add(ant8);
     ant9=new JTextField("apo peina pethanan "+deathfoods1+" sarkofaga s1",40);
     ant9.setEditable(false);
     add(ant9);
     ant10=new JTextField("apo peina pethanan "+deathfoods2+" sarkofaga s2",40);
     ant10.setEditable(false);
     add(ant10);
     ant11=new JTextField("fagwthikan "+eatenfromf1+" futofaga f1",40);
     ant11.setEditable(false);
     add(ant11);
     ant12=new JTextField("fagwthikan "+eatenfromf2+" futofaga f2",40);
     ant12.setEditable(false);
     add(ant12);
     ant13=new JTextField("to pososto futwn ston xarth einai "+fu+"%",40);
     ant13.setEditable(false);
     add(ant13);
     //kathorismos xrwmatwn.
     ant2.setBackground(Color.BLACK);
     ant2.setForeground(Color.WHITE);
     ant3.setBackground(Color.DARK_GRAY);
     ant3.setForeground(Color.WHITE);
     ant4.setBackground(Color.DARK_GRAY);
     ant4.setForeground(Color.WHITE);
     ant5.setBackground(Color.DARK_GRAY);
     ant5.setForeground(Color.WHITE);
     ant6.setBackground(Color.DARK_GRAY);
     ant6.setForeground(Color.WHITE);
     ant7.setBackground(Color.GRAY);
     ant7.setForeground(Color.BLACK);
     ant8.setBackground(Color.GRAY);
     ant8.setForeground(Color.BLACK);
     ant9.setBackground(Color.GRAY);
     ant9.setForeground(Color.BLACK);
     ant10.setBackground(Color.GRAY);
     ant10.setForeground(Color.BLACK);
     ant11.setBackground(Color.LIGHT_GRAY);
     ant11.setForeground(Color.BLACK);
     ant12.setBackground(Color.LIGHT_GRAY);
     ant12.setForeground(Color.BLACK);
     ant13.setBackground(new Color(224,224,224));
     ant13.setForeground(Color.BLACK);
    }  
}