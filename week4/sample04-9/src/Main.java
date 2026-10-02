//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int height;
    float area;

    System.out.print("삼각형의 밑변은 ?");
    base = keyboard.nextInt();
    System.out.print("삼각형의 높이는 ?");
    height = keyboard.nextInt();
    System.out.print("삼각형의 넓이는 ?");
    area = keyboard.nextInt();


    System.out.printf("\n\t**** 삼각형의넓이구하기****\n");
    System.out.printf("\t\t밑변:  %d Cm\n", base);
    System.out.printf("\t\t높이:  %d Cm\n", height);
    System.out.printf("\n\t\t넓이:  %.2f \u33a0\n", area);


}
