import java.util.LinkedList;

public class Week_8_3 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        System.out.println("List: " + list);

        int size = list.size();
        int i = size / 2;

        int mid = list.get(i);
        System.out.println("Middle node: " + mid);
    }
}
