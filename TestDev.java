

import org.junit.jupiter.api.Test;

public class TestDev {

    // Premitive
//    int a;
//    float b;
//    double d;
//    char c;
    // Non premitive
//    Integer aa = null;
//    Float bb = null;
//    Double cc = null;
//    String ss = null;



    @Test
    public void testArray(){
        int n = 5;
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n + 3; j++)
            {
                System.out.println(j);
                if (i == j)
                {
                    System.out.println("**");
                    j += 2;
                }
            }
            System.out.println();
        }
    }
    @Test
    public void testArray2(){
        int n = 4;
        for (int i = 1; i <= n ; i++)
        {
            for (int j = 1; j <= n + 3; j++)
            {
                System.out.println(j);
                if (i == j)
                {
                    System.out.println("**");
                    j += 2;
                }
            }
            System.out.println();
        }
    }

    @Test
    public void Test2() {
        var harga = new int[]{10, 7, 5, 8, 11, 9, 1};
        int maxSelisih = 0;
        for (int x = 0; x < harga.length; x++) {
            for (int y = x; y < harga.length; y++) {
                int selisih = Math.abs(harga[x] - harga[y]);
                if (maxSelisih == 0) {
                    maxSelisih = selisih;
                } else if (maxSelisih < selisih) {
                    maxSelisih = selisih;
                }
            }
        }
        System.out.println(maxSelisih);
    }
}



