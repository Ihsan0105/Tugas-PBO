import java.util.ArrayList;

public class ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        
        for(int angka : arrayList){
            System.out.print(angka + " ");
        }
        System.out.println();
    }
}
