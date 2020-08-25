package practice;

import java.util.*;
import java.util.function.Consumer;

public class ListPractice {
    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4};
        List testList = new ArrayList();
        testList.addAll(Arrays.asList(intArray));
        testList.forEach(System.out::println);
    }
}
