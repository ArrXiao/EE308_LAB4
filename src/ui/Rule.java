package ui;

import component.BackGroundPanel;
import com.one.util.ScreenUtils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;

public class Rule {

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
        BackGroundPanel bgPanel2 = new BackGroundPanel(ImageIO.read(new File("imgs/up.png")));
        bgPanel2.setBounds(0,0,380,143);
        BackGroundPanel bgPanel3 = new BackGroundPanel(ImageIO.read(new File("imgs/regulation.jfif")));
        bgPanel3.setBounds(0,143,380,595);
        BackGroundPanel bgPanel4 = new BackGroundPanel(ImageIO.read(new File("imgs/return3.png")));
        bgPanel4.setBounds(0,0,40,33);

        bgPanel4.addMouseListener(new MouseListener() {
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

        jf.add(bgPanel4);
		jf.add(bgPanel3);
		jf.add(bgPanel2);
        jf.add(bgPanel);
        jf.setVisible(true);
    }


    public static void main(String[] args) {
        try {
            new Rule().init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}