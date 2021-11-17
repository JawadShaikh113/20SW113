import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class EasyMode extends JFrame implements ActionListener {



	JLabel label10,lb;
	JLabel label;
	JTextArea txt;
	TextField textf;
	JButton bbb,bck;
	String easy,n;
	String[] txtarr=new String[1000];
	String[] easyarr=new String[1000];
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

			
			if(elapsedTime ==  0)
			{
									

		
				
			easy="Moon is a barren, rocky world without air and water. It has dark lava plain on its surface."
			+ " The Moon is filled wit craters. It has no light of its own. It gets its light from the Sun."
			+ " The Moo keeps changing its shape as it moves round the Earth.";
				
				easyarr=easy.split(" ");
				
				abc=textf.getText();
				txtarr=abc.split(" ");
				
				
				for(int i=0;i<txtarr.length;i++)
				{
					
				if(easyarr[i].equals(txtarr[i]))
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


	
	public EasyMode() 
	{
		label=new JLabel();
		label.setText(Seconds_string);
		label.setBounds(270,370,150,70);
		label.setFont(new Font("Verdana",Font.PLAIN,35));
		label.setBorder(BorderFactory.createBevelBorder(1));
		label.setOpaque(true);
		label.setHorizontalAlignment(JTextField.CENTER);
		label.setForeground(Color.red);
		
		
		txt=new JTextArea();
		txt.setBounds(100,100,505,500);
		txt.setText("Moon is a barren, rocky world without air and water. It has dark lava plain on its"
			+ " surface. The Moon is filled with craters. It has no light of its own. It gets its light from "
			+ "the Sun. The Moon keeps changing its shape as it moves round the Earth.");
//		txt.setFocusable(false);
		txt.setForeground(Color.white);
		txt.setFont(new Font("Comic Sin",Font.BOLD,17));
//		txt.setBackground(Color.magenta);
		txt.setLineWrap(true);
		txt.setOpaque(false);
		txt.setEditable(false);
		

		
		
		
		this.setSize(700,700);
		this.setTitle("Easy Mode");
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);

		

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
		textf.setBounds(100,220,500,100);
		textf.setBackground(Color.white);
		textf.setFont(new Font("Serif",Font.BOLD,20));
		textf.setForeground(Color.black);
		
		textf.setEditable(false);
				
		bbb=new JButton("Start");
		bbb.setBounds(270,450,150,50);
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
