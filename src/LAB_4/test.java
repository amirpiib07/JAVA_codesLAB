package LAB_4;

import java.util.Scanner;

public class test {
    static void main(String[] args) {
        int[][][]arr= new int[3][3][3];
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<3;i++){
            for(int j=0; j<3;j++){
                for(int k=0; k<3; k++){
                    arr[i][j][k]=sc.nextInt();
                }
            }
        }

    }
}
