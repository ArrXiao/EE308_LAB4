package ui;
public class player {
	private double dice [] = new double [6];
	private int point;
	String result[] = {"״Ԫ���!", 
	           "������", 
	           "��ؽ�", 
	           "������", 
	           "����", 
	           "���Ӵ�һ��", 
	           "���ӵǿ�", 
	           "״Ԫ", 
	           "����", 
	           "����", 
	           "�Ľ�", 
	           "����", 
	           "һ��", 
	           "û�н�Ŷ��~~~~~"};
	
	public player() {
		setdice();
		setpoint();
	}
	
	public void setdice() {
		int i;
		for(i = 0;i < 6;i++) {
			dice[i] = Math.floor(Math.random() * 6) + 1;
		}
	}
	
	public void setpoint() {
		int i, j;
		int countnum[] = {0, 0, 0, 0, 0, 0};
		for(i = 0;i < 6;i++) {
			for(j = 0;j < 6;j++) {
				if(dice[j] == i + 1) {
					countnum[i]++;
				}
			}
		}
		
		if(countnum[3] == 4 && countnum[0] == 2) {
			//״Ԫ���!
			point = 14;
		}else if(countnum[3] == 6) {
			//������
			point = 13;
		}else if(countnum[0] == 6) {
			//��ؽ�
			point = 12;
		}else if(countnum[1] == 6) {
			//������
			point = 11;
		}else if(countnum[3] == 5) {
			//����
			point = 10;
		}else if(countnum[1] == 5 && countnum[3] == 1) {
			//���Ӵ�һ��
			point = 9;
		}else if(countnum[1] == 5) {
			//���ӵǿ�
			point = 8;
		}else if(countnum[3] == 4) {
			//״Ԫ
			point = 7;
		}else if(countnum[0] == 1 && countnum[1] == 1 && countnum[2] == 1 && countnum[3] == 1 && countnum[4] == 1) {
			//����
			point = 6;
		}else if(countnum[3] == 3) {
			//����
			point = 5;
		}else if(countnum[1] == 4) {
			//�Ľ�
			point = 4;
		}else if(countnum[3] == 2) {
			//����
			point = 3;
		}else if(countnum[3] == 1) {
			//һ��
			point = 2;
		}else {
			point = 1;
		}
	}
	
	public int getdice(int n) {
		return (int) dice[n];
	}
	
	public int getpoint() {
		return point;
	}
	
	public int getresult() {
		if(point == 14) {
			//״Ԫ���!
			return 14;
		}else if(point == 13) {
			//������
			return 13;
		}else if(point == 12) {
			//��ؽ�
			return 12;
		}else if(point == 11) {
			//������
			return 11;
		}else if(point == 10) {
			//����
			return 10;
		}else if(point == 9) {
			//���Ӵ�һ��
			return 9;
		}else if(point == 8) {
			//���ӵǿ�
			return 8;
		}else if(point == 7) {
			//״Ԫ
			return 7;
		}else if(point == 6) {
			//����
			return 6;
		}else if(point == 5) {
			//����
			return 5;
		}else if(point == 4) {
			//�Ľ�
			return 4;
		}else if(point == 3) {
			//����
			return 3;
		}else if(point == 2) {
			//һ��
			return 2;
		}else {
			point = 1;
			return 1;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		player u = new player();
		for(int i = 0;i < 6;i++) {
			System.out.print((int)u.dice[i] + " ");
		}
		System.out.println();
		System.out.println("Point: " + u.getdice(3));
		System.out.println("result " + u.getresult());
	}
}
