package Component;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class ImageButton extends JButton{
	private ImageIcon iconPress,iconEnter,iconExit;
	private int w, h;
//	private JButton jbtn_practice = new JButton(new ImageIcon(((new ImageIcon("images/button1_style01.png").getImage()
//            .getScaledInstance(200, 100, java.awt.Image.SCALE_SMOOTH)))));
	
	public ImageButton(String path, int w, int h) {
		try{
			this.w = w;
			this.h = h;
			this.setIcon(fitIcon(new ImageIcon(path), w, h));
			this.setBorder(BorderFactory.createEmptyBorder());
			this.setContentAreaFilled(false);
		}catch(Exception ex){
			
		}
	}
	public ImageIcon fitIcon(ImageIcon icon, int w, int h){
		return new ImageIcon(icon.getImage().getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH));
	}
	public void addEffectIcon(String Exit, String Enter, String Press){
		try{
			iconExit = new ImageIcon(Exit);
			iconEnter = new ImageIcon(Enter);
			iconPress = new ImageIcon(Press);
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent evt){			//點擊目標
					setIcon(new ImageIcon(iconPress.getImage().getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH)));
				}
			    public void mouseEntered(MouseEvent evt) {			//靠近目標
			    	setIcon(new ImageIcon(iconEnter.getImage().getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH)));
			    }
			    public void mouseExited(MouseEvent evt) {			//離開目標
			    	setIcon(new ImageIcon(iconExit.getImage().getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH)));
			    }
			    public void mouseReleased(MouseEvent evt){			//釋放目標
			    	setIcon(new ImageIcon(iconEnter.getImage().getScaledInstance(w, h, java.awt.Image.SCALE_SMOOTH)));
			    }
			});
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
}
