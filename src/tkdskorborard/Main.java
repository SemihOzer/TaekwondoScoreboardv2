
package tkdskorborard;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.DefaultListModel;
import java.util.Random;

public class Main extends javax.swing.JFrame {
    static Thread t = new Thread()
           {
           
               public void run(){
                   
                   while(true){
                       
                       System.out.println(sure);
                       if(state == true){
                           
                           try{
                               
                               
                               
                               if(sure > 0){
                                   sure--; 
                                   sleep(1000);
                                        
                               }
                               
                               
                           }catch(Exception e){
                              System.err.println("Süre uyuyamıyo");
                           }
                           
                           
                       }
                       else if(state == false){
                           //Mola süresi kodları...
                           try{
                               
                                                            
                               if(sure == generalSure && raoundNumber > 1){
                                   molaSure++;  
                                   sleep(1000);
                                                                    
                               }
                               
                               
                           }catch(Exception e){
                               System.err.println("Mola süresi uyuyamıyo");
                           }
                           
                       }else{
                           break;
                       }
                       
                       
                   }
                   
               }
           
           };
    
    static boolean rules = true;
    static int molaSure = 0;
    static int molaSureAyari = 20;
    static String molaSureString = molaSure/60+":"+molaSure%60;
    static int redBar = 0;
    static int blueBar = 0;
    static int oynanacakRaound ;
    static int raoundNumber = 1;
    static String blueName;
    static String redName;
    static int redCeza = 0;
    static int generalSure = 0;
    static int sure = 0;
    static String timer = sure/60+":"+sure%60;
    static int blueCornerNumber = 0;
    static int redCornerNumber = 0;
    static int blueCeza = 0;
    static boolean state = false;
    ArrayList<Sporcu> sporcu_listesi = new ArrayList<Sporcu>();
    static ArrayList<String> kuraNameList = new ArrayList<String>();
    static DefaultListModel model = new DefaultListModel();
    static ArrayList<JLabel> solLabels = new ArrayList<JLabel>();
    static ArrayList<JLabel> sagLabels = new ArrayList<JLabel>();
    static ArrayList<String> kuraIsimleri = new ArrayList<String>();
    static ArrayList<String> randomIsimler = new ArrayList<String>();
    static Random r = new Random();
    static ArrayList<JLabel> siraliLabel = new ArrayList<JLabel>();
    
    
    JLabel winnerLabel = new JLabel("Winner", SwingConstants.CENTER);
    JLabel blueCornerLabel = new JLabel(String.valueOf(blueCornerNumber),SwingConstants.CENTER);
    JLabel redCornerLabel = new JLabel(String.valueOf(redCornerNumber), SwingConstants.CENTER);
    JLabel raoundLabel = new JLabel("R" + String.valueOf(raoundNumber), SwingConstants.CENTER);
    JLabel altinVurusLabel = new JLabel("G",SwingConstants.CENTER);
    JLabel blueCezaLabel = new JLabel(String.valueOf(blueCeza), SwingConstants.CENTER);
    JLabel redCezaLabel = new JLabel(String.valueOf(redCeza), SwingConstants.CENTER);
    JLabel blueBarLabel = new JLabel(String.valueOf(blueBar), SwingConstants.CENTER);
    JLabel redBarLabel = new JLabel(String.valueOf(redBar), SwingConstants.CENTER);
    JLabel blueNameLabel = new JLabel(blueName, SwingConstants.CENTER);
    JLabel redNameLabel = new JLabel(redName, SwingConstants.CENTER);

    
    String bitirmeSesi = "./korna.wav";
    String molaBitirmeSesi = "./kapizili.wav";
    Music music = new Music();
    
    public Main()   {
        initComponents();
        t.start();
        
        siraliLabel.add(sol1);
        siraliLabel.add(sol2);
        siraliLabel.add(sag1);
        siraliLabel.add(sag2);
        siraliLabel.add(sol3);
        siraliLabel.add(sol4);
        siraliLabel.add(sag3);
        siraliLabel.add(sag4);
        siraliLabel.add(sol5);
        siraliLabel.add(sol6);
        siraliLabel.add(sag5);
        siraliLabel.add(sag6);
        siraliLabel.add(sol7);
        siraliLabel.add(sol8);
        siraliLabel.add(sag7);
        siraliLabel.add(sag8);
        siraliLabel.add(sol9);
        siraliLabel.add(sol10);
        siraliLabel.add(sag9);
        siraliLabel.add(sag10);















        
        
        solLabels.add(sol1);
        solLabels.add(sol2);
        solLabels.add(sol3);
        solLabels.add(sol4);
        solLabels.add(sol5);
        solLabels.add(sol6);
        solLabels.add(sol7);
        solLabels.add(sol8);
        solLabels.add(sol9);
        solLabels.add(sol10);
        
        sagLabels.add(sag1);
        sagLabels.add(sag2);
        sagLabels.add(sag3);
        sagLabels.add(sag4);
        sagLabels.add(sag5);
        sagLabels.add(sag6);
        sagLabels.add(sag7);
        sagLabels.add(sag8);
        sagLabels.add(sag9);
        sagLabels.add(sag10);
        
        for(int i = 0; i < solLabels.size() ;i++){
            solLabels.get(i).setText("");
            sagLabels.get(i).setText("");
            //sagLabels.get(i).setBorder(new LineBorder(Color.gray));
            //.get(i).setBorder(new LineBorder(Color.gray));
            //solLabels.get(i).setPreferredSize(new Dimension(100, 100));
            //sagLabels.get(i).setPreferredSize(new Dimension(100, 100));
            sagLabels.get(i).setFont(new Font("Verdana", Font.PLAIN, 15));
            solLabels.get(i).setFont(new Font("Verdana", Font.PLAIN, 15));

            
        }
                
        
        
        Sporcu Semih = new Sporcu("Semih","Özer");
        Sporcu Hatice = new Sporcu("Hatice","Kolçak");
        Sporcu Özhan = new Sporcu("Özhan","Öztürk");
        Sporcu Ömer = new Sporcu("Muhammet Ömer","Aydın");
        Sporcu Melih = new Sporcu("Melih Can","Demircan");
        Sporcu İrem = new Sporcu("İrem Miray","Degeç");
        Sporcu Berfin = new Sporcu("Berfin","Ozan");
        Sporcu Bedirhan = new Sporcu("Bedirhan","Öksüz");
        Sporcu Demet = new Sporcu("Demet","Yılmaz");
        Sporcu Emir = new Sporcu("Emir","Perçin");
        Sporcu İlkay = new Sporcu("İlkay","Eren");
        Sporcu Ugur = new Sporcu("Uğur Berat", "Çalışkan");
        Sporcu Damla = new Sporcu("Damla","Yılmaz");
        Sporcu Ahmet = new Sporcu("Ahmet"," ");
        Sporcu Zeynep = new Sporcu("Zeynep"," ");
        Sporcu Ceren = new Sporcu("Ceren"," ");
        Sporcu Alanur = new Sporcu("Alanur", "İslamoğlu");
        Sporcu Ilknur = new Sporcu("İlknur", "Balta");

        
        sporcu_listesi.add(Hatice);
        sporcu_listesi.add(Özhan);
        sporcu_listesi.add(Semih);
        sporcu_listesi.add(İrem);
        sporcu_listesi.add(Melih);
        sporcu_listesi.add(Ömer);
        sporcu_listesi.add(Berfin);
        sporcu_listesi.add(Bedirhan);
        sporcu_listesi.add(Demet);
        sporcu_listesi.add(Emir);
        sporcu_listesi.add(İlkay);
        sporcu_listesi.add(Ugur);
        sporcu_listesi.add(Alanur);
        sporcu_listesi.add(Ilknur);
        sporcu_listesi.add(Damla);
        sporcu_listesi.add(Zeynep);
        sporcu_listesi.add(Ceren);
        sporcu_listesi.add(Ahmet);
  
        for(int i = 1; i < 99; i++){
            raoundComboBox.addItem(String.valueOf(i));
        }
        raoundComboBox.setSelectedIndex(0);
        blueComboBox.setSelectedIndex(0);
        redComboBox.setSelectedIndex(0);
        
        
        kuraNameJList.setModel(model);
        
        for(int i = 0;i < sporcu_listesi.size() ; i++ ){
         
            blueComboBox.addItem(sporcu_listesi.get(i).fullName);
            redComboBox.addItem(sporcu_listesi.get(i).fullName);

            
        
        }
        
        
        
        setTitle("Mert Asya Scoreboard");
        Image icon = Toolkit.getDefaultToolkit().getImage("mertasya.jpg");
        setIconImage(icon);
        
        LineBorder cizgi = new LineBorder(Color.white);
       
        
        
        
        
        
        //Yeni Maç EKrani Frame Ayarları
        newMatchFrame.setVisible(false);
        newMatchFrame.setBounds(getToolkit().getScreenSize().width/2 , getToolkit().getScreenSize().height/2 , 800, 500);
        newMatchFrame.setLocationRelativeTo(null);

        
        //Kura Ekrani Frame Ayarlari
        
        kuraEkrani.setBounds(getToolkit().getScreenSize().width/2,getToolkit().getScreenSize().height/2, 800, 600);
        kuraEkrani.setLocationRelativeTo(null);
        kuraEkrani.setVisible(false);
        
        
        //Giriş Ekrani Frame Ayarları
        GirisEkrani.setDefaultCloseOperation(EXIT_ON_CLOSE);
        GirisEkrani.setBounds(getToolkit().getScreenSize().width/2,getToolkit().getScreenSize().height/2, 300, 400);
        GirisEkrani.setLocationRelativeTo(null);
        GirisEkrani.setResizable(false);
        GirisEkrani.setVisible(true);
        GirisEkrani.getContentPane().setBackground(Color.lightGray);

        
        //Sure Tutma Ekrani Frame Ayarları
        sureEkrani.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sureEkrani.setExtendedState(JFrame.MAXIMIZED_BOTH);
        sureEkrani.setBounds(0,0,getToolkit().getScreenSize().width,getToolkit().getScreenSize().height);
        sureEkrani.setBackground(Color.black);
        sureEkrani.getContentPane().setBackground(Color.black);
        sureEkrani.setVisible(false);
        
        

        //ScoreBoard Ekrani Frame Ayarları
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setBounds(0,0,getToolkit().getScreenSize().width,getToolkit().getScreenSize().height);
        this.setVisible(false);
        this.setBackground(Color.black);
        this.getContentPane().setBackground(Color.black);
        
        scoreboard.setFocusable(false);
        sureTutma.setFocusable(false);
        kuraEkraniButton.setFocusable(false);

        
        scoreboard.setBackground(Color.cyan);
        sureTutma.setBackground(Color.cyan);
        kuraEkraniButton.setBackground(Color.cyan);
        
        
        

        yeniMacButton.setFocusable(false);
        yeniMacButton.setBackground(Color.yellow);
        yeniMacButton.setForeground(Color.black);
        yeniMacButton.setBounds(this.getWidth()/2 - 85 ,this.getHeight()/2 + 60, 90, 40);
        yeniMacButton.setVisible(false);
        this.add(yeniMacButton);
        
        devamEtButton.setFocusable(false);
        devamEtButton.setBackground(Color.yellow);
        devamEtButton.setForeground(Color.black);
        devamEtButton.setBounds(yeniMacButton.getX() + 95 ,this.getHeight()/2 + 60, 90, 40);
        devamEtButton.setVisible(false);
        this.add(devamEtButton);
        
        
        
        winnerLabel.setOpaque(true);
        winnerLabel.setBackground(Color.black);
        winnerLabel.setForeground(Color.yellow);
        winnerLabel.setFont(new Font("Serif",Font.PLAIN,100));
        winnerLabel.setBounds(this.getWidth()/2 - 250 , this.getHeight()/2 - 125, 500, 250);
        winnerLabel.setBorder(cizgi);
        winnerLabel.setVisible(false);
        this.add(winnerLabel);
        
        redCornerLabel.setOpaque(true);
        redCornerLabel.setBackground(Color.red);
        redCornerLabel.setForeground(Color.white);
        redCornerLabel.setFont(new Font("Serif", Font.PLAIN, 300));
        redCornerLabel.setBounds(50, this.getHeight()/4, this.getWidth()/3, this.getHeight()/2);
        redCornerLabel.setBorder(cizgi);
        this.add(redCornerLabel);
        
        
        
        blueCornerLabel.setOpaque(true);
        blueCornerLabel.setBackground(Color.blue);
        blueCornerLabel.setForeground(Color.white);
        blueCornerLabel.setFont(new Font("Serif", Font.PLAIN,300));
        blueCornerLabel.setBounds(this.getWidth()-(this.getWidth()/3+50), this.getHeight()/4, this.getWidth()/3, this.getHeight()/2);
        blueCornerLabel.setBorder(cizgi);
        this.add(blueCornerLabel);
        
        
       
        
        
        raoundLabel.setOpaque(true);
        raoundLabel.setBackground(Color.black);
        raoundLabel.setForeground(Color.yellow);
        raoundLabel.setFont(new Font("Serif", Font.PLAIN, 90));
        raoundLabel.setBounds(this.getWidth()/2 - (this.getWidth()/3)/8, this.getHeight()/2-this.getHeight()/6,  (this.getWidth()/3)/4, this.getHeight()/6);
        //raoundLabel.setBorder(cizgi);
        this.add(raoundLabel);
        
        
        JLabel timerLabel = new JLabel(timer, SwingConstants.CENTER);
        timerLabel.setOpaque(true);
        timerLabel.setBackground(Color.black);
        timerLabel.setForeground(Color.yellow);
        timerLabel.setFont(new Font("Serif", Font.PLAIN, 150));
        timerLabel.setBounds(this.getWidth()/2-(this.getWidth()-(this.getWidth()/3)*2-100)/2, this.getHeight()/2, this.getWidth()-(this.getWidth()/3)*2-100, this.getHeight()/6);
        //timerLabel.setBorder(cizgi);
        this.add(timerLabel);
        
        
        //Mola Süresi Label 
        JLabel MolaLabel = new JLabel(molaSureString, SwingConstants.CENTER);
        MolaLabel.setOpaque(true);
        MolaLabel.setBackground(Color.black);
        MolaLabel.setForeground(Color.green);
        MolaLabel.setFont(new Font("Serif",Font.PLAIN,100));
        MolaLabel.setBounds(this.getWidth()/2-(this.getWidth()-(this.getWidth()/3)*2-100)/2, this.getHeight()/2+ timerLabel.getHeight(),this.getWidth()-(this.getWidth()/3)*2-100,this.getHeight()/6);
        this.add(MolaLabel);
        
        
        altinVurusLabel.setOpaque(true);
        altinVurusLabel.setText("OT");
        altinVurusLabel.setBackground(Color.black);
        altinVurusLabel.setForeground(Color.yellow);
        altinVurusLabel.setFont(new Font("Serif", Font.PLAIN, 85));
        altinVurusLabel.setBounds(this.getWidth()/2 - (this.getWidth()/3)/8,this.getHeight()/2-this.getHeight()/6, (this.getWidth()/3)/4, this.getHeight()/6);
        //altinVurusLabel.setBorder(cizgi);
        altinVurusLabel.setVisible(false);
        this.add(altinVurusLabel);
        
        
        
        redCezaLabel.setOpaque(true);
        redCezaLabel.setBackground(Color.red);
        redCezaLabel.setForeground(Color.white);
        redCezaLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        redCezaLabel.setBounds(50, this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        redCezaLabel.setBorder(cizgi);
        this.add(redCezaLabel);
        
        blueCezaLabel.setOpaque(true);
        blueCezaLabel.setBackground(Color.blue);
        blueCezaLabel.setForeground(Color.white);
        blueCezaLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        blueCezaLabel.setBounds(this.getWidth()-(this.getWidth()/3+50), this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        blueCezaLabel.setBorder(cizgi);
        this.add(blueCezaLabel);
        
        
        
        
        blueBarLabel.setOpaque(true);
        blueBarLabel.setBackground(Color.blue);
        blueBarLabel.setForeground(Color.white);
        blueBarLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        blueBarLabel.setBounds(this.getWidth()-(this.getWidth()/3+50) + blueCezaLabel.getWidth() ,  this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        blueBarLabel.setBorder( new LineBorder(Color.black));
        blueBarLabel.setVisible(false);
        this.add(blueBarLabel);
        
        
        redBarLabel.setOpaque(true);
        redBarLabel.setBackground(Color.red);
        redBarLabel.setForeground(Color.white);
        redBarLabel.setFont(new Font("Serif", Font.PLAIN, 100));
        redBarLabel.setBounds(50 + redCezaLabel.getWidth() ,  this.getHeight()/2+(this.getWidth()/3)/5*2, (this.getWidth()/3)/4, this.getHeight()/6);
        redBarLabel.setBorder( new LineBorder(Color.black));
        redBarLabel.setVisible(false);
        this.add(redBarLabel);
        
           
             
        
        
        redNameLabel.setOpaque(true);
        redNameLabel.setBackground(Color.red);
        redNameLabel.setBounds(50,this.getHeight()/4-redCornerLabel.getHeight()/6 , this.getWidth()/3 ,redCornerLabel.getHeight()/6);
        redNameLabel.setForeground(Color.white);
        redNameLabel.setFont(new Font("Sherif", Font.PLAIN, 50));
        redNameLabel.setBorder(cizgi);
        this.add(redNameLabel);
        
        
        blueNameLabel.setOpaque(true);
        blueNameLabel.setBackground(Color.blue);
        blueNameLabel.setBounds(this.getWidth()-(this.getWidth()/3+50),this.getHeight()/4-redCornerLabel.getHeight()/6 , this.getWidth()/3 ,redCornerLabel.getHeight()/6);
        blueNameLabel.setForeground(Color.white);
        blueNameLabel.setFont(new Font("Sherif", Font.PLAIN, 50));
        blueNameLabel.setBorder(cizgi);
        this.add(blueNameLabel);

        blue3.setFocusable(false);
        blue3.setBackground(Color.blue);
        blue3.setForeground(Color.white);
        blue3.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue3);
        
        blue2.setFocusable(false);
        blue2.setBackground(Color.blue);
        blue2.setForeground(Color.white);
        blue2.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 + blue3.getWidth() + blue3.getWidth()/2, this.getHeight()/7 - blue2.getHeight()*2, blueNameLabel.getWidth()/8,  blueNameLabel.getHeight()/2);
        this.add(blue2);
        
        blue1.setFocusable(false);
        blue1.setBackground(Color.blue);
        blue1.setForeground(Color.white);
        blue1.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 + blue3.getWidth() + blue3.getWidth()/2 + blue2.getWidth() + blue2.getWidth()/2, this.getHeight()/7 - blue1.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue1);
        
        blue4.setFocusable(false);
        blue4.setBackground(Color.blue);
        blue4.setForeground(Color.white);
        blue4.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 - blue3.getWidth()- blue3.getWidth()/2, this.getHeight()/7 - blue4.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue4);
        
        blue5.setFocusable(false);
        blue5.setBackground(Color.blue);
        blue5.setForeground(Color.white);
        blue5.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2 - blue3.getWidth()- blue3.getWidth()/2 - blue4.getWidth()- blue4.getWidth()/2, this.getHeight()/7 - blue5.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(blue5);
   
        maviekleKaldir.setFocusable(false);
        maviekleKaldir.setBackground(Color.blue);
        maviekleKaldir.setForeground(Color.white);
        maviekleKaldir.setBounds(this.getWidth()-(this.getWidth()/3+50)+blueCornerLabel.getWidth()/2, this.getHeight()/7 - blue3.getHeight()*2 - blue3.getHeight(), blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(maviekleKaldir);
        
        red3.setFocusable(false);
        red3.setBackground(Color.red);
        red3.setForeground(Color.white);
        red3.setBounds(redCornerLabel.getWidth()/2,  this.getHeight()/7 - red3.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red3);
        
        red2.setFocusable(false);
        red2.setBackground(Color.red);
        red2.setForeground(Color.white);
        red2.setBounds(redCornerLabel.getWidth()/2 - red3.getWidth() - red2.getWidth()/2, this.getHeight()/7 - red2.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red2);
        
        red1.setFocusable(false);
        red1.setBackground(Color.red);
        red1.setForeground(Color.white);
        red1.setBounds(redCornerLabel.getWidth()/2 - red3.getWidth() - red2.getWidth()/2 - red2.getWidth() - red1.getWidth()/2, this.getHeight()/7 - red1.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red1);
        
        red4.setFocusable(false);
        red4.setBackground(Color.red);
        red4.setForeground(Color.white);
        red4.setBounds(redCornerLabel.getWidth()/2 + red3.getWidth() + red4.getWidth()/2, this.getHeight()/7 - red4.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red4);
        
        red5.setFocusable(false);
        red5.setBackground(Color.red);
        red5.setForeground(Color.white);
        red5.setBounds(redCornerLabel.getWidth()/2 + red3.getWidth() + red4.getWidth()/2 + red4.getWidth() + red5.getWidth()/2, this.getHeight()/7 - red5.getHeight()*2, blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(red5);
        
        kırmızıekleKaldir.setFocusable(false);
        kırmızıekleKaldir.setBackground(Color.red);
        kırmızıekleKaldir.setForeground(Color.white);
        kırmızıekleKaldir.setBounds(redCornerLabel.getWidth()/2, this.getHeight()/7 - red3.getHeight()*2 - red3.getHeight() , blueNameLabel.getWidth()/8, blueNameLabel.getHeight()/2);
        this.add(kırmızıekleKaldir);
        
        newmatch.setFocusable(false);
        newmatch.setBounds(this.getWidth()/2 - (this.getWidth()/3)/8, 0, this.getWidth()/10, this.getHeight()/20);
        this.add(newmatch);
        
        redCezaButon.setFocusable(false);
        redCezaButon.setBackground(Color.red);
        redCezaButon.setForeground(Color.white);
        redCezaButon.setBounds(this.getWidth()/3, this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        this.add(redCezaButon);
        
        blueCezaButon.setFocusable(false);
        blueCezaButon.setBackground(Color.blue);
        blueCezaButon.setForeground(Color.white);
        blueCezaButon.setBounds((int)blue1.getLocation().getX() ,  this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        this.add(blueCezaButon);
        
        redBarButton.setFocusable(false);
        redBarButton.setBackground(Color.red);
        redBarButton.setForeground(Color.white);
        redBarButton.setBounds(this.getWidth()/3 - redCezaButon.getWidth(), this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        redBarButton.setVisible(false);
        this.add(redBarButton);
        
        blueBarButton.setFocusable(false);
        blueBarButton.setBackground(Color.blue);
        blueBarButton.setForeground(Color.white);
        blueBarButton.setBounds((int)blue1.getLocation().getX() - blueCezaButon.getWidth(),  this.getHeight() - this.getHeight()/6, blueNameLabel.getWidth()/8, blueNameLabel.getHeight());
        blueBarButton.setVisible(false);
        this.add(blueBarButton);
        
        blueCornerTime.setFocusable(false);
        blueCornerTime.setBackground(Color.blue);
        blueCornerTime.setBounds(blueCornerLabel.getX()+ blueCornerLabel.getWidth() - (blueCornerLabel.getWidth()/3) - 1, blueCornerLabel.getY() + 1 , blueCornerLabel.getWidth()/3,blueCornerLabel.getHeight() - 2);
        blueCornerTime.setBorder(new LineBorder(Color.blue));
        this.add(blueCornerTime);
        
        redCornerTime.setFocusable(false);
        redCornerTime.setBackground(Color.red);
        redCornerTime.setBounds(redCornerLabel.getX() + 1 , redCornerLabel.getY() + 1, redCornerLabel.getWidth()/3,redCornerLabel.getHeight() - 2);
        redCornerTime.setBorder(new LineBorder(Color.red));
        this.add(redCornerTime);
        
        leftTimeButton.setFocusable(false);
        leftTimeButton.setBackground(Color.black);
        leftTimeButton.setBounds(0, 0, redCornerLabel.getX(), this.getHeight());
        leftTimeButton.setBorder(new LineBorder(Color.black));
        this.add(leftTimeButton);
        
        rightTimeButton.setFocusable(false);
        rightTimeButton.setBackground(Color.black);
        rightTimeButton.setBounds(blueCornerLabel.getX() + blueCornerLabel.getWidth() , 0, this.getWidth() - (blueCornerLabel.getX() + blueCornerLabel.getWidth()) , this.getHeight());
        rightTimeButton.setBorder(new LineBorder(Color.black));
        this.add(rightTimeButton);
        
        baslatDurdur.setFocusable(false);
        baslatDurdur.setBackground(Color.yellow);
        baslatDurdur.setBounds(this.getWidth()/2-(this.getWidth()-(this.getWidth()/3)*2-100)/2, this.getHeight() / 5, this.getWidth()-(this.getWidth()/3)*2-100, blueCezaButon.getHeight());
        this.add(baslatDurdur);
        
        sureEkle.setFocusable(false);
        sureEkle.setBackground(Color.yellow);
        sureEkle.setBounds(this.getWidth() / 2 - SureRand.getWidth() - sureEkle.getWidth() - SureRand.getWidth()/2, this.getHeight() / 5 - baslatDurdur.getHeight() , blueCezaButon.getWidth(), blueCezaButon.getHeight()/2);
        this.add(sureEkle);
    
        sureSil.setFocusable(false);
        sureSil.setBackground(Color.yellow);
        sureSil.setBounds(this.getWidth() / 2 - SureRand.getWidth() + sureSil.getWidth() + SureRand.getWidth()/2 , this.getHeight() / 5 - baslatDurdur.getHeight() , blueCezaButon.getWidth(), blueCezaButon.getHeight()/2);
        this.add(sureSil);
        
        SureRand.setFocusable(false);
        SureRand.setBackground(Color.yellow);
        SureRand.setBounds(this.getWidth() / 2 - SureRand.getWidth(), this.getHeight() / 5 - baslatDurdur.getHeight(), blueCezaButon.getWidth() , blueCezaButon.getHeight()/2);
        this.add(SureRand);
        
        changeButton.setFocusable(false);
        changeButton.setBackground(Color.black);
        changeButton.setBounds(this.getWidth()/2 - changeButton.getWidth()/2, this.getHeight()-100, 75, 25);
        this.add(changeButton);
        
        
           
        
        
       while(true){
           
           
           
           kazananBelirle();
           
           
           if( state == false && sure == generalSure && raoundNumber > 1){
               MolaLabel.setVisible(true);
            }else{
               MolaLabel.setVisible(false);
           }
           
           if(molaSure == molaSureAyari - 1 && molaSuresiAyarLabel.isVisible() ){
               
              molaSure++;
              music.PlayMusic(molaBitirmeSesi);
               
               
           }
           
           if(sure == 0 && generalSure > 0){
               
               music.PlayMusic(bitirmeSesi);
               molaSure = 0;
               sure = generalSure ;
               baslatDurdur.setSelected(false);
               state = false;
               baslatDurdur.setText(">");
               
               
               if(raoundNumber < oynanacakRaound ){
                   raoundNumber++;
               }
               
               
           }
           
           molaSuresiAyarLabel.setText(String.valueOf(molaSureAyari));
           
           raoundLabel.setText("R" + String.valueOf(raoundNumber));
           
           blueCezaLabel.setText(String.valueOf(blueCeza));
           redCezaLabel.setText(String.valueOf(redCeza));
          
           redBarLabel.setText(String.valueOf(redBar));
           blueBarLabel.setText(String.valueOf(blueBar));
           
           blueCornerLabel.setText(String.valueOf(blueCornerNumber));
           redCornerLabel.setText(String.valueOf(redCornerNumber));
           
           redNameLabel.setText(redName);
           blueNameLabel.setText(blueName);
           
           
           if(molaSure >= 10){
               
               if(molaSure%60 >= 10){
              molaSureString = molaSure/60+":"+molaSure%60;
              MolaLabel.setText(molaSureString);
               }else if (molaSure%60 < 10 && molaSure/60 >=1 ) {
                   molaSureString = molaSure/60+":0"+molaSure%60;
                   MolaLabel.setText(molaSureString);
                   
               }
           }else if(molaSure < 10 ){
             
            molaSureString = molaSure/60+":0"+molaSure%60;
            MolaLabel.setText(molaSureString);
            
            
               
           }
           
           if(sure >= 10){
               
               if(sure%60 >= 10){
              timer = sure/60+":"+sure%60;
              timerLabel.setText(timer);
               }else if (sure%60 < 10 && sure/60 >=1 ) {
                   timer = sure/60+":0"+sure%60;
                   timerLabel.setText(timer);
                   
               }
           }else if(sure < 10 && generalSure >= 60){
             
            timer = sure/60+":0"+sure%60;
            timerLabel.setText(timer);
            
            
               
           }
           
           
           
           
           
           if(birdakika.isSelected()){
            birbucukdakika.setSelected(false);
            ikidakika.setSelected(false);
        }else if(birbucukdakika.isSelected()){
            birdakika.setSelected(false);
            ikidakika.setSelected(false);
        }else if(ikidakika.isSelected()){
            birdakika.setSelected(false);
            birbucukdakika.setSelected(false);
    }
          
           
          
           
       }
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        newMatchFrame = new javax.swing.JFrame();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        redNameTextField = new javax.swing.JTextField();
        blueNameTextField = new javax.swing.JTextField();
        birdakika = new javax.swing.JCheckBox();
        birbucukdakika = new javax.swing.JCheckBox();
        ikidakika = new javax.swing.JCheckBox();
        newMatchOkeyButton = new javax.swing.JButton();
        blueComboBox = new javax.swing.JComboBox<>();
        redComboBox = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        molaSuresiAyarLabel = new javax.swing.JLabel();
        msBesAzalt = new javax.swing.JButton();
        msBesArttir = new javax.swing.JButton();
        raoundComboBox = new javax.swing.JComboBox<>();
        GirisEkrani = new javax.swing.JFrame();
        scoreboard = new javax.swing.JButton();
        sureTutma = new javax.swing.JButton();
        kuraEkraniButton = new javax.swing.JButton();
        sureEkrani = new javax.swing.JFrame();
        sureTutma_sure = new javax.swing.JLabel();
        sure_ayar = new javax.swing.JButton();
        sureTutmaBaşlat = new javax.swing.JButton();
        sure_round_ayarla = new javax.swing.JButton();
        sureTutma_azalt = new javax.swing.JButton();
        sureTutma_arttir = new javax.swing.JButton();
        sureTutma_round = new javax.swing.JLabel();
        kuraEkrani = new javax.swing.JFrame();
        kuraNameTextField = new javax.swing.JTextField();
        kuraNameText = new javax.swing.JLabel();
        kuraNameAd = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        kuraNameJList = new javax.swing.JList<>();
        sol1 = new javax.swing.JLabel();
        sol2 = new javax.swing.JLabel();
        sol3 = new javax.swing.JLabel();
        sol4 = new javax.swing.JLabel();
        sol5 = new javax.swing.JLabel();
        sol6 = new javax.swing.JLabel();
        sol7 = new javax.swing.JLabel();
        sol8 = new javax.swing.JLabel();
        sol9 = new javax.swing.JLabel();
        sol10 = new javax.swing.JLabel();
        sag1 = new javax.swing.JLabel();
        sag2 = new javax.swing.JLabel();
        sag4 = new javax.swing.JLabel();
        sag3 = new javax.swing.JLabel();
        sag5 = new javax.swing.JLabel();
        sag6 = new javax.swing.JLabel();
        sag7 = new javax.swing.JLabel();
        sag8 = new javax.swing.JLabel();
        sag9 = new javax.swing.JLabel();
        sag10 = new javax.swing.JLabel();
        kuraCekButton = new javax.swing.JButton();
        kuraSifirlaButton = new javax.swing.JButton();
        newmatch = new javax.swing.JButton();
        blue2 = new javax.swing.JButton();
        blue3 = new javax.swing.JButton();
        blue1 = new javax.swing.JButton();
        blue4 = new javax.swing.JButton();
        blue5 = new javax.swing.JButton();
        maviekleKaldir = new javax.swing.JToggleButton();
        red1 = new javax.swing.JButton();
        red2 = new javax.swing.JButton();
        red3 = new javax.swing.JButton();
        red4 = new javax.swing.JButton();
        red5 = new javax.swing.JButton();
        kırmızıekleKaldir = new javax.swing.JToggleButton();
        redCezaButon = new javax.swing.JButton();
        blueCezaButon = new javax.swing.JButton();
        baslatDurdur = new javax.swing.JToggleButton();
        sureSil = new javax.swing.JButton();
        sureEkle = new javax.swing.JButton();
        blueBarButton = new javax.swing.JButton();
        redBarButton = new javax.swing.JButton();
        SureRand = new javax.swing.JToggleButton();
        changeButton = new javax.swing.JButton();
        devamEtButton = new javax.swing.JButton();
        yeniMacButton = new javax.swing.JButton();
        leftTimeButton = new javax.swing.JButton();
        rightTimeButton = new javax.swing.JButton();
        blueCornerTime = new javax.swing.JButton();
        redCornerTime = new javax.swing.JButton();

        jLabel1.setText("Kırmızı Köşe İsim:");

        jLabel2.setText("Mavi Köşe İsim  :");

        blueNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueNameTextFieldActionPerformed(evt);
            }
        });

        birdakika.setText("1.00");

        birbucukdakika.setText("1.30");
        birbucukdakika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                birbucukdakikaActionPerformed(evt);
            }
        });

        ikidakika.setText("2.00");

        newMatchOkeyButton.setText("Tamam");
        newMatchOkeyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newMatchOkeyButtonActionPerformed(evt);
            }
        });

        blueComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz" }));
        blueComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueComboBoxActionPerformed(evt);
            }
        });

        redComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seçiniz" }));
        redComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redComboBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Maç Süresi");

        jLabel4.setText("Rand");

        jLabel5.setText("Mola Süresi");

        molaSuresiAyarLabel.setText("20");

        msBesAzalt.setText("-5");
        msBesAzalt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msBesAzaltActionPerformed(evt);
            }
        });

        msBesArttir.setText("+5");
        msBesArttir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                msBesArttirActionPerformed(evt);
            }
        });

        raoundComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                raoundComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout newMatchFrameLayout = new javax.swing.GroupLayout(newMatchFrame.getContentPane());
        newMatchFrame.getContentPane().setLayout(newMatchFrameLayout);
        newMatchFrameLayout.setHorizontalGroup(
            newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newMatchFrameLayout.createSequentialGroup()
                .addGap(135, 135, 135)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(newMatchFrameLayout.createSequentialGroup()
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(redNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(blueNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(blueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(redComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(newMatchFrameLayout.createSequentialGroup()
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(newMatchFrameLayout.createSequentialGroup()
                                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel1))
                                    .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(birdakika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(birbucukdakika, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ikidakika)))
                                .addGap(92, 92, 92))
                            .addGroup(newMatchFrameLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(122, 122, 122)))
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newMatchOkeyButton)
                            .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(raoundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4)))
                        .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(newMatchFrameLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jLabel5)
                                .addGap(38, 38, 38))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, newMatchFrameLayout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(msBesAzalt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(molaSuresiAyarLabel)
                                .addGap(18, 18, 18)
                                .addComponent(msBesArttir)))
                        .addContainerGap(154, Short.MAX_VALUE))))
        );
        newMatchFrameLayout.setVerticalGroup(
            newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, newMatchFrameLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(blueNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(blueComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(redNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(redComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(newMatchFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(birdakika)
                    .addComponent(molaSuresiAyarLabel)
                    .addComponent(msBesAzalt)
                    .addComponent(msBesArttir)
                    .addComponent(raoundComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(birbucukdakika)
                .addGap(18, 18, 18)
                .addComponent(ikidakika)
                .addGap(26, 26, 26)
                .addComponent(newMatchOkeyButton)
                .addGap(30, 30, 30))
        );

        scoreboard.setText("Taekwondo Skor Tabelası");
        scoreboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scoreboardActionPerformed(evt);
            }
        });

        sureTutma.setText("Süre Tutma");
        sureTutma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sureTutmaActionPerformed(evt);
            }
        });

        kuraEkraniButton.setText("Kura Çekme");
        kuraEkraniButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuraEkraniButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GirisEkraniLayout = new javax.swing.GroupLayout(GirisEkrani.getContentPane());
        GirisEkrani.getContentPane().setLayout(GirisEkraniLayout);
        GirisEkraniLayout.setHorizontalGroup(
            GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisEkraniLayout.createSequentialGroup()
                .addContainerGap(97, Short.MAX_VALUE)
                .addGroup(GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(sureTutma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scoreboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kuraEkraniButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        GirisEkraniLayout.setVerticalGroup(
            GirisEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GirisEkraniLayout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(scoreboard)
                .addGap(18, 18, 18)
                .addComponent(sureTutma)
                .addGap(18, 18, 18)
                .addComponent(kuraEkraniButton)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        sureTutma_sure.setText("0:00");

        sure_ayar.setText("Ayarla");

        sureTutmaBaşlat.setText("Başlat");

        sure_round_ayarla.setText("Süre");

        sureTutma_azalt.setText("+");

        sureTutma_arttir.setText("+");

        sureTutma_round.setText("R1");

        javax.swing.GroupLayout sureEkraniLayout = new javax.swing.GroupLayout(sureEkrani.getContentPane());
        sureEkrani.getContentPane().setLayout(sureEkraniLayout);
        sureEkraniLayout.setHorizontalGroup(
            sureEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sureEkraniLayout.createSequentialGroup()
                .addContainerGap(121, Short.MAX_VALUE)
                .addGroup(sureEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(sureEkraniLayout.createSequentialGroup()
                        .addComponent(sure_ayar)
                        .addGap(165, 165, 165))
                    .addGroup(sureEkraniLayout.createSequentialGroup()
                        .addGroup(sureEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sureTutmaBaşlat)
                            .addComponent(sureTutma_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(sureEkraniLayout.createSequentialGroup()
                                .addComponent(sureTutma_azalt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(sureEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sureTutma_round, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sure_round_ayarla))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sureTutma_arttir)
                        .addGap(122, 122, 122))))
        );
        sureEkraniLayout.setVerticalGroup(
            sureEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sureEkraniLayout.createSequentialGroup()
                .addComponent(sure_ayar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(sureEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sure_round_ayarla)
                    .addComponent(sureTutma_azalt)
                    .addComponent(sureTutma_arttir))
                .addGap(31, 31, 31)
                .addComponent(sureTutma_round)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(sureTutma_sure, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(sureTutmaBaşlat)
                .addGap(50, 50, 50))
        );

        kuraNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuraNameTextFieldActionPerformed(evt);
            }
        });

        kuraNameText.setText("Ad Soyad");

        kuraNameAd.setText("Ekle");
        kuraNameAd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuraNameAdActionPerformed(evt);
            }
        });

        kuraNameJList.setModel(model);
        jScrollPane1.setViewportView(kuraNameJList);

        jScrollPane2.setViewportView(jScrollPane1);

        sol1.setText("1");

        sol2.setText("1");

        sol3.setText("1");

        sol4.setText("1");

        sol5.setText("1");

        sol6.setText("1");

        sol7.setText("1");

        sol8.setText("1");

        sol9.setText("1");

        sol10.setText("1");

        sag1.setText("1");

        sag2.setText("1");

        sag4.setText("1");

        sag3.setText("1");

        sag5.setText("1");

        sag6.setText("1");

        sag7.setText("1");

        sag8.setText("1");

        sag9.setText("1");

        sag10.setText("1");

        kuraCekButton.setText("Kura Çek");
        kuraCekButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuraCekButtonActionPerformed(evt);
            }
        });

        kuraSifirlaButton.setText("Sıfırla");
        kuraSifirlaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kuraSifirlaButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout kuraEkraniLayout = new javax.swing.GroupLayout(kuraEkrani.getContentPane());
        kuraEkrani.getContentPane().setLayout(kuraEkraniLayout);
        kuraEkraniLayout.setHorizontalGroup(
            kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kuraEkraniLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kuraNameText)
                    .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(kuraEkraniLayout.createSequentialGroup()
                            .addComponent(kuraNameTextField)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(kuraNameAd))
                        .addComponent(jScrollPane2)))
                .addGap(131, 131, 131)
                .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sol10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                    .addComponent(sol9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sol1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(82, 82, 82)
                .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sag3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                    .addComponent(sag4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sag2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
            .addGroup(kuraEkraniLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(kuraCekButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(kuraSifirlaButton)
                .addGap(251, 251, 251))
        );
        kuraEkraniLayout.setVerticalGroup(
            kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kuraEkraniLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kuraEkraniLayout.createSequentialGroup()
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sol1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sag1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kuraEkraniLayout.createSequentialGroup()
                        .addComponent(kuraNameText)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kuraNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kuraNameAd)
                    .addComponent(sol2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sag2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kuraEkraniLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE))
                    .addGroup(kuraEkraniLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sag3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sag4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sag5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sag6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sag7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sag8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol8, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sag9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sol9, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sol10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sag10, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(25, 25, 25)
                .addGroup(kuraEkraniLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kuraCekButton)
                    .addComponent(kuraSifirlaButton))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        newmatch.setText("Yeni Maç");
        newmatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newmatchActionPerformed(evt);
            }
        });

        blue2.setText("2");
        blue2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue2ActionPerformed(evt);
            }
        });

        blue3.setText("3");
        blue3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue3ActionPerformed(evt);
            }
        });

        blue1.setText("1");
        blue1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue1ActionPerformed(evt);
            }
        });

        blue4.setText("4");
        blue4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue4ActionPerformed(evt);
            }
        });

        blue5.setText("5");
        blue5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blue5ActionPerformed(evt);
            }
        });

        maviekleKaldir.setText("+");
        maviekleKaldir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maviekleKaldirActionPerformed(evt);
            }
        });

        red1.setText("1");
        red1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red1ActionPerformed(evt);
            }
        });

        red2.setText("2");
        red2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red2ActionPerformed(evt);
            }
        });

        red3.setText("3");
        red3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red3ActionPerformed(evt);
            }
        });

        red4.setText("4");
        red4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red4ActionPerformed(evt);
            }
        });

        red5.setText("5");
        red5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                red5ActionPerformed(evt);
            }
        });

        kırmızıekleKaldir.setText("+");
        kırmızıekleKaldir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kırmızıekleKaldirActionPerformed(evt);
            }
        });

        redCezaButon.setText("X");
        redCezaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCezaButonActionPerformed(evt);
            }
        });

        blueCezaButon.setText("X");
        blueCezaButon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueCezaButonActionPerformed(evt);
            }
        });

        baslatDurdur.setText(">");
        baslatDurdur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                baslatDurdurActionPerformed(evt);
            }
        });

        sureSil.setText("-");
        sureSil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sureSilActionPerformed(evt);
            }
        });

        sureEkle.setText("+");
        sureEkle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sureEkleActionPerformed(evt);
            }
        });

        blueBarButton.setText("B");
        blueBarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueBarButtonActionPerformed(evt);
            }
        });

        redBarButton.setText("B");
        redBarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redBarButtonActionPerformed(evt);
            }
        });

        SureRand.setText("S");
        SureRand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SureRandActionPerformed(evt);
            }
        });

        changeButton.setText("<-->");
        changeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changeButtonActionPerformed(evt);
            }
        });

        devamEtButton.setText("Devam Et");
        devamEtButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devamEtButtonActionPerformed(evt);
            }
        });

        yeniMacButton.setText("Yeni Maç");
        yeniMacButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeniMacButtonActionPerformed(evt);
            }
        });

        leftTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leftTimeButtonActionPerformed(evt);
            }
        });

        rightTimeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rightTimeButtonActionPerformed(evt);
            }
        });

        blueCornerTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                blueCornerTimeActionPerformed(evt);
            }
        });

        redCornerTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                redCornerTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maviekleKaldir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(blue5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(blue4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(kırmızıekleKaldir)
                                .addGap(18, 18, 18)
                                .addComponent(red5))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(redCezaButon)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(red4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sureEkle)
                                .addGap(18, 18, 18)
                                .addComponent(baslatDurdur))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(SureRand)
                                    .addComponent(changeButton)
                                    .addComponent(devamEtButton))))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(sureSil)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(blueCezaButon)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(30, 30, 30)
                                .addComponent(red3)
                                .addGap(18, 18, 18)
                                .addComponent(red2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(red1))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(yeniMacButton)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(leftTimeButton)
                            .addComponent(rightTimeButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 202, Short.MAX_VALUE)
                        .addComponent(blue3)
                        .addGap(18, 18, 18)
                        .addComponent(blue2)
                        .addGap(28, 28, 28)
                        .addComponent(blue1)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(newmatch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(redBarButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(redCornerTime)
                        .addGap(15, 15, 15)))
                .addComponent(blueCornerTime)
                .addGap(195, 195, 195)
                .addComponent(blueBarButton)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(blueBarButton)
                                .addComponent(redBarButton))
                            .addComponent(redCornerTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newmatch))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(blueCornerTime)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(blue2)
                            .addComponent(blue3)
                            .addComponent(blue1)
                            .addComponent(blue4)
                            .addComponent(maviekleKaldir)
                            .addComponent(blue5))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(red1)
                            .addComponent(red2)
                            .addComponent(red3)
                            .addComponent(red4)
                            .addComponent(red5)
                            .addComponent(kırmızıekleKaldir))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(changeButton)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(devamEtButton)
                            .addComponent(yeniMacButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 469, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(redCezaButon)
                            .addComponent(blueCezaButon)
                            .addComponent(baslatDurdur)
                            .addComponent(sureSil)
                            .addComponent(sureEkle))
                        .addGap(5, 5, 5)
                        .addComponent(SureRand))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(leftTimeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightTimeButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void birbucukdakikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_birbucukdakikaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_birbucukdakikaActionPerformed

    private void blueNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_blueNameTextFieldActionPerformed

 
    
    
    
    
    private void newMatchOkeyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newMatchOkeyButtonActionPerformed
       
        if(birdakika.isSelected() || birbucukdakika.isSelected() || ikidakika.isSelected() ){
        
           
        
        
      //  winnerKaldir();
        state = false;
        baslatDurdur.setSelected(false);
        baslatDurdur.setText(">");
        blueCornerNumber =0;
        redCornerNumber =0;
        altinVurusLabel.setVisible(false);
        raoundLabel.setVisible(true);
        blueCornerLabel.setForeground(Color.white);
        redCornerLabel.setForeground(Color.white);
        blueCeza = 0;
        redCeza = 0;
        blueBar =0;
        redBar = 0;
        redBarButton.setVisible(false);
        blueBarButton.setVisible(false);
        redBarLabel.setVisible(false);
        blueBarLabel.setVisible(false);
        raoundNumber =1;
        redName = redNameTextField.getText();
        blueName = blueNameTextField.getText();
        newMatchFrame.setVisible(false);
        
       
       
        if(birdakika.isSelected()){
            generalSure = 60;
            sure = 60;
        }else if(birbucukdakika.isSelected()){
            generalSure = 90;
            sure = 90;
        }else if(ikidakika.isSelected()){
            generalSure = 120;
            sure = 120;
        }
        
        
            
        }
        
        
        
        
        
    }//GEN-LAST:event_newMatchOkeyButtonActionPerformed

    private void newmatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newmatchActionPerformed
       //  winnerKaldir();
         redComboBox.setSelectedIndex(0);
         blueComboBox.setSelectedIndex(0);
         blueNameTextField.setText("");
         redNameTextField.setText("");
         newMatchFrame.setVisible(true);
         
       
    }//GEN-LAST:event_newmatchActionPerformed

    private void maviekleKaldirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maviekleKaldirActionPerformed
        if(maviekleKaldir.isSelected()){
            maviekleKaldir.setText("-");
            
        }else if(!maviekleKaldir.isSelected()){
            
            maviekleKaldir.setText("+");
        }
    }//GEN-LAST:event_maviekleKaldirActionPerformed

    private void blue1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue1ActionPerformed
        
        if(!maviekleKaldir.isSelected()){
            maviPuanEkle(1);
         }else if(maviekleKaldir.isSelected()){
            maviPuanSil(1);
       }
        
    }//GEN-LAST:event_blue1ActionPerformed

    private void blue2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue2ActionPerformed
       if(!maviekleKaldir.isSelected()){
           maviPuanEkle(2);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(2);
       }
    }//GEN-LAST:event_blue2ActionPerformed

    private void blue3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue3ActionPerformed
        if(!maviekleKaldir.isSelected()){
           maviPuanEkle(3);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(3);
       }
    }//GEN-LAST:event_blue3ActionPerformed

    private void blue4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue4ActionPerformed
         if(!maviekleKaldir.isSelected()){
           maviPuanEkle(4);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(4);
       }
    }//GEN-LAST:event_blue4ActionPerformed

    private void blue5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blue5ActionPerformed
        if(!maviekleKaldir.isSelected()){
           maviPuanEkle(5);
       }else if(maviekleKaldir.isSelected()){
            maviPuanSil(5);
       }
        
        
        
    }//GEN-LAST:event_blue5ActionPerformed

    private void red2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red2ActionPerformed
          if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(2);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(2);
       }
    }//GEN-LAST:event_red2ActionPerformed

    private void kırmızıekleKaldirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kırmızıekleKaldirActionPerformed
        if(kırmızıekleKaldir.isSelected()){
            kırmızıekleKaldir.setText("-");
            
        }else if(!kırmızıekleKaldir.isSelected()){
            
            kırmızıekleKaldir.setText("+");
        }
    }//GEN-LAST:event_kırmızıekleKaldirActionPerformed

    private void red5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red5ActionPerformed
         if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(5);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(5);
       }
    }//GEN-LAST:event_red5ActionPerformed

    private void red4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red4ActionPerformed
        if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(4);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(4);
       }
    }//GEN-LAST:event_red4ActionPerformed

    private void red3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red3ActionPerformed
          if(!kırmızıekleKaldir.isSelected()){
           kirmiziPuanEkle(3);
       }else if(kırmızıekleKaldir.isSelected()){
            kirmiziPuanSil(3);
       }
    }//GEN-LAST:event_red3ActionPerformed

    private void red1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_red1ActionPerformed
        
            if(!kırmızıekleKaldir.isSelected()){
                kirmiziPuanEkle(1);
            }else if(kırmızıekleKaldir.isSelected()){
                kirmiziPuanSil(1);
            }
            
        
            
    }//GEN-LAST:event_red1ActionPerformed

    private void redCezaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCezaButonActionPerformed
        
        if(!kırmızıekleKaldir.isSelected()){
            kirmiziCezaVer();
            
        }else if(kırmızıekleKaldir.isSelected()){
            kirmiziCezaSil();
            
        }
        
    }//GEN-LAST:event_redCezaButonActionPerformed

    private void blueCezaButonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueCezaButonActionPerformed
        if(!maviekleKaldir.isSelected()){
            maviCezaVer();
            
        }else if(maviekleKaldir.isSelected()){
            maviCezaSil();
            
        }
    }//GEN-LAST:event_blueCezaButonActionPerformed

    private void baslatDurdurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_baslatDurdurActionPerformed
     
        if(baslatDurdur.isSelected()){
           baslatDurdur.setText("=");
           
           state = true;
           
           
          //buraya thread yapıştır
          
           
        } else if(!baslatDurdur.isSelected()){
            baslatDurdur.setText(">");
            
            state = false;
           
           
            
        }
        
    }//GEN-LAST:event_baslatDurdurActionPerformed

    private void sureEkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sureEkleActionPerformed
    if(!SureRand.isSelected() && sure > 0){
 
            sure++;
            
    } else if(SureRand.isSelected() && oynanacakRaound > raoundNumber){
        
        raoundNumber++;
        
        
    }  
    
    }//GEN-LAST:event_sureEkleActionPerformed

    private void sureSilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sureSilActionPerformed
        
        if(!SureRand.isSelected() && sure > 0){
            
            sure--;
            
        }else if(SureRand.isSelected() && raoundNumber > 1){
            raoundNumber--;
        }
    }//GEN-LAST:event_sureSilActionPerformed

    private void redBarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redBarButtonActionPerformed
        if(!kırmızıekleKaldir.isSelected()){
            redBar++;
            
        }else if(kırmızıekleKaldir.isSelected()){
           if(redBar > 0){
            redBar--;
           }
        }
    }//GEN-LAST:event_redBarButtonActionPerformed

    private void blueBarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueBarButtonActionPerformed
        if(!maviekleKaldir.isSelected()){
            blueBar++;
            
        }else if(maviekleKaldir.isSelected()){
           if(blueBar > 0){
            blueBar--;
           }
        }    }//GEN-LAST:event_blueBarButtonActionPerformed

    private void SureRandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SureRandActionPerformed

        if(!SureRand.isSelected()){
            SureRand.setText("S");
            
        }else if(SureRand.isSelected()){
            SureRand.setText("R");
        }

    }//GEN-LAST:event_SureRandActionPerformed

    private void changeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changeButtonActionPerformed

        String oldBlue = blueName;
        String oldRed = redName;
        int oldRedCornerNumber = redCornerNumber;
        int oldBlueCornerNumber = blueCornerNumber;
        int oldRedCeza = redCeza;
        int oldBlueCeza = blueCeza;
        int oldRedBar = redBar;
        int oldBlueBar = blueBar;

        
        blueName = oldRed;
        redName = oldBlue;
        blueCornerNumber = oldRedCornerNumber;
        redCornerNumber = oldBlueCornerNumber;
        redCeza = oldBlueCeza;
        blueCeza = oldRedCeza;
        redBar = oldBlueBar;
        blueBar = oldRedBar;
        
        
    }//GEN-LAST:event_changeButtonActionPerformed

    private void scoreboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scoreboardActionPerformed
        this.setVisible(true);
        GirisEkrani.setVisible(false);
        
    }//GEN-LAST:event_scoreboardActionPerformed

    private void sureTutmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sureTutmaActionPerformed
      // sureEkrani.setVisible(true);
      // GirisEkrani.setVisible(false);
    }//GEN-LAST:event_sureTutmaActionPerformed

    private void kuraEkraniButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuraEkraniButtonActionPerformed
        kuraEkrani.setVisible(true);
    }//GEN-LAST:event_kuraEkraniButtonActionPerformed

    private void redComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redComboBoxActionPerformed
        
        if(redComboBox.getSelectedIndex() > 0){
        String name = sporcu_listesi.get(redComboBox.getSelectedIndex() - 1).ad;
        redNameTextField.setText(name);
        }


        
    }//GEN-LAST:event_redComboBoxActionPerformed

    private void blueComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueComboBoxActionPerformed
        
        if(blueComboBox.getSelectedIndex() > 0){
        String name = sporcu_listesi.get(blueComboBox.getSelectedIndex() - 1).ad;
        blueNameTextField.setText(name);
        }
    }//GEN-LAST:event_blueComboBoxActionPerformed

    private void msBesAzaltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msBesAzaltActionPerformed
        if(molaSureAyari > 5){
        molaSureAyari -= 5;
        }
    }//GEN-LAST:event_msBesAzaltActionPerformed

    private void msBesArttirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_msBesArttirActionPerformed

        molaSureAyari += 5;
        
    }//GEN-LAST:event_msBesArttirActionPerformed

    private void yeniMacButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeniMacButtonActionPerformed
         
         
         redComboBox.setSelectedIndex(0);
         blueComboBox.setSelectedIndex(0);
         blueNameTextField.setText("");
         redNameTextField.setText("");
         newMatchFrame.setVisible(true);
    }//GEN-LAST:event_yeniMacButtonActionPerformed

    private void devamEtButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devamEtButtonActionPerformed
        
       // winnerKaldir();
    }//GEN-LAST:event_devamEtButtonActionPerformed

    private void rightTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rightTimeButtonActionPerformed
        
       
        if(baslatDurdur.isSelected()){
            baslatDurdur.setSelected(false);
            baslatDurdur.setText(">");
            state = false;
        }else if(!baslatDurdur.isSelected()){
            baslatDurdur.setSelected(true);
            baslatDurdur.setText("=");
            state = true;
        }
        
    }//GEN-LAST:event_rightTimeButtonActionPerformed

    private void leftTimeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leftTimeButtonActionPerformed
       if(baslatDurdur.isSelected()){
            baslatDurdur.setSelected(false);
            baslatDurdur.setText(">");
            state = false;
        }else if(!baslatDurdur.isSelected()){
            baslatDurdur.setSelected(true);
            baslatDurdur.setText("=");
            state = true;
        }
    }//GEN-LAST:event_leftTimeButtonActionPerformed

    private void raoundComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_raoundComboBoxActionPerformed
     
        if(raoundComboBox.getSelectedIndex() > 0){
            oynanacakRaound = Integer.parseInt(raoundComboBox.getSelectedItem().toString());
        }
        
    }//GEN-LAST:event_raoundComboBoxActionPerformed

    private void blueCornerTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_blueCornerTimeActionPerformed
        if(baslatDurdur.isSelected()){
            baslatDurdur.setSelected(false);
            baslatDurdur.setText(">");
            state = false;
        }else if(!baslatDurdur.isSelected()){
            baslatDurdur.setSelected(true);
            baslatDurdur.setText("=");
            state = true;
        }
    }//GEN-LAST:event_blueCornerTimeActionPerformed

    private void redCornerTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_redCornerTimeActionPerformed
        if(baslatDurdur.isSelected()){
            baslatDurdur.setSelected(false);
            baslatDurdur.setText(">");
            state = false;
        }else if(!baslatDurdur.isSelected()){
            baslatDurdur.setSelected(true);
            baslatDurdur.setText("=");
            state = true;
        }
    }//GEN-LAST:event_redCornerTimeActionPerformed

    private void kuraNameAdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuraNameAdActionPerformed

        String name = kuraNameTextField.getText();
        if(!kuraNameTextField.equals("") && !kuraNameTextField.equals(" ")){
            model.addElement(name);
        }
        kuraNameTextField.setText("");
    }//GEN-LAST:event_kuraNameAdActionPerformed

    private void kuraNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuraNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kuraNameTextFieldActionPerformed

    private void kuraCekButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuraCekButtonActionPerformed
       
        kuraCek();
        
    }//GEN-LAST:event_kuraCekButtonActionPerformed

    private void kuraSifirlaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kuraSifirlaButtonActionPerformed
          
        for(int i = 0; i < solLabels.size() ;i++){
            solLabels.get(i).setText("");
            sagLabels.get(i).setText("");
            //sagLabels.get(i).setBorder(new LineBorder(Color.gray));
            //.get(i).setBorder(new LineBorder(Color.gray));
            //solLabels.get(i).setPreferredSize(new Dimension(100, 100));
            //sagLabels.get(i).setPreferredSize(new Dimension(100, 100));
            sagLabels.get(i).setFont(new Font("Verdana", Font.PLAIN, 15));
            solLabels.get(i).setFont(new Font("Verdana", Font.PLAIN, 15));

            
        }
           kuraCekButton.setVisible(true);
           kuraNameText.setVisible(true);
           kuraNameAd.setVisible(true);
           kuraNameTextField.setVisible(true);
           kuraNameJList.setVisible(true);
           jScrollPane2.setVisible(true);
        
       while(model.size() > 0){
           model.remove(0);
       }
       while(randomIsimler.size() > 0){
           randomIsimler.remove(0);
       }
       while(kuraIsimleri.size() > 0){
           kuraIsimleri.remove(0);
       }
        
        
    }//GEN-LAST:event_kuraSifirlaButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFrame GirisEkrani;
    private javax.swing.JToggleButton SureRand;
    private javax.swing.JToggleButton baslatDurdur;
    private javax.swing.JCheckBox birbucukdakika;
    private javax.swing.JCheckBox birdakika;
    private javax.swing.JButton blue1;
    private javax.swing.JButton blue2;
    private javax.swing.JButton blue3;
    private javax.swing.JButton blue4;
    private javax.swing.JButton blue5;
    private javax.swing.JButton blueBarButton;
    private javax.swing.JButton blueCezaButon;
    private javax.swing.JComboBox<String> blueComboBox;
    private javax.swing.JButton blueCornerTime;
    private javax.swing.JTextField blueNameTextField;
    private javax.swing.JButton changeButton;
    private javax.swing.JButton devamEtButton;
    private javax.swing.JCheckBox ikidakika;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton kuraCekButton;
    private javax.swing.JFrame kuraEkrani;
    private javax.swing.JButton kuraEkraniButton;
    private javax.swing.JButton kuraNameAd;
    private javax.swing.JList<String> kuraNameJList;
    private javax.swing.JLabel kuraNameText;
    private javax.swing.JTextField kuraNameTextField;
    private javax.swing.JButton kuraSifirlaButton;
    private javax.swing.JToggleButton kırmızıekleKaldir;
    private javax.swing.JButton leftTimeButton;
    private javax.swing.JToggleButton maviekleKaldir;
    private javax.swing.JLabel molaSuresiAyarLabel;
    private javax.swing.JButton msBesArttir;
    private javax.swing.JButton msBesAzalt;
    private javax.swing.JFrame newMatchFrame;
    private javax.swing.JButton newMatchOkeyButton;
    private javax.swing.JButton newmatch;
    private javax.swing.JComboBox<String> raoundComboBox;
    private javax.swing.JButton red1;
    private javax.swing.JButton red2;
    private javax.swing.JButton red3;
    private javax.swing.JButton red4;
    private javax.swing.JButton red5;
    private javax.swing.JButton redBarButton;
    private javax.swing.JButton redCezaButon;
    private javax.swing.JComboBox<String> redComboBox;
    private javax.swing.JButton redCornerTime;
    private javax.swing.JTextField redNameTextField;
    private javax.swing.JButton rightTimeButton;
    private javax.swing.JLabel sag1;
    private javax.swing.JLabel sag10;
    private javax.swing.JLabel sag2;
    private javax.swing.JLabel sag3;
    private javax.swing.JLabel sag4;
    private javax.swing.JLabel sag5;
    private javax.swing.JLabel sag6;
    private javax.swing.JLabel sag7;
    private javax.swing.JLabel sag8;
    private javax.swing.JLabel sag9;
    private javax.swing.JButton scoreboard;
    private javax.swing.JLabel sol1;
    private javax.swing.JLabel sol10;
    private javax.swing.JLabel sol2;
    private javax.swing.JLabel sol3;
    private javax.swing.JLabel sol4;
    private javax.swing.JLabel sol5;
    private javax.swing.JLabel sol6;
    private javax.swing.JLabel sol7;
    private javax.swing.JLabel sol8;
    private javax.swing.JLabel sol9;
    private javax.swing.JButton sureEkle;
    private javax.swing.JFrame sureEkrani;
    private javax.swing.JButton sureSil;
    private javax.swing.JButton sureTutma;
    private javax.swing.JButton sureTutmaBaşlat;
    private javax.swing.JButton sureTutma_arttir;
    private javax.swing.JButton sureTutma_azalt;
    private javax.swing.JLabel sureTutma_round;
    private javax.swing.JLabel sureTutma_sure;
    private javax.swing.JButton sure_ayar;
    private javax.swing.JButton sure_round_ayarla;
    private javax.swing.JButton yeniMacButton;
    // End of variables declaration//GEN-END:variables

    
    
  

    
    public  void maviPuanEkle(int i ){
        
        blueCornerNumber += i;
        
      
    }

    public void maviPuanSil(int i){
        
        if(blueCornerNumber >= 0 + i){
        blueCornerNumber -= i ;
        }
    }
    
    
    public  void kirmiziPuanEkle(int i ){
        
        redCornerNumber += i;
        
      
    }

    public void kirmiziPuanSil(int i){
        
        if(redCornerNumber >= 0 + i){
        redCornerNumber -= i ;
        }
    }
        
        
    public void maviCezaVer(){
        
        if( blueCeza < 10){
            blueCeza += 1;
            redCornerNumber += 1;
        }
        
    }
        
       public void kirmiziCezaVer(){
        
        if( redCeza < 10){
            redCeza += 1;
            blueCornerNumber += 1;
        }
        
    } 
    
       
       public void maviCezaSil(){
           
           if(blueCeza > 0){
               blueCeza -= 1;
               redCornerNumber -= 1;
           }
           
       }
       
       public void kirmiziCezaSil(){
           
           if(redCeza > 0){
               redCeza -= 1;
               blueCornerNumber -= 1;
           }
           
       }
       
      public void winnerYazdir(Color color){
          
          winnerLabel.setBackground(color);
          winnerLabel.setVisible(true);
          devamEtButton.setVisible(true);
          yeniMacButton.setVisible(true);
          
      }
      
      public void winnerKaldir(){
          
          devamEtButton.setVisible(false);
          yeniMacButton.setVisible(false);
          winnerLabel.setVisible(false);
          winnerLabel.setBackground(Color.black);
          
      }
       
       public void kazananBelirle(){
           
           
           
           if(blueCeza == 10){
               if(rules){
              // winnerYazdir(Color.red);
               }
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }else if(redCeza == 10){
               if(rules){
             //  winnerYazdir(Color.blue);
               }
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }
           
           if(blueCornerNumber - redCornerNumber >= 20 && raoundNumber > 2){
               if(rules){
              // winnerYazdir(Color.blue);
               }
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }else if(redCornerNumber - blueCornerNumber >= 20 && raoundNumber > 2){
               if(rules){
               //winnerYazdir(Color.red);
               }
               state = false;
               baslatDurdur.setSelected(false);
               baslatDurdur.setText(">");
           }
           
           
           if(altinVurusLabel.isVisible() && sure < 60){
               if(blueCornerNumber >= 2 ){
                      //winnerYazdir(Color.blue);
                      state = false;
                      baslatDurdur.setSelected(false);
                      baslatDurdur.setText(">");
                  }else if(redCornerNumber >= 2){
                      //winnerYazdir(Color.red);
                      state = false;
                      baslatDurdur.setSelected(false);
                      baslatDurdur.setText(">");
                  }
               
           } if(altinVurusLabel.isVisible() && sure == 0){
               
              

               
               if(blueBar > redBar){
                   //winnerYazdir(Color.blue);
               }else if(redBar > blueBar){
                //winnerYazdir(Color.red);
               }else if(redBar == blueBar){
                  
                   if(blueCeza > redCeza){
                      // winnerYazdir(Color.red);
                   }else if(redCeza > blueCeza){
                      // winnerYazdir(Color.blue);
                   }else if(blueCeza == redCeza){
                       
                      if(blueCeza > redCeza){
                         // winnerYazdir(Color.red);
                      }else if(redCeza > blueCeza){
                          //winnerYazdir(Color.blue);
                      }
                       
                   }
                   
               }
               
               
           }
            
           
           if(raoundNumber == oynanacakRaound && sure == 0 ){
               
              music.PlayMusic(bitirmeSesi);
              molaSure = 0;
               
               if(blueCornerNumber > redCornerNumber){
                  // winnerYazdir(Color.blue);
               }else if(redCornerNumber > blueCornerNumber){
                  // winnerYazdir(Color.red);
                    
               }else if(redCornerNumber == blueCornerNumber){
                   
                   
                   
                   oynanacakRaound++;
                   raoundNumber++;
                   generalSure = 60;
                   sure = 60;
                   state = false;
                   baslatDurdur.setSelected(false);
                   baslatDurdur.setText(">");
                   altinVurusLabel.setVisible(true);
                   raoundLabel.setVisible(false);
                   redBarButton.setVisible(true);
                   blueBarButton.setVisible(true);
                   redBarLabel.setVisible(true);
                   blueBarLabel.setVisible(true);
                   blueCornerNumber = 0;
                   redCornerNumber = 0;
                   redCeza =0;
                   blueCeza = 0;
                   redBar = 0;
                   blueBar =0;
                   
                   
                   
               }
               
               
           }
           
       }
       
       
       public void kuraCek(){
           if(model.getSize() <= 20){
           for(int i = 0; i < model.getSize();i++){
               kuraIsimleri.add(model.getElementAt(i).toString());
           }
           
           while(kuraIsimleri.size() > 0){
              int sayi = r.nextInt(kuraIsimleri.size()) ;
              randomIsimler.add(kuraIsimleri.get(sayi));
              kuraIsimleri.remove(sayi);
              
              
           }
           
           for(int i = 0; i < randomIsimler.size() ;i++){
               
               siraliLabel.get(i).setText(randomIsimler.get(i));
               
           }
           
           
           kuraCekButton.setVisible(false);
           kuraNameText.setVisible(false);
           kuraNameAd.setVisible(false);
           kuraNameTextField.setVisible(false);
           kuraNameJList.setVisible(false);
           jScrollPane2.setVisible(false);
       }
      
       }
       
       
       

}

    



