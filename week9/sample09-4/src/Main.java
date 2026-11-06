//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int START = 1;
    final int END = 100;
    int total = 0;


//****************************************************************
    for (int i = START; i <= END; i++) {
        if (i % 3 == 0 && i % 5 != 0) {

            continue;
        }
        total += i;
    }

    System.out.printf("%d + %d + ..... + %d + %d = %d\n",
            START, START + 1, END - 1, END, total);
 //****************************************************************

    total = 0;
    for (int i = START; i <= END; i++) {
        if (i % 3 == 0 && i % 5 != 0) {

            continue;
        }
        total += i;
    }

    System.out.printf("%d + %d + ..... + %d + %d = %d\n",
            START, START + 1, END - 1, END, total);

}
