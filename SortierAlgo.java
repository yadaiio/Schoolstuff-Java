public class SortierAlgo {
    public static void main(String[] args) {

        int n= 0;
        int position = 0;
        int minPos = 0;
        int suchPos = 0;

        n = 5;

        int [] a = new int[n];
        
        a[0] = 22;
        a[1] = 17;
        a[2] = 1;
        a[3] = 18;
        a[4] = 6;

        for(position=0;position<=n-2;position=position+1) {
            minPos = position;

                for(suchPos = position+1; suchPos<=n-1; suchPos=suchPos+1) {
                    if(a[suchPos] < a[minPos]) {
                        minPos = suchPos;
                    }
                }
                int buffer = a[minPos];
                a[minPos] = a[position];
                a[position] = buffer;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
