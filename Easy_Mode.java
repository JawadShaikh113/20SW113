import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Easy_Mode extends JFrame implements ActionListener {


//			JFrame frame;
			JLabel label,label10,lb;
			TextArea txt;
			TextField textf;
			JButton bbb;
			String easy;
	
		
		public void Easy_Mode() 
		{
			
			
		
		this.setSize(700,700);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		

		ImageIcon img=new ImageIcon("bck.jpg");
		Image i2 = img.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2); 
		
		JLabel lb=new JLabel("",i3,JLabel.CENTER);
		lb.setBounds(0,0,700,700);

		
		easy="Moon is a barren, rocky world without air and water. It has dark lava plain on its surface."
				+ " The Moon is filled wit craters. It has no light of its own. It gets its light from the Sun."
				+ " The Moo keeps changing its shape as it moves round the Earth.";
		String arr1[]=easy.split(" ");
		
		
		textf=new TextField();
		textf.setBounds(100,300,500,50);
		textf.setBackground(Color.gray);
		textf.setFont(new Font("Serif",Font.BOLD,30));
		textf.setForeground(Color.black);
		
		String n = textf.getText();
		String txtarr[]=n.split(" ");
		
		
		bbb=new JButton("click");
		bbb.setBounds(250,150,100,50);
		bbb.setFocusable(false);
		bbb.addActionListener(this);
		bbb.setOpaque(false);
		
		
		
		
		
		this.add(textf);
		this.add(bbb);
		this.add(lb);
//		this.add(label);
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
	if(e.getSource()==bbb)
	{
		String abc=textf.getText();
		if(abc.equals(easy)) 
		{
		JOptionPane.showMessageDialog(null,"ok" );
		
		
	}
		else {
			JOptionPane.showMessageDialog(null,"notok" );
		}
}
	
	




	
	}
}
		

