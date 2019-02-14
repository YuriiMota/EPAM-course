package epam.lambda.task2;

@FunctionalInterface
public interface Command {
    void execute(String value);
}
