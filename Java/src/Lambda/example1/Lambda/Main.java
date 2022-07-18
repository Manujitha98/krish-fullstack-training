package Lambda.example1.Lambda;

import Lambda.example1.traditional.AdditionMachine;

public class Main {
    public static void main(String[] args) {
    Add addingMachine = (a,b) -> a+b;

    int result = addingMachine.addTwoNumbers(5,25);
        System.out.println(result);
    }
}
