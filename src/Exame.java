import java.util.*;

public class Exame {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] sl = new int[20001];
		while (in.hasNext()) {
			int l = in.nextInt();
			int h = in.nextInt();
			int r = in.nextInt();
			for (int i = l; i < r; i++)
				if (sl[i] < h)
					sl[i] = h;
		}
		int hAt = 0;
		String out = "";
		for (int i = 0; i < sl.length; i++)
			if (sl[i] != hAt) {
				out += i + " " + sl[i] + " ";
				hAt = sl[i];
			}
		System.out.println(out.substring(0, out.length() - 1));
	}
}
