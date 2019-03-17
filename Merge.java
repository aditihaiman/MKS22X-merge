import java.util.*;
import java.io.*;

public class Merge {


  public static void mergesort(int[] data) {
    int[] temp = new int[data.length];
    mergesort(data, temp, 0, data.length-1);
  }

  public static void mergesort(int[] data, int[] temp, int lo, int hi) {
    if(lo<hi) {
      int mid = (hi+lo)/2;
      mergesort(data, temp, lo, mid);
      mergesort(data, temp, mid+1, hi);
      merge(data, temp, lo, mid, hi);
    }
  }

  public static void merge(int[] data, int[] temp, int lo, int mid, int hi) {
    copy(data, temp, lo, hi);
    int idx = mid+1;
    int idx2 = lo;
    while(lo<=mid && idx<=hi) {
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
      idx2++;
      lo++;
    }
    while(idx<=hi){
      data[idx2] = temp[idx];
      idx2++;
      idx++;
    }
  }

  private static void copy(int[] data, int[] temp, int lo, int hi){
    for(int x = lo; x < hi+1; x++) {
      temp[x] = data[x];
    }
  }

}
