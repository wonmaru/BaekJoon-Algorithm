import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class B10871 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st= new StringTokenizer(bf.readLine());
		int n = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(bf.readLine()," ");
		for( int i = 0; i<n; i++) {
			int value = Integer.parseInt(st.nextToken());
			if(value<x) {
				bw.write(value + " ");
			}
		}
		bf.close();
		bw.flush();
		bw.close();
	}
}
