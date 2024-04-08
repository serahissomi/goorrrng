import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		solution();
	}
	
	private static void solution() throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(reader.readLine());
		
		int n = Integer.parseInt(st.nextToken()),
				l = Integer.parseInt(st.nextToken()),
				w = Integer.parseInt(st.nextToken()),
				h = Integer.parseInt(st.nextToken());
		
		double left = 0, right = Math.min(l, Math.min(w, h)), mid;
		
        while(left < right){
			
			mid = (left+right) / 2;
			
			if((long)(l/mid)*(long)(w/mid)*(long)(h/mid) >= n) {
				if(left == mid) break;
				left = mid;
			} else {
				if(right == mid) break;
				right = mid;
			}
			
		}
		reader.close();
		System.out.println(left);
	}
}