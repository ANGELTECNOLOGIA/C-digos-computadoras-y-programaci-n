public class j {
    public static void main(String[] args) {
    int altura = 3;


        for (int i = 1; i <= altura; i++) { // Abre for
            for (int j = 1; j <= i; j++)
                System.out.print("*");

            for (int k = i + 1; k <= altura; k++)
                System.out.print(" ");

            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            for (int l = 1; l <= altura + 1 - i; l++)
                System.out.print("*");

            for (int m = altura - 1 - i; m <= altura; m++)
                System.out.print(" ");

            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            for (int n = 1; n < i; n++)
                System.out.print(" ");

            for (int p = i; p <= altura; p++)
                System.out.print("*");

            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");
            System.out.print(" ");

            for (int q = 1; q <= altura - i; q++)
                System.out.print(" ");

            for (int r = altura - i; r < altura; r++)
                System.out.print("*");

            System.out.println();
        } // Cierra for

        System.out.println("\n");
    }
}
