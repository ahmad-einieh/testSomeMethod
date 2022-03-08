public class Checker {
    public static void main(String[] args) {
        /*for (int i=0;i<5;i++){
            System.out.println("hello");
        }*/
        boolean[] a = new boolean[10];
        for (int i = 0; i < 6; i++) {
            a[i] = true;
        }
        for (int i = 6; i < a.length; i++) {
            a[i] = false;
        }
        System.out.println(getIndex(a));
        System.out.println(getIndex2(a, a.length - 1));
    }

    public static int getIndex(boolean[] A) {
        for (int k = A.length - 1; k >= 0; k--) {
            if (A[k]) {
                return k;
            }
        }
        return -1;
    }

    public static int getIndex2(boolean[] A, int end) {
        if (!A[0]) return -1;
        if (A[end]) return end;
        return getIndex2(A, end - 1);
    }
}
