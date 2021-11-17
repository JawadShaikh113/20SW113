import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class HardMode extends JFrame implements ActionListener {



	JLabel label10,lb;
	JLabel label;
	JTextArea txt;
	TextField textf;
	JButton bbb,bck;
	String hard,n;
	String[] txtarr=new String[1000];
	String[] hardarr=new String[1000];
	int sc, elapsedTime=60000;
	int right=0,error=0,total=0,percentage=0;
	String abc;
	boolean start=false;
	Cursor cur=new Cursor(Cursor.HAND_CURSOR);
	String Seconds_string=String.format("%02d", sc);
	

	public void Di() {
		
		this.dispose();
	}
	
	
	public void ShowError() {
		

		JFrame frame2=new JFrame();
		frame2.setSize(500,500);
		frame2.setLocationRelativeTo(null);
		

		ImageIcon img=new ImageIcon("bck.jpg");
		Image i5 = img.getImage().getScaledInstance(500, 500, Image.SCALE_DEFAULT);
		ImageIcon i6 = new ImageIcon(i5); 
		
		
		
		JLabel lb2=new JLabel("",i6,JLabel.CENTER);
		lb2.setBounds(0,0,700,700);
		
		JLabel lbl1=new JLabel("Time is up!!");
		lbl1.setBounds(80,70,350,40);
		lbl1.setFont(new Font("Comic Sin",Font.BOLD,30));
		lbl1.setForeground(Color.black);
		lb2.add(lbl1);
		
		JTextArea ta=new JTextArea();
		ta.setBounds(130,250,400,150);
		ta.setText("Your speed is: "+total+"wpm"+"\n"+"Your Accuracy is: "+percentage+"%");
		ta.setOpaque(false);
		ta.setForeground(Color.white);
		ta.setFont(new Font("Comic Sin",Font.BOLD,25));
		
		
		ta.setEditable(false);
		
		frame2.add(ta);
		frame2.add(lb2);
		frame2.setVisible(true);
		
	}
	

	Timer time=new Timer(1000,new ActionListener()
	{
		public void actionPerformed(ActionEvent e)
		{
			elapsedTime-=1000;
			
			sc=(elapsedTime/1000) % 60;
			
			Seconds_string=String.format("%02d", sc);
			
			label.setText(Seconds_string);

			
			if(elapsedTime == 0)
			{
									

		
				
			hard="Strange Bedfellows! lamented the title of a recent letter to Museum News, in which a certain Harriet"
					+ " Sherman excoriated the National Gallery of Art in Washington for its handling of tickets to the"
					+ " much-ballyhooed “Van Gogh’s van Goghs” exhibit. A huge proportion of the 200,000 free tickets were"
					+ " snatched up by the opportunists in the dead of winter, who then scalped those tickets at $85 apiece"
					+ " to less hardy connoiseurs.";
				
				hardarr=hard.split(" ");
				
				abc=textf.getText();
				txtarr=abc.split(" ");
				
				
				for(int i=0;i<txtarr.length;i++)
				{
					
				if(hardarr[i].equals(txtarr[i]))
				{
					right++; 
					
					total++;
					
				}
				
				
				else 
				{
					
					error++;
					
					
					total++;
				}
					
				
			}
				percentage=right*100/total;
				Di();
				ShowError();
				
			
			}
			

	
			
			
			}
	});


	
	public HardMode() 
	{
		label=new JLabel();
		label.setText(Seconds_string);
		label.setBounds(270,390,150,70);
		label.setFont(new Font("Verdana",Font.PLAIN,35));
		label.setBorder(BorderFactory.createBevelBorder(1));
		label.setOpaque(true);
		label.setHorizontalAlignment(JTextField.CENTER);
		label.setForeground(Color.red);
		
		
		
		txt=new JTextArea();
		txt.setBounds(100,100,505,500);
		txt.setText("Strange Bedfellows! lamented the title of a recent letter to Museum News, in which a certain Harriet"
				+ " Sherman excoriated the National Gallery of Art in Washington for its handling of tickets to the"
				+ " much-ballyhooed “Van Gogh’s van Goghs” exhibit. ");
//		txt.setFocusable(false);
		txt.setForeground(Color.white);
		txt.setFont(new Font("Comic Sin",Font.BOLD,17));
//		txt.setBackground(Color.magenta);
		txt.setLineWrap(true);
		txt.setOpaque(false);
		txt.setEditable(false);
		

		
		
		//frame=new JFrame();
		this.setSize(700,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Hard Mode");

		

		ImageIcon img=new ImageIcon("bck.jpg");
		Image i2 = img.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2); 
		
		
		
		JLabel lb=new JLabel("",i3,JLabel.CENTER);
		lb.setBounds(0,0,700,700);
		
		
		bck=new JButton("Go Back");
		bck.setBounds(500,550,120,40);
		bck.setFocusable(false);
		bck.setFont(new Font("TimesRoman",Font.BOLD,20));
		bck.setBackground(Color.magenta);
		bck.setCursor(cur);
		bck.addActionListener(this);
		
		textf=new TextField();
		textf.setBounds(100,230,500,100);
		textf.setBackground(Color.white);
		textf.setFont(new Font("Serif",Font.BOLD,20));
		textf.setForeground(Color.black);
		
		textf.setEditable(false);

		
		
		bbb=new JButton("Start");
		bbb.setBounds(270,470,150,50);
		bbb.setFont(new Font("TimesRoman",Font.BOLD,20));
		bbb.setFocusable(false);
		bbb.addActionListener(this);
		bbb.setOpaque(true);
		bbb.setCursor(cur);
		bbb.setBackground(Color.magenta);
		
		
	
		this.add(bck);
		this.add(bbb);
		this.add(textf);
		this.add(txt);
		this.add(label);
		this.add(lb);
		this.setVisible(true);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==bbb)
		{
			start();
		}
		if(e.getSource()==bck)
		{
			this.dispose();
			NewWindow nw=new NewWindow();
			
		}
	}
	
	void start() {
		textf.setEditable(true);
		bbb.setVisible(false);
		time.start();
	}

	
	




	
	}
