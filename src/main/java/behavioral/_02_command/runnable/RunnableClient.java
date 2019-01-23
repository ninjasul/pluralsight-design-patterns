package behavioral._02_command.runnable;

public class RunnableClient {

    public static void main(String[] args) {
        Task task1 = Task.builder()
                .num1(10)
                .num2(12)
                .build();

        Task task2 = Task.builder()
                .num1(11)
                .num2(13)
                .build();

        Thread thread1 = new Thread(task1);
        thread1.start();

        Thread thread2 = new Thread(task2);
        thread2.start();
    }
}