package homeassignment.week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0, b=1, c=0, i, count = 8;
        System.out.print(a + " " + b);

        for (i = 2; i<count; ++i)
        { 
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }
	}
