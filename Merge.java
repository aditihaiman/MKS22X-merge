import java.util.*;
import java.io.*;

public class Merge {


  public static void mergesort(int[] data) {
    int[] temp = new int[data.length];
    mergesort(data, temp, 0, data.length-1);
  }

  private static void mergesort(int[] data, int[] temp, int lo, int hi) {
    if(lo<hi) {
      int mid = (hi+lo)/2;
      mergesort(data, temp, lo, mid);
      mergesort(data, temp, mid+1, hi);
      merge(data, temp, lo, mid, hi);
    }
  }

  private static void merge(int[] data, int[] temp, int lo, int mid, int hi) {
    copy(data, temp, lo, hi);
    int idx = mid+1;
    int idx2 = lo;
    while(lo<=mid && idx<=hi) { //while indices are within the partitioned sections
      if(temp[idx] <= temp[lo]) { //compares values and adds smaller one to original array
        data[idx2] = temp[idx];
        idx++;
      }
      else{
        data[idx2] = temp[lo];
        lo++;
      }
      idx2++;
    }
    while(lo<=mid) { //takes care of leftover values when one partitioned section is longer than another
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

  public static void insertionsort(int[] data, int lo, int hi){
    if (data.length > 0) {
      for (int x = lo+1; x <= hi; x++) {
        int temp = data[x];
        int y = x-1;
        int sub = 0;
        while (y >= 0 && temp < data[y]) {
          data[x-sub] = data[y];
          y--;
          sub++;
        }
        data[y+1] = temp;
      }
    }

  }

}
