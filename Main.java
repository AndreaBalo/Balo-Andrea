package lab4_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Object lab4_1_input;
        readFilePrintItsLineNumbered(lab4_1_input.txt);
        ArrayList<Person> persons = new ArrayList<>();
        Person person1 = new Person("Andrea", "Balo", 2001);
        Person person2 = new Person("David-Mark", "Komuves", 2001);
        Person person3 = new Person("Daniel", "Derzsi", 2001);
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);
        for (Person person : persons) {
            System.out.println(person);
        }
        System.out.println("\n\n********\n\n");
        ArrayList<Person> personsFromFile = readFromCSVFile("lab4_1_input.csv");

        for(Person person : personsFromFile){
            System.out.println(person);
        }
    }

    public static void readFilePrintItsLineNumbered(String fileName) {
// Open the file
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        if (scanner != null) {
            for (int i = 1; scanner.hasNextLine(); ++i) {
                String line = scanner.nextLine();
                //ellenorzes, ures sor
                System.out.println(i + " " + line);
            }
            scanner.close();
        }
        //...
    }

    public static ArrayList<Person> readFromCSVFile(String fileName) {
// Open the file
// ...
// Read data from file
        ArrayList<Person> persons = new ArrayList<>();
        Scanner scanner = null;
        if (scanner != null) {
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.isEmpty()) {
                    continue;
                }
                String[] items = line.split(",");
                // trim: eliminates leading and trailing spaces
                String firstName = items[0].trim();
                String lastName = items[1].trim();
                String birthYear = items[2].trim();
                // Convert String → int: Integer.parseInt( String)
                int birtYear = Integer.parseInt(items[2].trim());
                persons.add(new Person(firstName, lastName, birtYear));
            }
            scanner.close();
        }
        return persons;
    }
}