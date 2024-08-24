import java.util.ArrayList;

public class Week_8_1 {
    public static void main(String[] args) {

        ArrayList<Integer> num = new ArrayList<>();

        num.add(12);
        num.add(25);
        num.add(34);
        num.add(46);

        System.out.println("Array: "+num);
        num.remove(Integer.valueOf(25));
        System.out.println("Array: " +num);
    }
}
