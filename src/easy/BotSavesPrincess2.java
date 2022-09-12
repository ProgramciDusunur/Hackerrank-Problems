package easy;

public class BotSavesPrincess2 {
	static String[] grid = {"p----","-----","-----","-----","---m-"};
	public static void main(String [] args) {
		int m = 0, princess_c = 0, princess_r = 0, bot = 0, n = 5, row = 3, column = 1;
		for (int i = 0;i< grid.length;i++) {						
			for (int j =0;j < grid[i].length();j++) {				
				//System.out.println(grid[i].charAt(j)+" <--- Bunun Ýndeks = "+m);
				if (grid[i].charAt(j) == 'p') {
					princess_c = m/n;
					princess_r = m%n;
				} else if (grid[i].charAt(j) == 'm')  {
					bot = m;					
				}
				m++;
			}
		}		
		System.out.println(Math.abs(princess_c-(bot/n)));
		System.out.println(Math.abs(princess_r-(bot%n)));
		if (column != princess_c) {
	          if (princess_c < column)
	              System.out.println("LEFT");
	          else
	              System.out.println("RIGHT");
	      }
	      else{
	            if (princess_r < row)
	              System.out.println("UP");
	          else
	              System.out.println("DOWN");
	      }
		
	}

}