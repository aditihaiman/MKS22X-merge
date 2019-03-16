import java.io.*;
import java.util.*;

public class Driver {
  public static void main(String[] args) {

    int[] data = {3,7, 2, 4};
    int[] temp = {2,4};
    Merge.merge(data, 0, 1, 3);
    System.out.println(Arrays.toString(data));

  }
}
