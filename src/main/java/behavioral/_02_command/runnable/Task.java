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
        // 아래 코드는 Receiver 객체가 대행하게 수정할 수 있음.
        System.out.println(num1 * num2);
    }
}