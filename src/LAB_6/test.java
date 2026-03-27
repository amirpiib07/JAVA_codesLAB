package LAB_6;

import java.util.Scanner;

class shoppingApp{
    boolean login;
    boolean logout;
    int item;
    public void loginApp(){
        login=true;
        logout=false;
        System.out.println("login successfully");
    }
    public void logout(){
        logout=true;
        login=false;
        System.out.println("logout successfully");
    }
    public int addtoCart(int x){
        System.out.println(x+ "item addded in cart");
        return x;
    }
    public void favourite(int x){
        System.out.println(x+"item added in favourite section");
        totalfav(x);
    }
    public void section(){
        System.out.println("enter field of your shopping");
        System.out.println("1. grocery\n 2. tech \n 3. cloths");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x==1){
            System.out.println("opening grocery page");
        }
        else if(x==2){
            System.out.println("opening tech page");
        }
        else{
            System.out.println("opening cloths page");
        }
    }
    public void totalfav(int x){
        System.out.println("you have total "+ x+ "favourite product");

    }

}
public class test {
    public static void main(String[] args) {
        shoppingApp sp=new shoppingApp();
        sp.loginApp();
        sp.section();
        sp.addtoCart(5);
        sp.favourite(2);
        sp.logout();


    }
}
