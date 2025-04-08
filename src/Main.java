//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for (int i = 1; i<=10; i++){
            System.out.println(i);
        }
        double result = Main.Add(30,50);
    }
    public static double Add(int a, int b){
        double sum = a + b ;
        System.out.println(sum);
        return  sum;
    }



}