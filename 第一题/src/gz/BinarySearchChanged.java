package gz;

public class BinarySearchChanged {
    static int binarySearchChanged(int[] a, int value, int left, int right) {

        int mid;
        int j;
        int i;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (value == a[mid]) {
                i=j=mid;
                System.out.println("找到了"+value+",i和j的位置一样是"+mid);
                return mid;
            } else if (value < a[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        i=right;
        j=left;
        System.out.println("没有找到"+value+",i的位置为"+i+",j的位置为"+j);
        return -1;
    }
}