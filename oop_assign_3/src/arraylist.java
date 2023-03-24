import java.util.ArrayList;

public class arraylist {
    public static Integer max(ArrayList<Integer> list){
        if(list.isEmpty() || list.size()==0)
            return null;
        Integer max = list.get(0);
        for (var i: list)
            if(list.get(i) > max)
                max = list.get(i);
        return max;
        }
    public static void sort(ArrayList<Integer> list){
        for (int i = 1; i < list.size(); i++) {
            for (int j = 0; j < list.size()-i; j++) {
                if(list.get(j) > list.get(j+1)){
                    list.set(j, list.get(j+1));
                    list.set(j+1, list.get(j));
                }
            }
        }
    }
}
