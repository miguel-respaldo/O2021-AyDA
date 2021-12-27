import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {
        Scanner sr = new Scanner(System.in);
        System.out.println ("Binary Search...");


		System.out.println ("Type number to search: ");
		int f = sr.nextInt ();
		System.out.println ("How many numbers?: ");
        int n = sr.nextInt ();

		int attr [] = new int [n];
		for (int i = 0; i < n; i++) {
			System.out.println ("Number: " + String.valueOf(i + 1));
			attr[i] = sr.nextInt();
		}
		int index = searchmy(attr,f,n);
		if (index == -1) {
			System.out.println ("Not found");
		} else {
			System.out.println (f + "index is:" + index);
		}
    }


    static int  searchmy(int att[], int m , int n) {
        int low = 0;
        int high = att.length - 1;
        return searchmy(att, m, n, low, high);
    }

    static int  searchmy(int att[], int m , int n, int low, int high) {
        if (low > high) {
            return -1;
        }
		
        int mid = (low + high) / 2;
        
		if (m == att[mid]) {
			return mid;
        } else if (m < att[mid]) {
            return searchmy(att, m, n, low, mid - 1);
        } else {
            return searchmy(att, m, n, mid + 1, high);
        }
    }
}