package JavaLanguage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Streams
{

    List<Integer> intStream;
    List<String> stringStream;
    @BeforeTest
    public void init()
    {
     intStream= List.of(1,2,3,8,1,88);
     stringStream= List.of("amit","kapoor","ram","pa","p");
    }


    private static void print(int number)
    {
        System.out.println(number);
    }

    @Test
    private void displayCallingStaticMethodRef()
    {
      intStream.stream().forEach(Streams::print);
    }

    @Test
    private void displayCallingWithoutFunctionRef()
    {
        intStream.stream().forEach(System.out::println);
    }

    @Test
    private void filter()
    {
        intStream.stream().filter(i->i%2==0).forEach(System.out::println);
    }

    @Test
    private void namesHasLeastFourLetters()
    {
        stringStream.stream().filter(str->str.length()>=2).forEach(System.out::println);
    }

    @Test
    private void mapFunction()
    {
        stringStream.stream().map(str->str.length()).forEach(System.out::println);
        stringStream.stream().map(str->str.toUpperCase()).forEach(System.out::println);
    }

    @Test
    private void reduceMethod()
    {
       int sum= intStream.stream().reduce(0,(x,y)->x+y);
       System.out.println(sum);
    }

    @Test
    private void filterReduce()
    {
        int sum=intStream.stream().filter(i->i%2==0).reduce(0,Integer::sum);
        System.out.println(sum);
    }

    @Test
    private void distinct()
    {
        intStream.stream().distinct().forEach(System.out::println);
    }

    @Test
    private void sorting()
    {
        intStream.stream().distinct().sorted().forEach(System.out::println);
    }

    @Test
    private void compare()
    {
        intStream.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
        intStream.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        intStream.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        stringStream.stream().distinct().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
    }

    @Test
    private void collector()
    {
        intStream.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toList());
        intStream.stream().distinct().sorted(Comparator.naturalOrder()).collect(Collectors.toSet());

    }

}
