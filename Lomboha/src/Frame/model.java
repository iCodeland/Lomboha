package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Toolkit;

public class model extends JFrame{
	private ImagePanel jpnl=new ImagePanel("images/LOGO.png");
	private JButton ex=new JButton("練習");
	private JButton one=new JButton("單人");
	private JButton two=new JButton("連線");
//	private JLabel imgLabel = new JLabel(new ImageIcon("images/LOGO.png"));
	private Container cp;
	int Width = 400, Height=600;
	
	public model(){
		frame_modle();
	}
	private void frame_modle(){
		this.setIconImage(new ImageIcon("images/icon.png").getImage());			//設定應用程式圖示
		this.setResizable(false);
		this.setTitle("Lomboha");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
		
		cp=this.getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(204, 255, 204));
		jpnl.setBackground(new Color(204, 255, 204));
		
		cp.add(jpnl);
		cp.add(ex);
		cp.add(one);
		cp.add(two);
		
		jpnl.setBounds(80,20,240,100);
		ex.setBounds(100,150,200,100);
		one.setBounds(100,280,200,100);
		two.setBounds(100,410,200,100);
		
		ex.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model1 frm1=new model1();
				frm1.setVisible(true);
				setVisible(false);
			}
		});
		
		one.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model1 frm1=new model1();
				frm1.setVisible(true);
				setVisible(false);
			}
		});
		
		two.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
			}
		});
		
		cp.add(ex);
		cp.add(one);
		cp.add(two);
	}
}
