public class OOPSBannerAppUC2 {

    public static void main(String[] args) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            // O
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == height - 1) && j > 0 && j < 4 ||
                    (j == 0 || j == 4) && i > 0 && i < height - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // O
            for (int j = 0; j < 5; j++) {
                if ((i == 0 || i == height - 1) && j > 0 && j < 4 ||
                    (j == 0 || j == 4) && i > 0 && i < height - 1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // P
            for (int j = 0; j < 5; j++) {
                if (j == 0 || (i == 0 && j < 4) || (i == height/2 && j < 4) ||
                    (j == 4 && i > 0 && i < height/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.print("  ");

            // S
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == height/2 || i == height - 1 ||
                    (j == 0 && i < height/2) ||
                    (j == 4 && i > height/2))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}   