package dasturlash.uz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
public class Lesson {
    @Lazy
    @Autowired
    private Assistant assistant;
    @Autowired
    private Professor professor;


    public Lesson() {
        System.out.println("Lesson constructor");
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "professor=" + professor +
                ", assistant=" + assistant +
                '}';
    }
}
