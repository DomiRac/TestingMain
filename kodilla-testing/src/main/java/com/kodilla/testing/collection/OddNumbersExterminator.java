package com.kodilla.testing.collection;
        import java.util.ArrayList;
        import java.util.Arrays;
        import java.util.List;

public class OddNumbersExterminator {

    public List<Integer> exterminate (List<Integer> numbersList) {
        List<Integer> list = new ArrayList<>();

        int temporaryValue = 0;
        for (int i = 0; i < numbersList.size(); i++) {
            temporaryValue = numbersList.get(i);
            if (temporaryValue % 2 == 0) {
                list.add(temporaryValue);
            }
        }
        return list;
    }
}