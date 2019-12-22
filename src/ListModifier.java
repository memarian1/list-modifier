import java.util.ArrayList;
import java.util.Scanner;

public class ListModifier {
    private void listModifier(ArrayList<Integer> numbers){
        if (numbers.size() % 2 ==1) numbers.remove(numbers.size()-1);
        for (int r = 1;r < numbers.size();r+=2){
            int l = r - 1;
            if (numbers.get(l) > numbers.get(r)){
                numbers.remove(l);
                numbers.remove(r-1);
                r -= 2;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListModifier list = new ListModifier();
        ArrayList<Integer> numbers =new ArrayList<>();
        for (int i = 0;i<=numbers.size();i++){
            System.out.println("enter" +(i+1)+ "'s number");
            int m = scanner.nextInt();
            numbers.add(i,m);
            System.out.println("do you want to stop adding?");
            String stp = scanner.next();
            if (stp.contains("y")){
                break;
            }
        }
        System.out.println("list:" + numbers);
        list.listModifier(numbers);
        System.out.println("modified list:" + numbers);
    }
}
