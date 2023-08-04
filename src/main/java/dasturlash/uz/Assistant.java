package dasturlash.uz;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Assistant {
    public Assistant() {
        System.out.println("Assistant constructor");
    }
}

