
package com.examples.complexityanalysis1;

/**
 * @author zhangmengc
 * @date 2018/11/8 15:39
 * @since v1.0.0
 */
public class Demo2 {

    int cal(int n) {
        int sum_1 = 0;
        int p = 1;
        for (; p < 100; ++p) {
            sum_1 = sum_1 + p;
        }

        int sum_2 = 0;
        int q = 1;
        for (; q < n; ++q) {
            sum_2 = sum_2 + q;
        }

        int sum_3 = 0;
        int i = 1;
        int j = 1;
        for (; i <= n; ++i) {
            j = 1;
            for (; j <= n; ++j) {
                sum_3 = sum_3 +  i * j;
            }
        }

        return sum_1 + sum_2 + sum_3;
    }

}
