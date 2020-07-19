package CampusHire0314;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ThreadPoolExecutor;

public class MaxScore_03 {

    public static void main(String[] args) {
        // 输入数据
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            lista.add(scanner.nextInt());
        }

        for (int i = 0; i < num; i++) {
            listb.add(scanner.nextInt());
        }

        Collections.sort(lista);
        Collections.sort(listb);

        int suma = 0, sumb = 0;
        int i = lista.size() - 1, j = listb.size() - 1;
        boolean flag = true; // 标记谁是先手
        while (!lista.isEmpty() && !listb.isEmpty() || flag == false) {
            if (flag) {
                if (lista.get(i) < listb.get(j)) {
                    listb.remove(j--);
                } else {
                    suma += lista.remove(i--);
                }
                flag = false;
            } else {
                if (listb.get(j) < lista.get(i)) {
                    lista.remove(i--);
                } else {
                    sumb += listb.remove(j--);
                }
                flag = true;
            }
        }
        System.out.println(suma - sumb);
    }
}
