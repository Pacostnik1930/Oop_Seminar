import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Radio radio = new Radio();

        // <Animal>
        List<Speakable> speakables = new ArrayList<>();
        speakables.add(cat);
        speakables.add(dog);
        speakables.add(radio);

        speakAll(speakables);
    }

    static void speakAll(List<Speakable> speakables) {
        for (Speakable speakable : speakables) { 
            speakable.speak();
        }
    }
}
