import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class model extends JFrame{
	private JPanel jpnl=new JPanel();
	private JButton ex=new JButton("練習");
	private JButton one=new JButton("單人");
	private JButton two=new JButton("連線");
	private Container cp;
	
	public model(){
		frame_modle();
	}
	private void frame_modle(){
		this.setTitle("英文遊戲字卡");
		setResizable(false);
		cp=this.getContentPane();
		this.setBounds(650, 250, 400, 600);
		cp.setLayout(null);
		
		jpnl.setBackground(Color.BLUE);
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
		cp.add(jpnl);
	}
}
