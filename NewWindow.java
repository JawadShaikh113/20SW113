import javax.swing.*;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.*
;
public class NewWindow extends JFrame implements ActionListener {


	JLabel l,l2,lble;
	
	
	JComboBox cb;
	JButton butn1,backbtn;
	
	
	public NewWindow() {
		
		Cursor cs=new Cursor(Cursor.HAND_CURSOR);
		
		
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setTitle("Choose Difficulty");
		this.setLocationRelativeTo(null);
		
		
		ImageIcon img=new ImageIcon("bck.jpg");
		Image i2 = img.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2); 
		
		lble=new JLabel("",i3,JLabel.CENTER);
		lble.setBounds(0,0,600,600);
		
		
		l=new JLabel();
		l.setText("Test your typing ability in just One minute");
		l.setBounds(40,0,500,50);
		l.setFont(new Font("Algerian",Font.BOLD,20));
		l.setForeground(Color.white);
		
		l2=new JLabel();
		l2.setText("Please Choose difficulty: ");
		l2.setBounds(70,150,500,50);
		l2.setFont(new Font("Mv Boli",Font.BOLD,20));
		l2.setForeground(Color.white);
		
		
		 
		 
		butn1=new JButton("Start Game");
		butn1.setBounds(225,300,150,40);
		butn1.setFocusable(false);
		butn1.setFont(new Font("TimesRoman",Font.BOLD,20));
		butn1.addActionListener(this);
		butn1.setBackground(Color.magenta);
		butn1.setCursor(cs);
//		butn1.setOpaque(false);
		
		 
		backbtn=new JButton("Go Back");
		backbtn.setBounds(400,450,120,40);
		backbtn.setFocusable(false);
		backbtn.setFont(new Font("TimesRoman",Font.BOLD,20));
		backbtn.setBackground(Color.magenta);
		backbtn.setCursor(cs);
		backbtn.addActionListener(this);
		lble.add(backbtn);
		
		
		
		
		String data[] = { "Easy", "Hard"};
		cb=new JComboBox(data);
		cb.setBounds(225,230,150,40);
		cb.setFont(new Font("Dialog",Font.PLAIN,20));
		cb.setBackground(Color.magenta);
		cb.setCursor(cs);

		lble.add(cb);
		

		
		
		
		this.add(butn1);
		this.add(l);
		this.add(l2);
		this.add(lble);

		this.setVisible(true);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==butn1)
		{
			if(cb.getSelectedItem() == "Easy")
			{

				this.dispose();
				EasyMode mode=new EasyMode();


            }

            if(cb.getSelectedItem() == "Hard")
            {


            	this.dispose();
            	HardMode hm=new HardMode();
            }
            
		}
            if(e.getSource()==backbtn)
            {
            	this.dispose();
            	TypingGame tp=new TypingGame();
            }
           
		}
		
		
		}
		
	


