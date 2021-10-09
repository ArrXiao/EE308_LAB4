package ui;
public class player {
	private double dice [] = new double [6];
	private int point;
	String result[] = {"状元插金花!", 
	           "六杯红", 
	           "遍地锦", 
	           "六杯黑", 
	           "五王", 
	           "五子带一秀", 
	           "五子登科", 
	           "状元", 
	           "对堂", 
	           "三红", 
	           "四进", 
	           "二举", 
	           "一秀", 
	           "没有奖哦亲~~~~~"};
	
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
			//状元插金花!
			point = 14;
		}else if(countnum[3] == 6) {
			//六杯红
			point = 13;
		}else if(countnum[0] == 6) {
			//遍地锦
			point = 12;
		}else if(countnum[1] == 6) {
			//六杯黑
			point = 11;
		}else if(countnum[3] == 5) {
			//五王
			point = 10;
		}else if(countnum[1] == 5 && countnum[3] == 1) {
			//五子带一秀
			point = 9;
		}else if(countnum[1] == 5) {
			//五子登科
			point = 8;
		}else if(countnum[3] == 4) {
			//状元
			point = 7;
		}else if(countnum[0] == 1 && countnum[1] == 1 && countnum[2] == 1 && countnum[3] == 1 && countnum[4] == 1) {
			//对堂
			point = 6;
		}else if(countnum[3] == 3) {
			//三红
			point = 5;
		}else if(countnum[1] == 4) {
			//四进
			point = 4;
		}else if(countnum[3] == 2) {
			//二举
			point = 3;
		}else if(countnum[3] == 1) {
			//一秀
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
			//状元插金花!
			return 14;
		}else if(point == 13) {
			//六杯红
			return 13;
		}else if(point == 12) {
			//遍地锦
			return 12;
		}else if(point == 11) {
			//六杯黑
			return 11;
		}else if(point == 10) {
			//五王
			return 10;
		}else if(point == 9) {
			//五子带一秀
			return 9;
		}else if(point == 8) {
			//五子登科
			return 8;
		}else if(point == 7) {
			//状元
			return 7;
		}else if(point == 6) {
			//对堂
			return 6;
		}else if(point == 5) {
			//三红
			return 5;
		}else if(point == 4) {
			//四进
			return 4;
		}else if(point == 3) {
			//二举
			return 3;
		}else if(point == 2) {
			//一秀
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
