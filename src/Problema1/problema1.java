package Problema1;


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;


public class problema1 {


    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //problema #1
        String problema1 = br.readLine();
        String[] parts = problema1.split("\\+");

        int[] valores = new int[parts.length];

        for(int i = 0; i < valores.length; i++){
            valores[i] = Integer.parseInt(parts[i]);
        }
        for(int k=1; k<valores.length; k++)   {
            int temp = valores[k];
            int j= k-1;
            while(j>=0 && temp <= valores[j])   {
                valores[j+1] = valores[j];
                j = j-1;
            }
            valores[j+1] = temp;
        }
        String aux ="";

        for(int i=0;i<valores.length-1;i++){
            aux = aux + valores[i]+"+";
        }
        aux +=  valores[valores.length-1];
        System.out.println(aux);

    }
}
