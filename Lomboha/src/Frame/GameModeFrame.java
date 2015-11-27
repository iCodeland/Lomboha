package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import Component.ImageButton;
import Component.ImagePanel;

public class GameModeFrame extends JFrame{
	private ImagePanel jpnl_LOGO = new ImagePanel("images/logo_main.png",200,165);
	private ImageButton jbtn_practice = new ImageButton("images/button1_style01.png",200,100);
	private ImageButton jbtn_single = new ImageButton("images/button2_style01.png",200,100);
	private ImageButton jbtn_multi = new ImageButton("images/button3_style01.png",200,100);
//	private JLabel imgLabel = new JLabel(new ImageIcon("images/LOGO.png"));
	private Container cp;
	int Width = 400, Height=600;
	
	public GameModeFrame(){
		initComp();
		setWindow();
	}
	private void setWindow(){
		this.setTitle("Lomboha");												//視窗Title
		this.setSize(Width, Height);											//設定視窗大小
		this.setLocationRelativeTo(this);										//設定視窗初始位置在螢幕中心
		this.setIconImage(new ImageIcon("images/logo_icon.png").getImage());	//設定應用程式圖示
//		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	private void initComp(){
		cp=this.getContentPane();
		cp.setLayout(null);
		cp.setBackground(new Color(204, 255, 204));
		jpnl_LOGO.setOpaque(false);
		
		cp.add(jpnl_LOGO);
		cp.add(jbtn_practice);
		cp.add(jbtn_single);
		cp.add(jbtn_multi);
		
		jpnl_LOGO.setBounds(100,10,195,160);
		jbtn_practice.setBounds(100,180,200,100);
		jbtn_single.setBounds(100,310,200,100);
		jbtn_multi.setBounds(100,440,200,100);
		
		jbtn_practice.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model1 frm1=new model1();
				frm1.setVisible(true);
				setVisible(false);
			}
		});
		
		
		jbtn_single.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model1 frm1=new model1();
				frm1.setVisible(true);
				setVisible(false);
			}
		});		
		
		jbtn_multi.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				
			}
		});
		
		jbtn_practice.addEffectIcon("images/button1_style01.png", "images/button1_style02.png", "images/button1_style03.png");
		jbtn_single.addEffectIcon("images/button2_style01.png", "images/button2_style02.png", "images/button2_style03.png");
		jbtn_multi.addEffectIcon("images/button3_style01.png", "images/button3_style02.png", "images/button3_style03.png");
		
		cp.add(jbtn_practice);
		cp.add(jbtn_single);
		cp.add(jbtn_multi);
	}
}
