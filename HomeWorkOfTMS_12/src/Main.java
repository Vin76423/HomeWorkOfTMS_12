import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1
        Queue<String> ar = new PriorityQueue<>();

        ar.offer("Иванов");
        ar.offer("Сидоров");
        ar.offer("Петров");
        ar.offer("Васечкин");

        while (!ar.isEmpty())
            System.out.println("Доктор лечит " + ar.poll() + "a");

//        System.out.println(ar.peek());      // Не удаляет из очереди
//        System.out.println(ar);
//
//        System.out.println(ar.poll());      // удаляет из очереди
//        System.out.println(ar);



        //2
        Deque<String> stack = new  ArrayDeque<>();
//        stack.addFirst("a");
//        stack.add("b");
//        stack.addLast("c");
//
//        System.out.println();
//
//        Iterator<String> iterator = stack.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//
//        stack.pollLast();
//        stack.poll();
//
//        System.out.println(stack);


        stack.push("Cамая большая тарелка");
        stack.push("Тарелка средней величины");
        stack.push("Небольшая тарелочка");
        stack.push("Маленькая тарелка для десертов");

        while (!stack.isEmpty())
            System.out.println("Убираем в шкаф: " + stack.pop());
    }
}
