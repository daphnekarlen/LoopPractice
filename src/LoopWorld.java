public class LoopWorld {

    public static void main(String[] args) {
        LoopWorld loops = new LoopWorld();
    }

    public LoopWorld() {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
        pattern9();
        pattern10();
        pattern11();
    }

    public void pattern1() {
        System.out.println("**** Pattern 1:");
        for (int i = 0; i < 25; i = i + 5) {
            System.out.println(i);
        }

    }

    public void pattern2() {
        System.out.println("**** Pattern 2:");
        for (int x = 2; x < 28; x = x + 5) {
            System.out.println(x);
        }
    }

    public void pattern3() {
        System.out.println("**** Pattern 3:");
        for (int y = 21; y > 0; y = y - 4) {
            System.out.print(y + "  ");
        }
    }

    public void pattern4() {
        System.out.println("**** Pattern 4:");
        for (int p = 1; p < 7; p = p + 1) {
            System.out.print(p * p + "  ");
        }
        System.out.println();
    }

    public void pattern5() {
        System.out.println("**** Pattern 5:");
        for (int row = 0; row < 4; row++) {
            for (int m = 1; m < 5; m = m + 1) {
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }

    public void pattern6() {
        System.out.println("**** Pattern 6:");
        for (int line = 1; line < 6; line++) {
            for (int s = 0; s < line - 1; s++) {
                System.out.print(" ");
            }
            System.out.println(line);
        }
    }

    public void pattern7() {
        System.out.println("**** Pattern 7:");
//        for(int g=1; g<=5; g++){
//            for(int y=0; y<g; y++){
//                System.out.print(" "+ g);
//            }
//            System.out.println();
//        }

        for (int g = 1; g <= 5; g++) {
            for (int y = 0; y < 6 - g; y++) {
                System.out.print(" " + g);
            }
            System.out.println();
        }

    }

    public void pattern8() {
        System.out.println("**** Pattern 8:");
        for (int f = 1; f <= 5; f++) {
            for (int y = 1; y < f; y++) {
                System.out.print("  ");
            }
            for (int s = 0; s < 6 - f; s++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern9(){
        System.out.println("**** Pattern 9:");
        for(int w=1; w<=6; w++){
            for(int q=1;q<w; q++ ) {
                System.out.print(q);
            }
            System.out.println();
        }
    }

    public void pattern10(){
        System.out.println("**** Pattern 10:");
        for(int w=1; w<=5; w++){
            for(int q=0;q<w; q++ ) {
                System.out.print(w);
            }
            System.out.println();
        }
    }
    public void pattern11(){
        System.out.println("**** Pattern 11:");
        for(int w=1; w<=10; w++){
            for(int q=1;q<w; q++ ) {
                System.out.print(q);
            }
//            for(int d=0; d<5; d++){
//                System.out.print();
//            }
            System.out.println();
        }
    }
}
