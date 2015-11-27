package Frame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class model1 extends JFrame{
	private JPanel jpnl=new JPanel();
	private JButton easy=new JButton("簡單");
	private JButton mid=new JButton("中等");
	private JButton hard=new JButton("困難");
	private JButton back=new JButton("Back");
	private Container cp;
	int Width = 400, Height=600;
	
	public model1(){
		frame_modle1();
	}
	private void frame_modle1(){
		this.setTitle("英文遊戲字卡/困難度");
		setResizable(false);
		cp=this.getContentPane();
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds((int)((screenSize.getWidth()-Width)*0.5), (int)((screenSize.getHeight()-Height)*0.5), Width, Height);
		cp.setLayout(null);
		
		jpnl.setBackground(Color.BLUE);
		jpnl.setBounds(80,20,240,100);
		easy.setBounds(100,150,200,100);
		mid.setBounds(100,280,200,100);
		hard.setBounds(100,410,200,100);
		back.setBounds(0,540,400,30);
		
		back.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
				model frm=new model();
				frm.setVisible(true);
				setVisible(false);
			}
		});
		
		cp.add(easy);
		cp.add(mid);
		cp.add(hard);
		cp.add(back);
		cp.add(jpnl);
	}
}