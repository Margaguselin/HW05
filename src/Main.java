import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] list = {2, 3, 1, 0};
        System.out.println(sumNumbers(list));

        List<Integer> listTwo = new ArrayList<>();
        listTwo.add(2);
        listTwo.add(3);
        listTwo.add(1);
        listTwo.add(0);

        System.out.println(averageNumbers(listTwo));

        multiplicationTable(15);

        numbersCount();

        List<String> letterList = new ArrayList<>();
        letterList.add("a");
        letterList.add("b");
        letterList.add("c");

        List<String> numberList = new ArrayList<>();
        numberList.add("1");
        numberList.add("2");
        numberList.add("3");

        System.out.println(combineList(letterList, numberList));

    }

    public static int sumNumbers(int[] list) {
        int total = 0;
        for (int i = 0; i < list.length; i++) {
            total += list[i];
        }
        return total;
    }

    public static double averageNumbers(List<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return (double) total / list.size();


    }

    public static void multiplicationTable(int n) {
        int count = 1;
        while (count <= 10) {
            System.out.println(n + "*" + count + "=" + n * count);
            count++;
        }
    }

    public static void numbersCount() {
        int count = 1;
        while (count <= 100) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (count % 3 == 0) {
                System.out.println("Fizz");
            } else if (count % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }
            count++;

        }
    }

    public static List<String> combineList(List<String> list1, List<String> list2) {
        List<String> newList = new ArrayList<>();

        int index = 0;
        while (index < list1.size()) {
            newList.add(list1.get(index));
            newList.add(list2.get(index));
            index++;
        }

        return newList;
    }
}
