package LAB_4;

public class q6 {
    interface Function {
        int evaluate(int x);
    }
    static class Half implements Function {
        public int evaluate(int x) {
            return x / 2;
        }
    }

    static void main(String[] args) {
        int[] arr = {10, 20, 30};
        Function f = new Half();

        for (int i = 0; i < arr.length; i++)
            System.out.print(f.evaluate(arr[i]) + " ");
    }




}
