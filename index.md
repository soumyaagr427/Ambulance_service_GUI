## AMBULANCE SERVICE PROVIDER
A Advance Ambulance Booking Gui Java Project that can used to get an ambulance service for remote areas.
The application takes patient information and guides him through different the areas in which the services are provided along with different hospitals we have tied up with followed by the payment screen, Where Total bill is calculated based on the location of services, hospital selected and number of days the service is required.

## Building Process

This project was build by two People me (soumya Agrawal)and my teammate (sidhartha Parasramka)  as project to demonstrate our skills that we have mastered during our 2nd year in the college

We have used various advance concepts such as jawa swings that are widely used in the indusrty.
markdown
Concepts used

-object orient programing
-Problem solving
-JAVA Swings

#A Peice of our code

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



### OUTCOME

During the building process of this project we came across a lot of problems in our code but we overcame those by going through the various topics related to our project. It have been great experience for us to get to know the industry level of programing and know how we can apply those concepts in real world projects

### Support or Contact

Having some quaries? you can reach us through our linkdin profile [Sidhartha Parasramka](https://www.linkedin.com/in/sidhartha-parasramka/) or [Soumya Agrawal](https://www.linkedin.com/in/soumyaagrawal427/) and we’ll help you sort it out.## AMBULANCE SERVICE PROVIDER
A Advance Ambulance Booking Gui Java Project that can used to get an ambulance service for remote areas.
The application takes patient information and guides him through different the areas in which the services are provided along with different hospitals we have tied up with followed by the payment screen, Where Total bill is calculated based on the location of services, hospital selected and number of days the service is required.

## Building Process

This project was build by two People me(sidhartha Parasramka) and my teammate(soumya Agrawal) as project to demonstrate our skills that we have mastered during our 2nd year in the college

We have used various advance concepts such as jawa swings that are widely used in the indusrty.
markdown
Concepts used

-object orient programing
-Problem solving
-JAVA Swings

#A Peice of our code

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



### OUTCOME

During the building process of this project we came across a lot of problems in our code but we overcame those by going through the various topics related to our project. It have been great experience for us to get to know the industry level of programing and know how we can apply those concepts in real world projects

### Support or Contact

Having some quaries? you can reach us through our linkdin profile [Sidhartha Parasramka](https://www.linkedin.com/in/sidhartha-parasramka/) or [Soumya Agrawal](https://www.linkedin.com/in/soumyaagrawal427/) and we’ll help you sort it out.
