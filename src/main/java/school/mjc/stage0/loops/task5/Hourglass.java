package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        for (int x = 0; x < height; x++) {
            for (int y = 0; y < height; y++) {
                int h2 = height / 2;
                if (x < h2) {
                    if (x > y || height - y <= x && y > h2) {
                        System.out.print(" ");
                    } else System.out.print("8");
                } else {
                    if (x < y || y < h2 && x < height - y - 1) {
                        System.out.print(" ");
                    } else System.out.print("8");
                }
            }
            System.out.println();
        }
    }
}
