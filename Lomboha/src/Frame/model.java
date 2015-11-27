package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Toolkit;

public class model extends JFrame{
	private ImagePanel jpnl=new ImagePanel("images/logo_main.png");
//	private JButton ex=new JButton("練習");
	private JButton one=new JButton("單人");
	private JButton two=new JButton("連線");
	JButton ex = new JButton(new ImageIcon(((new ImageIcon("images/button1_style01.png").getImage()
            .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)))));
//	private JLabel imgLabel = new JLabel(new ImageIcon("images/LOGO.png"));
	private Container cp;
	int Width = 400, Height=600;
	
	public model(){
		frame_modle();
	}
	private void frame_modle(){
		this.setIconImage(new ImageIcon("images/logo_icon.png").getImage());			//設定應用程式圖示
//		this.setResizable(false);
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
		
		ex.setBorder(BorderFactory.createEmptyBorder());
    	ex.setContentAreaFilled(false);
    	one.setBorder(BorderFactory.createEmptyBorder());
    	one.setContentAreaFilled(false);
    	two.setBorder(BorderFactory.createEmptyBorder());
    	two.setContentAreaFilled(false);
		
		ex.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model1 frm1=new model1();
				frm1.setVisible(true);
				setVisible(false);
			}
		});
		ex.addMouseListener(new java.awt.event.MouseAdapter() {
		    public void mouseEntered(java.awt.event.MouseEvent evt) {			//靠近目標
		    	ImageIcon icon = new ImageIcon("images/button1_style02.png");
		        ex.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
		    }
		    public void mouseExited(java.awt.event.MouseEvent evt) {
		    	ImageIcon icon = new ImageIcon("images/button1_style01.png");	//離開目標
		        ex.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
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
