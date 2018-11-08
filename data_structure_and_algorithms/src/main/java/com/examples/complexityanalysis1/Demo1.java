
package com.examples.complexityanalysis1;

/**
 * @author zhangmengc
 * @date 2018/11/8 15:39
 * @since v1.0.0
 */
public class Demo1 {

    int cal(int n) {
        int sum = 0;
        int i = 1;
        for (; i <= n; ++i) {
            sum = sum + i;
        }
        return sum;
    }

}
