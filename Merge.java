public class Merge {


  public static void mergesort(int[] data, int lo, int hi) {
    if(lo < hi) {
      mergesort(data, lo, (hi-lo)/2);
      mergesort(data, (hi-lo)/2, hi);
      //merge;
    }
  }

  public static void merge(int[] data, int[] temp, int lo, int hi, int mid) {
    int idx = lo;
    int idx2 = mid;
    while(idx<=mid) {
      if(temp[idx] > temp[idx2]) {
        data[idx] = temp[idx2];
        idx2++;
      }
      else{
        data[idx] = temp[idx];
        idx++;
      }
    }

  }

  private static void copy(int[] data, int[] temp){
    for(int x = 0; x < data.length; x++) {
      temp[x] = data[x];
    }
  }

  //private static void swap(int[] data, )

}
