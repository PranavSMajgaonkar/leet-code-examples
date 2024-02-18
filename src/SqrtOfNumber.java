public class SqrtOfNumber {

    public static int sqrt(int number){
      long end = number, start = 0, mid = 0;

      while (start <= end){
          mid = (start + end) / 2;
          if (mid * mid > number){
              end = mid-1;
          } else if (mid * mid < number) {
              start = mid+1;
          }
          else {
              return (int) mid;
          }
      }
        return (int) end;
    }

    public static void main(String[] args) {
        int num = 2147395599;
        System.out.println(sqrt(num));
    }
}
