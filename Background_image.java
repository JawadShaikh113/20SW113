import javax.swing.*;
import java.awt.*;

public class Background_image extends JFrame {

	//JFrame frame;
	public Background_image() {
		
		
		
		
		//frame=new JFrame("typing game");
		this.setSize(600,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		ImageIcon img=new ImageIcon("bck.jpg");
		Image i2 = img.getImage().getScaledInstance(600, 600, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		
		JLabel lbl=new JLabel("",i3,JLabel.CENTER);
		lbl.setBounds(0,0,600,600);
		
		
		this.add(lbl);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Background_image();

	}

}
