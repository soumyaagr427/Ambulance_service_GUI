
package java_project;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.awt.image.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;


class MyFrame extends JFrame {
	JPanel image,main,calculate,hospital,pinfo,service; //reference
	
	//for info panel
	JTextField tf1,tf2,tf3,tf4;
	JLabel l1,l2,l3,l4,l5,l6;
	JRadioButton c1,c2;
	
	//for service panel
	JLabel head;
	JRadioButton c3,c4,c5,c6,c7,c8,c9,c10,c11,c12;
	
	
	ButtonGroup bg1,bg2,bg3;
	JButton submit,submit1;;
	
	//for hospital panel
	JLabel l7,l8,l9;
	JTextArea tf5,tf6,tf7;
	JButton km1,km2,km3,submit2;
	
	//for payments and bill
	JLabel head2,l10,l11,l12,l13,l14,l15;
	JTextField tf8,tf9,tf10;
	JTextField pf1,pf2,pf3;
	JButton km4;
	JRadioButton r1,r2,r3;
	
	public MyFrame() {
		
		super("AMBULANCE SERVICE PROVIDER");
		
		pinfo =new JPanel();
		pinfo.setBackground(SystemColor.white);
		service =new JPanel();
		service.setBackground(SystemColor.white);
		calculate =new JPanel();
		calculate.setBackground(SystemColor.white);
		hospital =new JPanel();
		hospital.setBackground(SystemColor.white);
		
		JTabbedPane tb = new JTabbedPane();
		
		
		submit= new JButton("SUBMIT");
		submit1= new JButton("SUBMIT");
		submit2= new JButton("NEXT");
		
		
		 JLabel lblNewLabel = new JLabel(" ambulance");
		 lblNewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/p1.jpg")));
		 lblNewLabel.setBounds(5,5,969,272);
		 pinfo.add(lblNewLabel);
      
        
        
		tb.add("			        Patient Information            ",pinfo);
		tb.add("			        Service Availiability	       ",service);
		tb.add("			        Associated Hospitals           ",hospital);
		tb.add("			        Payment and bill              ",calculate);
		tb.setFont(new Font("Century Schoolbook", Font.BOLD, 14));
		add(tb);
		
		
		 //info panel
	 	 l1=new JLabel("Name");
	 	 l1.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		 l2=new JLabel("Contact.NO");
		 l2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		 l3=new JLabel("Gender");
		 l3.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		 l4=new JLabel("Pathology");
		 l4.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		 l5=new JLabel("D.O. SERVICE");
		 l5.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 14));
		 l6=new JLabel("Date  ");
		 l6.setFont(new Font("Arial Narrow", Font.PLAIN, 14));
		 
		 tf1=new JTextField("");
		 tf2=new JTextField("");
		 tf3=new JTextField("");
		 tf4=new JTextField("");
		
		 pinfo.setLayout(null);
		 tf1.setBounds(EXIT_ON_CLOSE, ABORT, WIDTH, HEIGHT);
		
		 bg1= new ButtonGroup();
		 c1=new JRadioButton("Male");
		 c2=new JRadioButton("Female");
		 bg1.add(c1);
		 bg1.add(c2);
		 
		 //bounds for the components
		 
		 
		 	l1.setBounds(350, 348, 146, 25);
		 	l2.setBounds(350, 419, 146, 25);
			l3.setBounds(350, 480, 146, 25);
			l4.setBounds(350, 547, 146, 25);
			l5.setBounds(350, 600, 142, 49);
			l6.setBounds(800, 680, 185, 49);
			
			tf1.setBounds(500, 348, 146, 25);
			tf2.setBounds(500, 419, 146, 25);
			tf3.setBounds(500, 547, 146, 25);
			tf4.setBounds(500, 610, 142, 25);
			
			c1.setBounds(500, 480, 60, 25);
			c2.setBounds(580, 480, 80, 25);
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			l6.setText("Date: "+dateFormat.format(cal.getTime()));
			
			
			submit1.setBounds(450, 670, 100, 25);
			submit1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb.setSelectedIndex(tb.getSelectedIndex()+1);
			}
			
		});
			
		 pinfo.add(tf1);
		 pinfo.add(tf2);
		 pinfo.add(tf3);
		 pinfo.add(tf4);
		 
		 pinfo.add(l1);
		 pinfo.add(l2);
		 pinfo.add(l3);
		 pinfo.add(l4);
		 pinfo.add(l5);
		 pinfo.add(l6);
		
		 pinfo.add(c1);
		 pinfo.add(c2);
		 pinfo.add(submit1);
		 
		// info tab panel closed
		 //service tab panel
		 head = new JLabel("CHOOSE YOUR LOCALITY");
		 head.setFont(new Font("Century Gothic", Font.BOLD, 16));
		 head.setBounds(620,91,195,35); //extra label for
		 
		 bg2= new ButtonGroup();
		 c3=new JRadioButton("CHAMPA");
		 c3.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c4=new JRadioButton("DIBRUGARH");
		 c4.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c5=new JRadioButton("JANJGIR");
		 c5.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c6=new JRadioButton("KORBA");
		 c6.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c7=new JRadioButton("NAILA");
		 c7.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c8=new JRadioButton("CHABUA");
		 c8.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c9=new JRadioButton("SAKTI");
		 c9.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c10=new JRadioButton("SHIVASAGAR");
		 c10.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c11=new JRadioButton("JORHAT");
		 c11.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 c12=new JRadioButton("PANITOLA");
		 c12.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 
		 bg2.add(c3);
		 bg2.add(c4);
		 bg2.add(c5);
		 bg2.add(c6);
		 bg2.add(c7);
		 bg2.add(c8);
		 bg2.add(c9);
		 bg2.add(c10);
		 bg2.add(c11);
		 bg2.add(c12);
		  

		 JLabel lb2NewLabel = new JLabel(" ");
		 lb2NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/s1.jpg")));
		lb2NewLabel.setBounds(240,41,195,190);
		service.add(lb2NewLabel);//added

		 JLabel lb3NewLabel = new JLabel(" ");
		 lb3NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/s2.jpg")));
		lb3NewLabel.setBounds(20,166,195,190);
		service.add(lb3NewLabel);//added

		 JLabel lb4NewLabel = new JLabel(" ");
		 lb4NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/s3.jpg")));
		lb4NewLabel.setBounds(240,265,195,190);
		service.add(lb4NewLabel);//added

		 JLabel lb5NewLabel = new JLabel(" ");
		 lb5NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/s4.jpg")));
		lb5NewLabel.setBounds(20,370,195,190);
		service.add(lb5NewLabel);//added
		
		 JLabel lb6NewLabel = new JLabel(" ");
		 lb6NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/s5.jpg")));
		lb6NewLabel.setBounds(240,475,195,190);
		service.add(lb6NewLabel);//added
		
		
		
		 service.add(submit);
		 submit.setBounds(685, 670, 100, 25);
		 submit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tb.setSelectedIndex(tb.getSelectedIndex()+1);
					
				}
				
			});
		
		 
		 c3.setBounds(540, 202, 109, 23);
		 c4.setBounds(800, 202, 120, 23);
		 c5.setBounds(540, 285, 109, 23);
		 c6.setBounds(800, 285, 109, 23);
		 c7.setBounds(540, 366, 109, 23);
		 c8.setBounds(800, 366, 109, 23);
		 c9.setBounds(540, 457, 109, 23);
		 c10.setBounds(800, 457, 130, 23);
		 c11.setBounds(540, 537, 109, 23);
		 c12.setBounds(800, 537, 109, 23);
		 
		 
		 service.setLayout(null);
		 //adding these components to panel
		 service.add(head);
		 
		 service.add(c3);
		 service.add(c4);
		 service.add(c5);
		 service.add(c6);
		 service.add(c7);
		 service.add(c8);
		 service.add(c9);
		 service.add(c10);
		 service.add(c11);
		 service.add(c12);
		 
		 
		 
		 //service panel closed
		 
		 //hospital panel open 
		 tf5=new JTextArea(5,15);
		 tf5.setText(" Born out of a vision to provide healthcare to all strata of society,\n "
		 		+ "Nanavati Super Specialty Hospital,\n Champa opened its doors in  1950 and since has grown  "
		 		+ "strength by strength \n into one of the most reputed tertiary care  hospitals in India.\n "
		 		+ "Continuously striving for the best of healthcare at very affordable prices");

	    	tf5.setFont(new Font("Serif", Font.ITALIC, 11));
	    	tf5.setLineWrap(true);
	    	tf5.setWrapStyleWord(true);
		 	tf5.setVisible(false);
		 	
		 tf6=new JTextArea(" his 21 storeyed tertiary care medical center has  become the epitome \n"
			 		+ " of healthcare for Dibrugard residents. Initiated with a strong vision of serving \n "
			 		+ "every discipline of medical science, Wockhardt hospital  has successfully achieved \n"
			 		+ " its aim over the years. Best doctors and surgeons,  highly trained support staff \n "
			 		+ "and high class infrastructure facilities make this  hospital a preferred health care \n"
			 		+ " destination for people across Mumbai and its neighborhoods.");
		 
				    	tf6.setFont(new Font("Serif", Font.ITALIC, 11));
				    	tf6.setLineWrap(true);
				    	tf6.setWrapStyleWord(true);
				    	tf6.setVisible(false);
		 tf7=new JTextArea(" Ruby Hall clinic is one of the oldest and most trusted hospitals "
		 		+ "in Korba. Since its inception in 1959,\n"
		 		+ " \n the hospital has grown and expanded to include  almost \n every medical and surgical specialty. "
		 		+ "It has been conferred with the \n coveted NABH accreditation.");
		    tf7.setFont(new Font("Serif", Font.ITALIC, 11));
	    	tf7.setLineWrap(true);
	    	tf7.setWrapStyleWord(true);
		 	tf7.setVisible(false);
		 	
		 	tf5.setEditable(false);
		 	tf6.setEditable(false);
		 	tf7.setEditable(false);
		 	
		 l7=new JLabel("   Nanavati Super Speciality Hospital ");
		 l7.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 l8=new JLabel("   Wockhardt life caring Hospital  ");
		 l8.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 l9=new JLabel("   Sanjeevani for people Hospital  ");
		 l9.setFont(new Font("Century Gothic", Font.BOLD, 14));
		 
		 km1= new JButton("KNOW MORE");
		 	km1.setBounds(389, 155, 118, 39);
			km1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf5.setVisible(true);
			}
			
		});
		 	
		 km2= new JButton("KNOW MORE");
		 	km2.setBounds(389, 383, 118, 39);
		 	km2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf6.setVisible(true);
				}
				
			});
			 	
		 	
		 km3= new JButton("KNOW MORE");
		 	km3.setBounds(389, 599, 118, 39);
		 	km3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					tf7.setVisible(true);
				}
				
			});
			 	
		 	submit2.setBounds(470, 680, 100, 25);
			submit2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tb.setSelectedIndex(tb.getSelectedIndex()+1);
			}
			
		});

		 JLabel lb7NewLabel = new JLabel(" ambulance");
		 lb7NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/h1.jpeg")));
		lb7NewLabel.setBounds(29,39,262,195);
		hospital.add(lb7NewLabel);//added

		 JLabel lb8NewLabel = new JLabel(" ambulance");
		 lb8NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/h2.jpeg")));
		lb8NewLabel.setBounds(29,267,262,195);
		hospital.add(lb8NewLabel);//added

		 JLabel lb9NewLabel = new JLabel(" ambulance");
		 lb9NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/h3.jpeg")));
		lb9NewLabel.setBounds(29,486,262,195);
		hospital.add(lb9NewLabel);//added
		 
		hospital.setLayout(null);
		
		l7.setBounds(320, 39,  310, 39);
		l8.setBounds(320, 267, 310, 39);
		l9.setBounds(320, 486, 280, 39);
		 
		tf5.setBounds(550, 92,  370, 122);
		tf6.setBounds(550, 324, 370, 122);
		tf7.setBounds(550, 541, 370, 122);
		
		
		 hospital.add(tf5);
		 hospital.add(tf6);
		 hospital.add(tf7);
		 
		 hospital.add(l7);
		 hospital.add(l8);
		 hospital.add(l9);
		 
		 hospital.add(km1);
		 hospital.add(km2);
		 hospital.add(km3);
		 hospital.add(submit2);
		 
		 //hospital closed
		 
		 //payment and bill start
		 
		 JPanel pan5 = new JPanel();
			pan5.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED, new Color(0, 0, 0), new Color(0, 0, 0), null, null), "Owner's Detail", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
			pan5.setBackground(Color.WHITE);
			pan5.setBounds(30, 126, 282, 246);		
			pan5.setLayout(null);
		
			
		 calculate.add(pan5);
		 
		 head2=new JLabel("PAYMENTS AND BILLS");
		 head2.setFont(new Font("Copperplate Gothic Bold", Font.PLAIN, 19));
		 
		 l10=new JLabel("Location Rate");
		 l10.setFont(new Font("Candara", Font.BOLD, 14));
		 l11=new JLabel("Select Hospital :");
		 l11.setFont(new Font("Candara", Font.BOLD, 14));
		 l12=new JLabel("COST AS PER DAY");
		 l12.setFont(new Font("Candara", Font.BOLD, 14));
		 l13=new JLabel("FINAL AMOUNT");
		 l13.setFont(new Font("Candara", Font.BOLD, 14));
		 
		 
		
			
		 l14=new JLabel("Name of the Owners");
		 l14.setFont(new Font("Candara", Font.BOLD, 12));
		 l14.setBounds(79, 41, 180, 22);
		 
		 l15=new JLabel("Contact to get your hospital added");
		 l15.setFont(new Font("Candara", Font.BOLD, 12));
	   	 l15.setBounds(35, 158, 224, 14);
			
		 tf8=new JTextField("       ");
		 tf9=new JTextField("       ");
		 tf10=new JTextField("       ");
		 
		 pf1=new JTextField("");
		 pf1.setText("SIDHARTHA PARASMKA");
		 pf1.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 13));
		 pf1.setBounds(34, 76, 145, 24);
		 pf1.setEditable(false);
		 
		 pf2=new JTextField("SOUMYA AGRAWAL");
		 pf2.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 13));
		 pf2.setBounds(34, 111, 145, 24);
		 pf2.setEditable(false);
		 
		 pf3=new JTextField("Ambulance4YOU@gmail.com");
		 pf3.setFont(new Font("Berlin Sans FB Demi", Font.BOLD | Font.ITALIC, 13));
		 pf3.setBounds(34, 189, 225, 20);
		 pf3.setEditable(false);
		 
		 
		 tf8.setEditable(false);
		 tf9.setEditable(false);
		 tf10.setEditable(false);
		 
		 
		 bg3= new ButtonGroup();
		 r1=new JRadioButton("Nanavati.S.S.");
		 r2=new JRadioButton("Wockhardt");
		 r3=new JRadioButton("Sanjeevani");
		 bg3.add(r1);
		 bg3.add(r2);
		 bg3.add(r3);
		 
		 km4=new JButton("CALCULATE");
		 
		 
		 
		 
		 km4.setBounds(509, 303, 109, 32);
		
		 
		 km4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					int amount=0;
					if(c3.isSelected()) {
						amount=3000;
						tf8.setText(amount+"");
					}
					if(c4.isSelected()) {
						amount=3500;
						tf8.setText(amount+"");
					}
					if(c5.isSelected()) {
						amount=5000;
						tf8.setText(amount+"");
					}
					if(c6.isSelected()) {
						amount=4500;
						tf8.setText(amount+"");
					}
					if(c7.isSelected()) {
						amount=5000;
						tf8.setText(amount+"");
					}
					if(c8.isSelected()) {
						amount=5500;
					tf8.setText(amount+"");
					}
					if(c9.isSelected()) {
						amount=2500;
					tf8.setText(amount+"");
					}
					if(c10.isSelected()) {
						amount=3100;
					tf8.setText(amount+"");
					}
					if(c11.isSelected()) {
						amount=3700;
					tf8.setText(amount+"");
					}
					if(c12.isSelected()) {
						amount=4100;
					tf8.setText(amount+"");
					}
					if(amount!=0) {
						if(r1.isSelected())
							amount+=2700;
						if(r2.isSelected())
							amount+=2540;
						if(r3.isSelected())
							amount+=4000;
					}
					tf9.setText(amount+"");
					int days=Integer.parseInt(tf4.getText());
					amount*=days;
					tf10.setText(amount+"");
				}
			});
		 
		 
		 JLabel lb10NewLabel = new JLabel(" ambulance");
		 lb10NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/l1.png")));
		lb10NewLabel.setBounds(30,512,275,198);
		calculate.add(lb10NewLabel);//added

		 JLabel lb11NewLabel = new JLabel(" ambulance");
		 lb11NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/l2.png")));
		lb11NewLabel.setBounds(345,512,275,198);
		calculate.add(lb11NewLabel);//added

		 JLabel lb12NewLabel = new JLabel(" ambulance");
		 lb12NewLabel.setIcon(new ImageIcon(ambulance.class.getResource("/java_project/l3.png")));
		lb12NewLabel.setBounds(670,512,275,198);
		calculate.add(lb12NewLabel);//added
		 
		head2.setBounds(452, 32, 258, 42);
		
		l10.setBounds(373, 122, 131, 20);
		l11.setBounds(373, 147, 131, 132);
		l12.setBounds(596, 356, 120, 25);
		l13.setBounds(596, 410, 100, 25);
		
		tf8.setBounds(575, 124, 148, 20);
		tf9.setBounds(800, 356, 109, 22);
		tf10.setBounds(800, 410, 109, 20);
		
		r1.setBounds(575, 192, 109, 23);
		r2.setBounds(798, 192, 109, 23);
		r3.setBounds(575, 243, 109, 23);
		
		calculate.add(head2);
		
		calculate.add(l10);
		calculate.add(l11);
		calculate.add(l12);
		calculate.add(l13);
		pan5.add(l14);
		pan5.add(l15);
		
		calculate.add(tf8);
		calculate.add(tf9);
		calculate.add(tf10);
		pan5.add(pf1);
		pan5.add(pf2);
		pan5.add(pf3);
		
		calculate.add(r1);
		calculate.add(r2);
		calculate.add(r3);
		
		calculate.add(km4);
		 
		 calculate.setLayout(null);
		 
		 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//window event JFrame
	}
	
}
public class ambulance{
	public static void main(String[] args) {
		MyFrame f = new MyFrame();
		f.setSize(1000,800);
		f.setVisible(true);
	}
}
