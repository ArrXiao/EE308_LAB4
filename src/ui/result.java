package ui;

import component.BackGroundPanel;
import com.one.util.ScreenUtils;
import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;


public class result {

    JFrame jf = new JFrame("单人游戏");

    final int WIDTH = 380;
    final int HEIGHT = 763;
    BackGroundPanel bgPanel10;
    BackGroundPanel bgPanel11;
    BackGroundPanel bgPanel12;
    BackGroundPanel bgPanel13;
    BackGroundPanel bgPanel14;
    BackGroundPanel bgPanel15;
    BackGroundPanel bgPanel16;
    BackGroundPanel bgPanel17;
    BackGroundPanel bgPanel18;
    BackGroundPanel bgPanel19;
    BackGroundPanel bgPanel20;
    BackGroundPanel bgPanel21;
    BackGroundPanel bgPanel22;
    BackGroundPanel bgPanel23;
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
        BackGroundPanel bgPanel8 = new BackGroundPanel(ImageIO.read(new File("imgs/return2.png")));
        bgPanel8.setBounds(0,0,36,31);
        bgPanel16 = new BackGroundPanel(ImageIO.read(new File("imgs/9.png")));
        bgPanel16.setBounds(96,20,188,82);
        bgPanel17 = new BackGroundPanel(ImageIO.read(new File("imgs/10.png")));
        bgPanel17.setBounds(126,20,122,88);
        bgPanel18 = new BackGroundPanel(ImageIO.read(new File("imgs/11.png")));
        bgPanel18.setBounds(128,20,124,93);
        bgPanel19 = new BackGroundPanel(ImageIO.read(new File("imgs/12.png")));
        bgPanel19.setBounds(126,20,128,91);
        bgPanel20 = new BackGroundPanel(ImageIO.read(new File("imgs/13.png")));
        bgPanel20.setBounds(113,20,154,87);
        bgPanel21 = new BackGroundPanel(ImageIO.read(new File("imgs/14.png")));
        bgPanel21.setBounds(69,20,242,92);
        bgPanel22 = new BackGroundPanel(ImageIO.read(new File("imgs/2f.png")));
        bgPanel22.setBounds(98,20,188,124);
        bgPanel23 = new BackGroundPanel(ImageIO.read(new File("imgs/3f.png")));
        bgPanel23.setBounds(98,20,188,127);
        bgPanel16.setVisible(false);
        bgPanel17.setVisible(false);
        bgPanel18.setVisible(false);
        bgPanel19.setVisible(false);
        bgPanel20.setVisible(false);
        bgPanel21.setVisible(false);
        bgPanel22.setVisible(false);
        bgPanel23.setVisible(false);
        play();
        bgPanel8.addMouseListener(new MouseListener() {
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
        jf.add(bgPanel23);
        jf.add(bgPanel22);
        jf.add(bgPanel17);
        jf.add(bgPanel21);
        jf.add(bgPanel18);
        jf.add(bgPanel19);
        jf.add(bgPanel20);
        jf.add(bgPanel16);
        jf.add(bgPanel10);
        jf.add(bgPanel11);
        jf.add(bgPanel12);
        jf.add(bgPanel13);
        jf.add(bgPanel14);
        jf.add(bgPanel15);
        jf.add(bgPanel8);
        jf.add(bgPanel8);
        jf.add(bgPanel8);
        jf.add(bgPanel8);
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
public void play() throws IOException {
	player a =new player();
	if(a.getpoint()==14) {
		bgPanel21.setVisible(true);
	}
	if(a.getpoint()==13) {
		bgPanel20.setVisible(true);
	}
	if(a.getpoint()==12) {
		bgPanel19.setVisible(true);
	}
	if(a.getpoint()==11) {
		bgPanel18.setVisible(true);
	}
	if(a.getpoint()==10) {
		bgPanel17.setVisible(true);
	}
	if(a.getpoint()==9) {
		bgPanel16.setVisible(true);
	}
	if(a.getpoint()==3) {
		bgPanel23.setVisible(true);
	}
	if(a.getpoint()==2) {
		bgPanel22.setVisible(true);
	}
    for(int i=0;i<6;i++) {
        if(i==0) {
        	if(a.getdice(i)==1){
        		bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/1_.png")));
        		bgPanel10.setBounds(61+8,157+3,55,65);
        	}
        	if(a.getdice(i)==2){
        		bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/2_.png")));
        		bgPanel10.setBounds(61+8,157+3,55,65);
        	}
        	if(a.getdice(i)==3){
        		bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/3_.png")));
        		bgPanel10.setBounds(61+8,157+3,55,65);
        	}
        	if(a.getdice(i)==4){
        		bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/4_.png")));
        		bgPanel10.setBounds(61+8,157+3,55,65);
        	}
        	if(a.getdice(i)==5){
        		bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/5_.png")));
        		bgPanel10.setBounds(61+8,157+3,55,65);
        	}
        	if(a.getdice(i)==6){
        		bgPanel10 = new BackGroundPanel(ImageIO.read(new File("imgs/6_.png")));
        		bgPanel10.setBounds(61+8,157+3,55,65);
        	}
        	}
        if(i==1) {
        	if(a.getdice(i)==1){
        		bgPanel11 = new BackGroundPanel(ImageIO.read(new File("imgs/1_.png")));
        		bgPanel11.setBounds(158+8,157+3,55,65);
        	}
        	if(a.getdice(i)==2){
        		bgPanel11 = new BackGroundPanel(ImageIO.read(new File("imgs/2_.png")));
        		bgPanel11.setBounds(158+8,157+3,55,65);
        	}
        	if(a.getdice(i)==3){
        		bgPanel11 = new BackGroundPanel(ImageIO.read(new File("imgs/3_.png")));
        		bgPanel11.setBounds(158+8,157+3,55,65);
        	}
        	if(a.getdice(i)==4){
        		bgPanel11 = new BackGroundPanel(ImageIO.read(new File("imgs/4_.png")));
        		bgPanel11.setBounds(158+8,157+3,55,65);
        	}
        	if(a.getdice(i)==5){
        		bgPanel11 = new BackGroundPanel(ImageIO.read(new File("imgs/5_.png")));
        		bgPanel11.setBounds(158+8,157+3,55,65);
        	}
        	if(a.getdice(i)==6){
        		bgPanel11 = new BackGroundPanel(ImageIO.read(new File("imgs/6_.png")));
        		bgPanel11.setBounds(158+8,157+3,55,65);
        	}
        	}
        if(i==2) {
        	if(a.getdice(i)==1){
        		bgPanel12 = new BackGroundPanel(ImageIO.read(new File("imgs/1_.png")));
        		bgPanel12.setBounds(253+8,157+3,55,65);
        	}
        	if(a.getdice(i)==2){
        		bgPanel12 = new BackGroundPanel(ImageIO.read(new File("imgs/2_.png")));
        		bgPanel12.setBounds(253+8,157+3,55,65);
        	}
        	if(a.getdice(i)==3){
        		bgPanel12 = new BackGroundPanel(ImageIO.read(new File("imgs/3_.png")));
        		bgPanel12.setBounds(253+8,157+3,55,65);
        	}
        	if(a.getdice(i)==4){
        		bgPanel12 = new BackGroundPanel(ImageIO.read(new File("imgs/4_.png")));
        		bgPanel12.setBounds(253+8,157+3,55,65);
        	}
        	if(a.getdice(i)==5){
        		bgPanel12 = new BackGroundPanel(ImageIO.read(new File("imgs/5_.png")));
        		bgPanel12.setBounds(253+8,157+3,55,65);
        	}
        	if(a.getdice(i)==6){
        		bgPanel12 = new BackGroundPanel(ImageIO.read(new File("imgs/6_.png")));
        		bgPanel12.setBounds(253+8,157+3,55,65);
        	}
        	}
        if(i==3) {
        	if(a.getdice(i)==1){
        		bgPanel13 = new BackGroundPanel(ImageIO.read(new File("imgs/1_.png")));
        		bgPanel13.setBounds(61+8,262+3,55,65);
        	}
        	if(a.getdice(i)==2){
        		bgPanel13 = new BackGroundPanel(ImageIO.read(new File("imgs/2_.png")));
        		bgPanel13.setBounds(61+8,262+3,55,65);
        	}
        	if(a.getdice(i)==3){
        		bgPanel13 = new BackGroundPanel(ImageIO.read(new File("imgs/3_.png")));
        		bgPanel13.setBounds(61+8,262+3,55,65);
        	}
        	if(a.getdice(i)==4){
        		bgPanel13 = new BackGroundPanel(ImageIO.read(new File("imgs/4_.png")));
        		bgPanel13.setBounds(61+8,262+3,55,65);
        	}
        	if(a.getdice(i)==5){
        		bgPanel13 = new BackGroundPanel(ImageIO.read(new File("imgs/5_.png")));
        		bgPanel13.setBounds(61+8,262+3,55,65);
        	}
        	if(a.getdice(i)==6){
        		bgPanel13 = new BackGroundPanel(ImageIO.read(new File("imgs/6_.png")));
        		bgPanel13.setBounds(61+8,262+3,55,65);
        	}
        	}
        if(i==4) {
        	if(a.getdice(i)==1){
        		bgPanel14 = new BackGroundPanel(ImageIO.read(new File("imgs/1_.png")));
        		bgPanel14.setBounds(158+8,262+3,55,65);
        	}
        	if(a.getdice(i)==2){
        		bgPanel14 = new BackGroundPanel(ImageIO.read(new File("imgs/2_.png")));
        		bgPanel14.setBounds(158+8,262+3,55,65);
        	}
        	if(a.getdice(i)==3){
        		bgPanel14 = new BackGroundPanel(ImageIO.read(new File("imgs/3_.png")));
        		bgPanel14.setBounds(158+8,262+3,55,65);
        	}
        	if(a.getdice(i)==4){
        		bgPanel14 = new BackGroundPanel(ImageIO.read(new File("imgs/4_.png")));
        		bgPanel14.setBounds(158+8,262+3,55,65);
        	}
        	if(a.getdice(i)==5){
        		bgPanel14 = new BackGroundPanel(ImageIO.read(new File("imgs/5_.png")));
        		bgPanel14.setBounds(158+8,262+3,55,65);
        	}
        	if(a.getdice(i)==6){
        		bgPanel14 = new BackGroundPanel(ImageIO.read(new File("imgs/6_.png")));
        		bgPanel14.setBounds(158+8,262+3,55,65);
        	}
        	}
        if(i==5) {
        	if(a.getdice(i)==1){
        		bgPanel15 = new BackGroundPanel(ImageIO.read(new File("imgs/1_.png")));
        		bgPanel15.setBounds(253+8,262+3,55,65);
        	}
        	if(a.getdice(i)==2){
        		bgPanel15 = new BackGroundPanel(ImageIO.read(new File("imgs/2_.png")));
        		bgPanel15.setBounds(253+8,262+3,55,65);
        	}
        	if(a.getdice(i)==3){
        		bgPanel15 = new BackGroundPanel(ImageIO.read(new File("imgs/3_.png")));
        		bgPanel15.setBounds(253+8,262+3,55,65);
        	}
        	if(a.getdice(i)==4){
        		bgPanel15 = new BackGroundPanel(ImageIO.read(new File("imgs/4_.png")));
        		bgPanel15.setBounds(253+8,262+3,55,65);
        	}
        	if(a.getdice(i)==5){
        		bgPanel15 = new BackGroundPanel(ImageIO.read(new File("imgs/5_.png")));
        		bgPanel15.setBounds(253+8,262+3,55,65);
        	}
        	if(a.getdice(i)==6){
        		bgPanel15 = new BackGroundPanel(ImageIO.read(new File("imgs/6_.png")));
        		bgPanel15.setBounds(253+8,262+3,55,65);
        	}
        	}
    }
}

    public static void main(String[] args) {
        try {
            new result().init();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}