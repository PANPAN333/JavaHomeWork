package Examples.HomeWork_01;

import java.util.ArrayList;

/*
 * 6*.Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
    Если общего префикса нет, вернуть пустую строку "".
 */
public class Ex06_Prefix {
    public static void main(String[] args) {
        String words[] = {"Башкур", "Башмут", "Азимут", "Башкиртастан", "Бабайка"};
        ArrayList<String> prefixes = new ArrayList<>();
        StringBuilder pref = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            var wordChar = words[i].toCharArray();
            for (int j = i + 1; j < words.length; j++) {
                var wordChar2 = words[j].toCharArray();
                for (int k = 0; k < wordChar.length; k++) {
                    if (wordChar2.length <= k)  {
                        break;
                    }
                    if (wordChar[k] == wordChar2[k]) {
                        pref.append(wordChar[k]);
                    } else {
                        break;
                    }
                }
                if (pref.length() > 0) {
                    prefixes.add(pref.toString());
                    pref = new StringBuilder();
                }
            }
        }

        String max = " ";
        System.out.println(prefixes);
        for (String p: prefixes) {
            if (p.length() > max.length()) {
                max = p;
            }
        }
        System.out.println(max);
    }

}
