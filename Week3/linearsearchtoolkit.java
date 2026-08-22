public class linearsearchtoolkit {
    static boolean contains(int[] arr, int t) {
        if (arr.length == 0) {
            System.out.print("NOTHINGINSIDE ARRAY");

            return false;
        } else {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == t)
                    return true;
            }
        }
        return false;
    }

    static int firstIndexOf(int[] arr, int t) {
        int i = 0;
        if (arr.length == 0) {
            System.out.print("NOTHINGINSIDE ARRAY");
            return 0;

        }

        else {
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == t)
                    break;
            }
        }
        return i;
    }

    static int lastIndexOf(int[] arr, int t) {
        int i = arr.length - 1;
        if (arr.length == 0) {
            System.out.print("NOTHINGINSIDE ARRAY");
            return 0;

        }

        else {
            for (; i >= 0; i--) {
                if (arr[i] == t)
                    break;
            }
        }
        return i;
    }

    static int count(int[] arr, int t) {
        int i, c = 0;
        if (arr.length == 0) {
            System.out.print("NOTHINGINSIDE ARRAY");
            return 0;

        }

        else {
            for (i = 0; i < arr.length; i++) {
                if (arr[i] == t)
                    c++;
            }
        }
        return c;
    }

}
