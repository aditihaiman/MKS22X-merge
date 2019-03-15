public class Merge {


  public static void mergesort(int[] data, int lo, int hi) {
    if(lo < hi) {
      mergesort(data, lo, (hi-lo)/2);
      mergesort(data, (hi-lo)/2, hi);

    }
  }

  public static void merge(int[] data, int[] temp, int lo, int hi) {

  }

  private static void copy(int[] data, int[] temp){
    for(int x = 0; x < data.length; x++) {
      temp[x] = data[x];
    }
  }

}
