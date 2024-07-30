package Exercise03;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> IntList = new ArrayList<>();
        IntList.add(1);
        IntList.add(2);
        IntList.add(3);
        IntList.add(4);
        System.out.println(IntList);
      while(!IntList.isEmpty()){
          try{
              System.out.println(findMax(IntList));
              break;
          }catch (Exception e){
              System.out.println("Mang rong ");
              break;
          }
      }
    }
    public static int findMax(List<Integer> arr) {
        int max = arr.get(0);
        for (int i = 1; i < arr.size(); i++) {
            if(arr.get(i) >max){
                max = arr.get(i);
            }
        }
        return max;
    }
}
