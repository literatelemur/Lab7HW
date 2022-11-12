import java.util.Scanner;
public class Presidents {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String[][] presidentList = {{"Dwight", "Eisenhower"}, {"John", "Kennedy"}, {"Lydon", "Johnson"}, {"Richard", "Nixon"}, {"Gerald", "Ford"}, {"James", "Carter"}, {"Ronald", "Reagan"}, {"George", "Bush"}, {"William", "Clinton"}, {"George", "Bush"}, {"Barack", "Obama"}, {"Donald", "Trump"}};
		print(presidentList);
		sort(presidentList);
		System.out.println();
		print(presidentList);
		System.out.println("Enter the first and last name of a president to search. An index of the row of the president in the array will displayed, with a -1 indicating that nothing was found");
		String firstName = input.next();
		String lastName = input.next();
		System.out.println(search(presidentList, firstName, lastName));
	}
	
	public static void sort(String[][] x) {
		String t = "";
		for(int i = 0; i < x.length; i++) {
			for(int j = i + 1; j < x.length; j++) {
				if (x[i][1].compareTo(x[j][1]) == 0) {
					if(x[i][0].compareTo(x[j][0]) > 0) {
						t = x[i][0];
						x[i][0] = x[j][0];
						x[j][0] = t;
					}	
				}
				else if(x[i][1].compareTo(x[j][1]) > 0) {
					t = x[i][0];
					x[i][0] = x[j][0];
					x[j][0] = t;
					t = x[i][1];
					x[i][1] = x[j][1];
					x[j][1] = t;
				}
			}
			
		}
	}
	
	public static int search(String[][] x, String name1, String name2) {
		
		for(int i = 0; i < x.length; i++) {
			if (x[i][0].equals(name1)) {
				if (x[i][1].equals(name2)) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public static void print(String[][] x) {
		for(int i = 0; i < x.length; i++) {
			for(int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + " ");
			}
		System.out.println();
		}
	}
}
