package problema2;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class problema2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numeroSec = br.read();
        int sec [];
        sec = new int[numeroSec];
        for(int i=0;i<sec.length;i++){
            sec[i] = br.read();
        }


    }
}
