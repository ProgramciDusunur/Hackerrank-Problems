package easy;

public class BotSavesPrincess {
	static String[] grid = {"---","-m-","p--"};
	public static void main(String [] args) {
		int m = 0, princess = 0, bot = 0, n = 3;
		for (int i = 0;i< grid.length;i++) {						
			for (int j =0;j < grid[i].length();j++) {				
				//System.out.println(grid[i].charAt(j)+" <--- Bunun Ýndeks = "+m);
				if (grid[i].charAt(j) == 'p') {
					princess = m;
				} else if (grid[i].charAt(j) == 'm')  {
					bot = m;
				}
				m++;
			}
		}
		// Y
		for (int p = Math.abs((princess/n)-(bot/n));p > 0;p--) {
			if (princess/n > bot/n) {
				System.out.println("Bot bir aþaðýya");
			}
			if (princess/n < bot/n) {
				System.out.println("Bot bir yukarýya");
			}
		}
		// X
		for (int p = Math.abs((princess%n)-(bot%n));p > 0;p--) {
			if (princess%n > bot%n) {
				System.out.println("Bot bir saða");
			}
			if (princess%n < bot%n) {
				System.out.println("Bot bir sola");
			}
		}
		System.out.println("Princess Y = "+princess/n);
	}

}
