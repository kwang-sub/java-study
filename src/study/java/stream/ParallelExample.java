package study.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ParallelExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList(
                "1", "2", "3", "4", "5"
        );


        Stream<String> stream = list.stream();
        stream.forEach(ParallelExample :: print);

        Stream<String> parallelStream = list.parallelStream();
        parallelStream.forEach(ParallelExample::print);
    }

    public static void print(String str){
        System.out.println(str + " : " + Thread.currentThread().getName());
    }
}
