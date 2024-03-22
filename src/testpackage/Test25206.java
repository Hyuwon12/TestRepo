package testpackage;

import java.io.*;
import java.util.StringTokenizer;

public class Test25206 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


    public static void main(String[] args) throws IOException {
        double avg = 0;
        String[][] arr = {{"A+","4.5"},{"A0","4.0"},{"B+","3.5"},{"B0","3.0"},{"C+","2.5"},
                            {"C0","2.0"},{"D+","1.5"},{"D0","1.0"},{"F","0.0"}};

        double score2=0;
        for(int i=0;i<20;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = (st.nextToken());
            double score = Double.parseDouble(st.nextToken());
            String rank = (st.nextToken());
            for(int j=0;j< arr.length;j++){
                if (rank.equals(arr[j][0])){
                    avg+=Double.parseDouble(arr[j][1])*score;
                    score2+=score;
                }
                else if(rank=="P"){
                    continue;
                }
            }
        }
        bw.write(String.valueOf(avg/score2));
        bw.flush();
    }
}
