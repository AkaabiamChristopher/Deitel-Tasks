public class Pixel {
    public static void main(String[] args) {
        int[] pixels = {12, 25, 45, 67, 83, 105, 130, 145, 162, 199};

        for (int count = 0; count < pixels.length; count++) {
            int value = pixels[count];

            if (value >= 0 && value <= 20)
                pixels[count] = 10;
            else if (value >= 21 && value <= 40)
                pixels[count] = 30;
            else if (value >= 41 && value <= 60)
                pixels[count] = 50;
            else if (value >= 61 && value <= 80)
                pixels[count] = 70;
            else if (value >= 81 && value <= 100)
                pixels[count] = 90;
            else if (value >= 101 && value <= 120)
                pixels[count] = 110;
            else if (value >= 121 && value <= 140)
                pixels[count] = 130;
            else if (value >= 141 && value <= 160)
                pixels[count] = 150;
            else if (value >= 161 && value <= 180)
                pixels[count] = 170;
            else
                pixels[count] = 190;
        }

        System.out.print("Quantized pixels: ");
        for (int pixel : pixels) {
            System.out.print(pixel + " ");
        }
    }
}
