package Lambda.example1.traditional;

public class Main {
    public static void main(String[] args) {
        AdditionMachine numberAdder = new AdditionMachine();
        int a = 5;
        int b= 10;
        int result = numberAdder.addTwoNumbers(a,b);
        System.out.println(result);
    }
}
