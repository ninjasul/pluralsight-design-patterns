package behavioral._02_command.runnable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Builder
public class Task implements Runnable {

    private int num1;
    private int num2;

    @Override
    public void run() {
        System.out.println(num1 * num2);
    }
}