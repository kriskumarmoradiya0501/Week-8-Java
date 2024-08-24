import java.util.LinkedList;

public class Week_8_2 {
    public static void main(String[] args) {

        LinkedList<String> task = new LinkedList<>();

        task.add("Preparation of sub Java");
        task.add("case study work");
        task.add("complete assignmnt");
        task.add("prepar for exams");

        System.out.println("Task:");
        for (String t : task) {
            System.out.println(t);
        }

        task.addFirst("semester notes");
        task.addLast("submit assignmet");

        System.out.println("Task:");
        for (String t : task) {
            System.out.println(t);
        }

        task.removeFirst();
        task.removeLast();

        System.out.println("Task:");
        for (String t : task) {
            System.out.println(t);
        }

        String ftask = task.getFirst();
        String ltask = task.getLast();

        System.out.println("Frist task: " + ftask);
        System.out.println("Last Task: " + ltask);
    }
}
