package Lambda.example2.traditional;

public class LoggerImplementation implements Logger{
    public void logToConsole(String message) {

        System.out.println("Log - ".concat(message));
    }
}
