import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        LinkedList<Integer> linkedList = new LinkedList<>();
        ArrayList<Integer> arrayList = new ArrayList<>();
        int [] array = new int[10];
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(0, 2));
            linkedList.add(random.nextInt(0, 2));
            array[i] = random.nextInt(0,2);
        }
        System.out.println("Before sort linkedList"+linkedList);
        System.out.println("After sort linkedList :");
        sortLinkedList(linkedList);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Before sort arrayList"+arrayList);
        System.out.println("After sort arrayList :");
        sortArrayList(arrayList);
        System.out.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Before sort array "+Arrays.toString(array));
        System.out.println("After sort array :");
        sortArray(array);
    }

    public static void sortArrayList(ArrayList<Integer> arrayList) {
        Collections.sort(arrayList);
        for (Integer integer : arrayList) {
            System.out.print(" "+integer);
        }
    }

    public static void sortLinkedList(LinkedList<Integer> linkedList) {
        Collections.sort(linkedList);
        for (Integer integer : linkedList) {
            System.out.print(" "+integer);
        }
    }
    public static void sortArray(int [] array){
        Arrays.sort(array);
        for (int a:array) {
            System.out.print(" "+a);
        }
    }
}
