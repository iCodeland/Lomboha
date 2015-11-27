package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Toolkit;

public class GameModeFrame extends JFrame{
	private ImagePanel jpnl_LOGO=new ImagePanel("images/logo_main.png");
	private JButton jbtn_practice = new JButton(new ImageIcon(((new ImageIcon("images/button1_style01.png").getImage()
            .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)))));
	private JButton jbtn_single=new JButton(new ImageIcon(((new ImageIcon("images/button2_style01.png").getImage()
            .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)))));
	private JButton jbtn_multi=new JButton(new ImageIcon(((new ImageIcon("images/button3_style01.png").getImage()
            .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)))));

//	private JLabel imgLabel = new JLabel(new ImageIcon("images/LOGO.png"));
	private Container cp;
	int Width = 400, Height=600;
	
	public GameModeFrame(){
		initComp();
		this.setTitle("Lomboha");												//視窗Title
		this.setIconImage(new ImageIcon("images/logo_icon.png").getImage());	//設定應用程式圖示
	}
	private void initComp(){
//		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
		
		cp=this.getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(204, 255, 204));
		jpnl_LOGO.setBackground(new Color(204, 255, 204));
		
		cp.add(jpnl_LOGO);
		cp.add(jbtn_practice);
		cp.add(jbtn_single);
		cp.add(jbtn_multi);
		
		jpnl_LOGO.setBounds(100,10,240,140);
		jbtn_practice.setBounds(100,150,200,100);
		jbtn_single.setBounds(100,280,200,100);
		jbtn_multi.setBounds(100,410,200,100);
		
		jbtn_practice.setBorder(BorderFactory.createEmptyBorder());
    	jbtn_practice.setContentAreaFilled(false);
    	jbtn_single.setBorder(BorderFactory.createEmptyBorder());
    	jbtn_single.setContentAreaFilled(false);
    	jbtn_multi.setBorder(BorderFactory.createEmptyBorder());
    	jbtn_multi.setContentAreaFilled(false);
		
		jbtn_practice.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model1 frm1=new model1();
				frm1.setVisible(true);
				setVisible(false);
			}
		});
		jbtn_practice.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt){			//點擊目標
				ImageIcon icon = new ImageIcon("images/button1_style03.png");
		        jbtn_practice.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
			}
		    public void mouseEntered(MouseEvent evt) {			//靠近目標
		    	ImageIcon icon = new ImageIcon("images/button1_style02.png");
		        jbtn_practice.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
		    }
		    public void mouseExited(MouseEvent evt) {			//離開目標
		    	ImageIcon icon = new ImageIcon("images/button1_style01.png");
		        jbtn_practice.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
		    }
		});
		
		jbtn_single.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model1 frm1=new model1();
				frm1.setVisible(true);
				setVisible(false);
			}
		});		
		jbtn_single.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt){			//點擊目標
				ImageIcon icon = new ImageIcon("images/button2_style03.png");
		        jbtn_single.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
			}
		    public void mouseEntered(MouseEvent evt) {			//靠近目標
		    	ImageIcon icon = new ImageIcon("images/button2_style02.png");
		    	jbtn_single.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
		    }
		    public void mouseExited(MouseEvent evt) {			//離開目標
		    	ImageIcon icon = new ImageIcon("images/button2_style01.png");
		    	jbtn_single.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
		    }
		});
		
		jbtn_multi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
			}
		});
		jbtn_multi.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent evt){			//點擊目標
				ImageIcon icon = new ImageIcon("images/button3_style03.png");
				jbtn_multi.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
			}
		    public void mouseEntered(MouseEvent evt) {			//靠近目標
		    	ImageIcon icon = new ImageIcon("images/button3_style02.png");
		    	jbtn_multi.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
		    }
		    public void mouseExited(MouseEvent evt) {			//離開目標
		    	ImageIcon icon = new ImageIcon("images/button3_style01.png");
		    	jbtn_multi.setIcon(new ImageIcon(icon.getImage().getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)));
		    }
		});
		
		cp.add(jbtn_practice);
		cp.add(jbtn_single);
		cp.add(jbtn_multi);
	}
}
