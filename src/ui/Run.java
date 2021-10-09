package ui;

import component.BackGroundPanel;
import com.one.util.ScreenUtils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;


public class Run {

    JFrame jf = new JFrame("开始游戏");
    BackGroundPanel die[][]=new BackGroundPanel [6][5];
    final int WIDTH = 380;
    final int HEIGHT = 763;

    //组装视图
    public void init() throws Exception {
        //设置窗口属性
        jf.setBounds((ScreenUtils.getScreenWidth() - WIDTH) / 2, (ScreenUtils.getScreenHeight() - HEIGHT) / 2, WIDTH, HEIGHT);
        jf.setResizable(false);
        jf.setIconImage(ImageIO.read(new File("imgs/1.png")));

        //设置窗口内容

        BackGroundPanel bgPanel = new BackGroundPanel(ImageIO.read(new File("imgs/ground.jpg")));
        bgPanel.setBounds(0,0,WIDTH,HEIGHT);
        BackGroundPanel bgPanel2 = new BackGroundPanel(ImageIO.read(new File("imgs/1.png")));
        bgPanel2.setBounds(61,157,71,71);
        BackGroundPanel bgPanel3 = new BackGroundPanel(ImageIO.read(new File("imgs/2.png")));
        bgPanel3.setBounds(158,157,71,71);
        BackGroundPanel bgPanel4 = new BackGroundPanel(ImageIO.read(new File("imgs/3.png")));
        bgPanel4.setBounds(253,157,71,71);
        BackGroundPanel bgPanel5 = new BackGroundPanel(ImageIO.read(new File("imgs/4.png")));
        bgPanel5.setBounds(61,262,71,71);
        BackGroundPanel bgPanel6 = new BackGroundPanel(ImageIO.read(new File("imgs/5.png")));
        bgPanel6.setBounds(158,262,71,71);
        BackGroundPanel bgPanel7 = new BackGroundPanel(ImageIO.read(new File("imgs/6.png")));
        bgPanel7.setBounds(253,262,71,71);
        BackGroundPanel bgPanel8 = new BackGroundPanel(ImageIO.read(new File("imgs/stop.png")));
        bgPanel8.setBounds(95,452,189,46);
        BackGroundPanel bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/return2.png")));
        bgPanel10.setBounds(0,0,36,31);
        bgPanel8.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {
                    new result().init();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
                jf.dispose();
            }

 		@Override
 		public void mouseEntered(MouseEvent arg0) {
 			// TODO Auto-generated method stub
 			
 		}

 		@Override
 		public void mouseExited(MouseEvent arg0) {
 			// TODO Auto-generated method stub
 			
 		}

 		@Override
 		public void mousePressed(MouseEvent arg0) {
 			// TODO Auto-generated method stub
 			
 		}

 		@Override
 		public void mouseReleased(MouseEvent arg0) {
 			// TODO Auto-generated method stub
 			
 		}
        });
        set(61,157,1);
        Thread.sleep(100);
        set(158,157,2);
        Thread.sleep(100);
        set(253,157,3);
        Thread.sleep(100);
        set(61,262,4);
        Thread.sleep(100);
        set(158,262,5);
        Thread.sleep(100);
        set(253,262,6);
        jf.add(bgPanel10);
        jf.add(bgPanel8);
        jf.add(bgPanel7);
        jf.add(bgPanel6);
		jf.add(bgPanel5);
		jf.add(bgPanel4);
		jf.add(bgPanel3);
		jf.add(bgPanel2);
        jf.add(bgPanel);
        jf.setVisible(true);
        run1();
    }
    
    private void run1() throws InterruptedException {
		for(int i=0;;i++) {
			if(i==0) {
			die[0][i].setVisible(true);
			die[1][i].setVisible(true);
			die[2][i].setVisible(true);
			die[3][i].setVisible(true);
			die[4][i].setVisible(true);
			die[5][i].setVisible(true);
			Thread.sleep(100);
			}else {
			die[0][i-1].setVisible(false);
			die[0][i].setVisible(true);
			die[1][i-1].setVisible(false);
			die[1][i].setVisible(true);
			die[2][i-1].setVisible(false);
			die[2][i].setVisible(true);
			die[3][i-1].setVisible(false);
			die[3][i].setVisible(true);
			die[4][i-1].setVisible(false);
			die[4][i].setVisible(true);
			die[5][i-1].setVisible(false);
			die[5][i].setVisible(true);
			Thread.sleep(100);
			if(i==4)i=-1;
			}
		}
	}

	public void set(int x,int y,int num) throws IOException {
	int i = 0;
    if(num!=1) {
    die[num-1][i] = new BackGroundPanel(ImageIO.read(new File("imgs/1_.png")));
    die[num-1][i].setBounds(x+8,y+3,55,65);
    die[num-1][i].setVisible(false);
    jf.add(die[num-1][i]);
    i++;
    
    }
    if(num!=2) {
    die[num-1][i] = new BackGroundPanel(ImageIO.read(new File("imgs/2_.png")));
    die[num-1][i].setBounds(x+8,y+3,55,65);
    die[num-1][i].setVisible(false);
    jf.add(die[num-1][i]);
    i++;
    }
    if(num!=3) {
    die[num-1][i] = new BackGroundPanel(ImageIO.read(new File("imgs/3_.png")));
    die[num-1][i].setBounds(x+8,y+3,55,65);
    die[num-1][i].setVisible(false);
    jf.add(die[num-1][i]);
    i++;
    }
    if(num!=4) {
    die[num-1][i] = new BackGroundPanel(ImageIO.read(new File("imgs/4_.png")));
    die[num-1][i].setBounds(x+8,y+3,55,65);
    die[num-1][i].setVisible(false);
    jf.add(die[num-1][i]);
    i++;
    }
    if(num!=5) {
    die[num-1][i] = new BackGroundPanel(ImageIO.read(new File("imgs/5_.png")));
    die[num-1][i].setBounds(x+8,y+3,55,65);
    die[num-1][i].setVisible(false);
    jf.add(die[num-1][i]);
    i++;
    }
    if(num!=6) {
    die[num-1][i] = new BackGroundPanel(ImageIO.read(new File("imgs/6_.png")));
    die[num-1][i].setBounds(x+8,y+3,55,65);
    die[num-1][i].setVisible(false);
    jf.add(die[num-1][i]);
    i++;
    }
    }

    public static void main(String[] args) {
        try {
            new Run().init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}