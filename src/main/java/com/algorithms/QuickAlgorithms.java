package com.algorithms;

import java.util.ArrayList;
import java.util.List;

public class QuickAlgorithms {

    private QuickAlgorithms() {
    }

    public static List<String> quickUnion(List<String> list) {
        List<String> result = new ArrayList<String>();
        int[] id = initializeArray();

        for (String pair : list) {

            int p = Integer.parseInt(pair.split("-")[0]);
            int q = Integer.parseInt(pair.split("-")[1]);
            int k = p;
            int j = q;

            while (k != id[k]) {
                k = id[k];
            }
            while (j != id[j]) {
                j = id[j];
            }

            if (k == j) {
                continue;
            }

            id[k] = j;

            result.add(p + "-" + q);
        }

        return result;
    }

    public static List<String> quickSearch(List<String> list) {
        List<String> result = new ArrayList<String>();
        int[] id = initializeArray();

        for (String pair : list) {

            int p = Integer.parseInt(pair.split("-")[0]);
            int q = Integer.parseInt(pair.split("-")[1]);
            int t = id[p];

            if (t == id[q]) {
                continue;
            }
            for (int i = 0; i < id.length; i++) {
                if (id[i] == t) {
                    id[i] = id[q];
                }
            }
            result.add(p + "-" + q);
        }

        return result;
    }

    private static int[] initializeArray() {
        int[] id = new int[10];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }

        return id;
    }


}
