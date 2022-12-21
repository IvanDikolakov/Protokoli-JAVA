import java.util.stream.Stream;

public class StringStreamDemo {
    public static void main(String[] args) {
        String[] names = {"John", "Peter", "Susan", "Kim", "Will",
                "Smith", "Anthony", "Raphael", "Alan", "Johny"};

        Stream.of(names)
                .limit(4)
                .sorted()
                .forEach(e -> System.out.print(e + " "));

        System.out.println();
        Stream.of(names)
                .skip(4)
                .sorted((n1, n2) -> n1.compareToIgnoreCase(n2))
                .forEach(e -> System.out.print(e + " "));

        System.out.println();
        Stream.of(names)
                .skip(4)
                .sorted(String::compareToIgnoreCase)
                .forEach(e -> System.out.print(e + " "));

        System.out.println("\nLargest string with length > 4: "
                + Stream.of(names)
                .filter(name -> name.length() > 4)
                .max(String::compareTo)
                .get());

        System.out.println("Smallest string alphabetically: "
                + Stream.of(names)
                .min(String::compareTo)
                .get());

        System.out.println("Raphael is in names? "
                + Stream.of(names)
                .anyMatch(e -> e.equals("Raphael")));

        System.out.println("All names start with a capital letter? "
                + Stream.of(names)
                .allMatch(name -> Character.isUpperCase(name.charAt(0))));

        System.out.println("No name begins with Ko? "
                + Stream.of(names)
                .noneMatch(name -> name.startsWith("Ko")));

        System.out.println("Number of distinct case-insensitive strings: "
                + Stream.of(names)
                .map(name -> name.toUpperCase())
                .distinct()
                .count());

        System.out.println("First element in this stream in lowercase: "
                + Stream.of(names)
                .map(String::toLowerCase)
                .findFirst()
                .get());

        System.out.println("Skip 4 and get any element in this stream:"
                + Stream.of(names)
                .skip(4)
                .sorted()
                .findAny()
                .get());

        Object[] namesInLowerCase = Stream.of(names)
                .map(String::toLowerCase)
                .toArray();

        System.out.println(java.util.Arrays.toString(namesInLowerCase));
    }
}
