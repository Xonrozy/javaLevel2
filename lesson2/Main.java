package ru.zhugin.lesson2;

public class Main {
    public static void main(String[] args) {

        // Array Task
        String[][] data1 = new String[][] {
                {"a", "b"},
                {"c", "d"}
        };

        String[][] data2 = new String[][] {
                {"a", "b"},
                {"c", "d"},
                {"e", "f"},
                {"g", "h"}
        };

        String[][] data3 = new String[][] {
                {"23", "b", "c", "d"},
                {"c", "d", "e", "f"},
                {"e", "f", "g", "h"},
                {"g", "h", "i", "j"}
        };

        String[][] data4 = new String[][] {
                {"11", "22", "ХХ", "44"},
                {"55", "66", "77", "88"},
                {"99", "12", "23", "34"},
                {"56", "67", "78", "89"}
        };

        try {

            //ArrTask.sumArrayElements(data1);
            //ArrTask.sumArrayElements(data2);
            //ArrTask.sumArrayElements(data3);
            System.out.println("sum of data4 elements: " + ArrTask.sumArrayElements(data4));

        } catch (MyException e) {

            System.out.println(e.getMessage());

        }
    }
}
