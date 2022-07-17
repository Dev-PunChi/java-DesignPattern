package Flyweight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Digit {
    private ArrayList<String> data = new ArrayList<>();

    public Digit(String fileName) {
        try (FileReader fr = new FileReader(fileName);
                BufferedReader br = new BufferedReader(fr)) {
            for (int i = 0; i < 8; i++) {
                data.add(br.readLine());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void print(int x, int y) {
        for (int i = 0; i < 8; i++) {
            String line = data.get(i);
            System.out.print(String.format("%c[%d;%df", 0x1B, y + i, x));
            System.out.print(line);
        }
    }
}
