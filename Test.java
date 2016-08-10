import java.util.List;
import java.util.ArrayList;

class Test
{
    public static void main(String[] args)
    {
        List<Integer> c = new ArrayList<>();

        c.add(1);
        c.add(4);
        c.add(7);
        c.add(2);
        c.add(3);
        c.add(1);
        c.add(23);

        c.stream()
        .filter(e -> e>5)
        .forEach(System.out::println);
    }
}