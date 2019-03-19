import java.io.*;
import java.util.*;

public class Driver {
  public static void main(String[] args) {

    int length = 20000;
    int[] data = new int[length];
    int[] test = new int[length];
    Random r = new Random();
    for(int x = 0; x < length; x++){
      int temp = r.nextInt(100000);
      data[x] = temp;
      test[x] = temp;
    }

    Arrays.sort(test);
    Merge.mergesort(data);

    String output = "";
    for(int x = 0; x < length; x++){
      if(test[x]!=data[x]) {
        output+="Failed to Sort\n";
      }
    }
    if(output.equals("")) output = "Success!";

    System.out.println(output);

    int[] arr = {5, 1, 6, 4, 2, 7, 8, 3};
    Merge.insertionsort(arr, 1, 6);
    System.out.println(Arrays.toString(arr));

  }

//   public static void main(String[]args){
//   System.out.println("Size\t\tMax Value\tquick/builtin ratio ");
//   int[]MAX_LIST = {1000000000,500,10};
//   for(int MAX : MAX_LIST){
//     for(int size = 31250; size < 2000001; size*=2){
//       long qtime=0;
//       long btime=0;
//       //average of 5 sorts.
//       for(int trial = 0 ; trial <=5; trial++){
//         int []data1 = new int[size];
//         int []data2 = new int[size];
//         for(int i = 0; i < data1.length; i++){
//           data1[i] = (int)(Math.random()*MAX);
//           data2[i] = data1[i];
//         }
//         long t1,t2;
//         t1 = System.currentTimeMillis();
//         Merge.mergesort(data2);
//         t2 = System.currentTimeMillis();
//         qtime += t2 - t1;
//         t1 = System.currentTimeMillis();
//         Arrays.sort(data1);
//         t2 = System.currentTimeMillis();
//         btime+= t2 - t1;
//         if(!Arrays.equals(data1,data2)){
//           System.out.println("FAIL TO SORT!");
//           System.exit(0);
//         }
//       }
//       System.out.println(size +"\t\t"+MAX+"\t"+1.0*qtime/btime);
//     }
//     System.out.println();
//   }
// }

}
