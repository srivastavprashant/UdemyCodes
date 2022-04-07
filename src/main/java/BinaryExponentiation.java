import java.io.*;
import java.util.*;

public class BinaryExponentiation {
    BufferedReader br;
    PrintWriter out;

    private void solve(int[][] grid) throws Exception {
        //for a^b
        int a=3,b=6;
        int res=1;
        while(b!=0){
            if((b&1)==1) res=res*a;
            a=a*a;
            b/=2;
        }
        out.println(res);
    }

    public static void main(String args[]) throws Exception {
        new BinaryExponentiation().init();
    }

    private void init() throws Exception {
        if (System.getProperty("ONLINE_JUDGE") == null) {
            File file = new File("src/main/resources/input.txt");
            br = new BufferedReader(new FileReader(file));
            out = new PrintWriter("src/main/resources/output.txt");
        } else {
            out = new PrintWriter(System.out);
            br = new BufferedReader(new InputStreamReader(System.in));
        }
        int arr[][]={{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        solve(arr);
        out.flush();
    }

    private int in() throws Exception {
        return (Integer.parseInt(br.readLine()));
    }

    private int[] in(int n) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(st.nextToken());
        return (arr);


    }
}
