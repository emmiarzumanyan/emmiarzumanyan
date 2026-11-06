//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final int LINE = 10;
    final int STAR = 23;
    System.out.println("****************");
    System.out.println("****************");
    System.out.println("****************");
    System.out.println("****************");
    System.out.println("****************");
    System.out.println();


    for (int i = 0; i < LINE; i++) {
        System.out.println("****************");
    }
    System.out.println();

    for (int i = 0; i < LINE; i++) {
        int j =0;
        while (j < STAR) {
            System.out.print("*");
            j++;
        }
        System.out.println();
    }
}
