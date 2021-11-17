import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TypingGame extends JFrame implements ActionListener{

//	JFrame frame1,Frame2;
	JButton btn1,btn2;
	JLabel lbl,lbl1,lbl2;
	
	
	public TypingGame() {
		Cursor var=new Cursor(Cursor.HAND_CURSOR);
		
		
		ImageIcon mg=new ImageIcon("playbtn.png");
        Image i4 = mg.getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT);
        ImageIcon i5 = new ImageIcon(i4);
		
		
		lbl1=new JLabel();
		lbl1.setText("Wellcome to Star Typing test");
		lbl1.setBounds(30,10,500,70);
		lbl1.setFont(new Font("ALGERIAN",Font.BOLD,30));
		lbl1.setForeground(Color.white);
		
		
		
		ImageIcon img=new ImageIcon("bck.jpg");
		Image i2 = img.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2); 
		
		JLabel lbl=new JLabel("",i3,JLabel.CENTER);
		lbl.setBounds(0,0,600,600);
		
		
		btn1=new JButton();
		
		btn1.setText("Play");
		btn1.setBounds(235,180,130,50);
		btn1.addActionListener(this);
		btn1.setFocusable(false);
		btn1.setIcon(i5);
		btn1.setFont(new Font("TimesRoman",Font.BOLD,20));
		btn1.setBackground(Color.magenta);
		btn1.setCursor(var);

		
		
		
		
		
		btn2=new JButton("Exit Game");
		btn2.setBounds(235,270,130,50);
		btn2.addActionListener(this);
		btn2.setFocusable(false);
		btn2.setFont(new Font("TimesRoman",Font.BOLD,20));
		btn2.setBackground(Color.magenta);
		btn2.setCursor(var);
//		btn2.setOpaque(false);
		
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		this.setTitle("Mainmenu");
		
		this.add(btn1);
		this.add(btn2);
		this.add(lbl1);
//		this.add(lbl2);
		
		this.add(lbl);
		
		
		this.setVisible(true);
		
	}

	public void close()
	{
		WindowEvent clswin=new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(clswin);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==btn1)
		{
			this.dispose();
			NewWindow lp=new NewWindow();
		}
		
		
		
		else close();
	}

}
