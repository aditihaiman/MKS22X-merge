import java.util.*;
import java.io.*;

public class Merge {


  public static void mergesort(int[] data, int lo, int hi) {
    if(data.length>1) {
      int mid = (hi+lo)/2;
      mergesort(data, lo, mid);
      mergesort(data, mid+1, hi);
      //merge;
    }
  }

  public static void merge(int[] data, int lo, int mid, int hi) {
    //int[] output = new int[data.length+temp.length];
    int[] temp = new int[data.length];
    copy(data, temp);
    int idx = mid+1;
    int idx2 = lo;
    while(lo<=mid && idx<=hi) {
      System.out.println("A");
      if(temp[idx] <= temp[lo]) {
        data[idx2] = temp[idx];
        idx++;
      }
      else{
        data[idx2] = temp[lo];
        lo++;
      }
      idx2++;
    }
    while(lo<=mid) { //takes care of leftover values
      data[idx2] = temp[lo];
      lo++;
    }
    while(idx<=hi){
      data[idx2] = temp[idx];
      idx++;
    }
    //return output;
  }

  private static void copy(int[] data, int[] temp){
    for(int x = 0; x < data.length; x++) {
      temp[x] = data[x];
    }
  }

  //private static void swap(int[] data, )

}
