package ui;


import component.BackGroundPanel;
import com.one.util.ScreenUtils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;


public class select {

    JFrame jf = new JFrame("选择");

    final int WIDTH = 380;
    final int HEIGHT = 730;

    //组装视图
    public void init() throws Exception {
        //设置窗口属性
        jf.setBounds((ScreenUtils.getScreenWidth() - WIDTH) / 2, (ScreenUtils.getScreenHeight() - HEIGHT) / 2, WIDTH, HEIGHT);
        jf.setResizable(false);
        jf.setIconImage(ImageIO.read(new File("imgs/1.png")));

        //设置窗口内容

        BackGroundPanel bgPanel = new BackGroundPanel(ImageIO.read(new File("imgs/dongtu.gif")));
        bgPanel.setBounds(0,0,WIDTH,HEIGHT);
        BackGroundPanel bgPanel2 = new BackGroundPanel(ImageIO.read(new File("imgs/zhongqiu2.png")));
        bgPanel2.setBounds(65,65,250,79);
        BackGroundPanel bgPanel3 = new BackGroundPanel(ImageIO.read(new File("imgs/one.png")));
        bgPanel3.setBounds(117,210,146,41);
        BackGroundPanel bgPanel4 = new BackGroundPanel(ImageIO.read(new File("imgs/more.png")));
        bgPanel4.setBounds(117,300,146,39);
        BackGroundPanel bgPanel5 = new BackGroundPanel(ImageIO.read(new File("imgs/rule.png")));
        bgPanel5.setBounds(117,390,146,41);
        BackGroundPanel bgPanel6 = new BackGroundPanel(ImageIO.read(new File("imgs/moon.png")));
        bgPanel6.setBounds(74,437,127,123);
        BackGroundPanel bgPanel7 = new BackGroundPanel(ImageIO.read(new File("imgs/return1.png")));
        bgPanel7.setBounds(0,0,36,31);
        bgPanel4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {
                    new more().init();
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
        bgPanel7.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {
                    new MainInterface().init();
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
        
        bgPanel3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {
                    new one_peple().init();
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
        
        bgPanel5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

                try {
                    new Rule().init();
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
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
        jf.add(bgPanel7);
        jf.add(bgPanel6);
		jf.add(bgPanel5);
		jf.add(bgPanel4);
		jf.add(bgPanel3);
		jf.add(bgPanel2);
        jf.add(bgPanel);
        jf.setVisible(true);
    }

    //瀹㈡埛绔▼搴忕殑鍏ュ彛
    public static void main(String[] args) {
        try {
            new select().init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

