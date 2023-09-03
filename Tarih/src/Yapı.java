
import java.awt.*;
import java.text.*;
import java.util.*;
import javax.swing.*;
public class Yapı extends JFrame{
	
	Calendar calendar;
	 SimpleDateFormat saatF,gunF,tarihF;
	 JLabel saatY,gunY,tarihY;
	 String saat,gun,tarih ;
	
	Yapı(){
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Pencerenin arka planda calismasini engeller
		this.setTitle("Zaman Penceresi"); //pencerenin adi
		this.setLayout(new FlowLayout()); //Pencere akisini otomatik duzenler
		this.setSize(320, 300); //Pencerenin boyutlari
		this.getContentPane().setBackground(Color.decode("#003153"));
		this.setResizable(false); //Pencerenin yeniden boyutlanmasini engeller
		
		
		saatF= new SimpleDateFormat("a/hh.mm.ss "); //saat yazimi
		gunF= new SimpleDateFormat("EEEE"); //gun yazimi
		tarihF= new SimpleDateFormat("dd MM yyyy"); //tarih yazimi
		
		gunY = new JLabel();
		gunY.setBackground(Color.decode("#7fffd4")); //gun yarları
	    gunY.setFont(new Font("dialog",Font.PLAIN,45));
	    gunY.setForeground(Color.decode("#7fffd4"));
	    
	    tarihY = new JLabel();
		tarihY.setBackground(Color.decode("#7fffd4")); //tarih ayarlari
	    tarihY.setFont(new Font("dialog",Font.PLAIN,45));
	    tarihY.setForeground(Color.decode("#7fffd4"));	
	    
		
		saatY=new JLabel();
		saatY.setFont(new Font("dialog",Font.PLAIN,50)); //saat ayarlari
		saatY.setForeground(Color.decode("#7fffd4"));
		
		
		this.add(gunY); //ekleme islemleri
		this.add(tarihY);	
		this.add(saatY);
		this.setVisible(true);

		ZamanAyarla();
				
	}
	 public void ZamanAyarla() { //eklendikten sonra da zaman akmaya devam etsin
		 while(true) {
			 
			 gun=gunF.format(Calendar.getInstance().getTime());
			 gunY.setText(gun);
			 
			 tarih=tarihF.format(Calendar.getInstance().getTime());
			 tarihY.setText(tarih);
			 
			 saat=saatF.format(Calendar.getInstance().getTime());
			 saatY.setText(saat);
			 
			 
			 
		 }
	 }
	

	
	
}
