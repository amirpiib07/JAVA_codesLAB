package LAB_4;

import java.util.Scanner;

public class q2 {

    static boolean isValid(String s) {
        if (s.length() < 5 || s.length() > 12) return false;
        int n=s.length();
        boolean hasLower = false;
        boolean hasDigit = false;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') return false;

            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9')))
                return false;

            if (c >= 'a' && c <= 'z') hasLower = true;
            if (c >= '0' && c <= '9') hasDigit = true;


        }
        //pattern length
        for(int len=1;len<=n/2;len++){
            //starting index
            for(int i=0;i<=n-2*len;i++){
                boolean match=true;
                //compare two consecutive blocks
                for(int j=0;j<len;j++){
                    if(s.charAt(i+j)!=s.charAt(i+len+j)){
                        match=false;
                        break;
                    }
                }
                if(match){
                    return false;
                }
            }
        }
        return hasLower && hasDigit && true;
    }

    static void main(String[] args) {
        String password;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the password: ");
        password = sc.nextLine();
        System.out.println(isValid(password));
    }
}
