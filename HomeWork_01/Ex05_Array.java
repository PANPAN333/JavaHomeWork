package Examples.HomeWork_01;
/*
 * 5*. Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного,
а остальные - равны ему.
 */
public class Ex05_Array {
    public static void main(String[] args) {
        int[] a = {3,2,2,3};
        boolean f = false;
        int last_pos = a.length-1;
        int tmp_str;
        int digit = 3;

        for (int i = 0; i < a.length; i++) {
            if (i >= last_pos) {
                break;
            }
            if (digit == a[i]) {
                while (a[last_pos] == digit) {
                    last_pos--;
                }
                tmp_str = a[last_pos];
                a[last_pos] = a[i];
                a[i] = tmp_str;
            }
            
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
}
