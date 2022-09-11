import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {

    public static class Main {
        private void go()  throws IOException {
            List<String> list = new ArrayList<>();
            List<Animal> animals = new ArrayList<>();
            // change the file path to where your animals text is
            Scanner scan = new Scanner(new File ("Animal.txt"));

            while (scan.hasNextLine()) {
                String[] fields = scan.nextLine().split(",");
                switch (fields[0]) {
                    case "A" -> animals.add(new Animal(fields[1], fields[2]));
                    case "C" -> animals.add(new cat(fields[1], fields[2]));
                    case "D" -> animals.add(new dog(fields[1], fields[2]));
                }
            }
            scan.close();
            animals.forEach(System.out::println);


        }

        public static void main(String[] args) throws IOException {
            new Main().go();
        }

    }
}