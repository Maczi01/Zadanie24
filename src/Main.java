import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Computer> computers = new ArrayList<>();
        Computer computer1 = new Computer("Dell", 6000, 768);
        Computer computer2 = new Computer("Dell", 10000, 512);
        Computer computer3 = new Computer("Dell", 10000, 256);
        Computer computer4 = new Computer("Apple II", 650, 4);

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);
        System.out.println(computers);
        Collections.sort(computers);
        System.out.println(computers);

    }
}
