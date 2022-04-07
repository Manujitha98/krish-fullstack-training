package Lambda.example2.Lambda;

import Lambda.example2.traditional.LoggerImplementation;

public class Main {
    public static void main(String[] args) {
       Logger systemLogger = s -> System.out.printf(s);
       systemLogger.logToConsole("Up and running on a lambda expression!");
    }

}
