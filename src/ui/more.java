package ui;

import component.BackGroundPanel;
import com.one.util.ScreenUtils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;


public class more {

    JFrame jf = new JFrame("单人游戏");

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
        BackGroundPanel bgPanel9 = new BackGroundPanel(ImageIO.read(new File("imgs/roll.png")));
        bgPanel9.setBounds(95,452,189,46);
        BackGroundPanel bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/return2.png")));
        bgPanel10.setBounds(0,0,36,31);
        bgPanel10.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {
                    new select().init();
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
        bgPanel9.addMouseListener(new MouseListener() {
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
        jf.add(bgPanel10);
        jf.add(bgPanel9);
        jf.add(bgPanel7);
        jf.add(bgPanel6);
		jf.add(bgPanel5);
		jf.add(bgPanel4);
		jf.add(bgPanel3);
		jf.add(bgPanel2);
        jf.add(bgPanel);
        jf.setVisible(true);
    }


    public static void main(String[] args) {
        try {
            new more().init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}