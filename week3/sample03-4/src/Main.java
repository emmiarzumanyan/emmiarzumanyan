//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int base;
    int rectagular_area;
    double radius;
    double circle_area;
    final double PI = 3.14;
    double area;

    System.out.print("정사격형의 한변의 입력(예 5 : ");
    base = keyboard.nextInt();

    rectagular_area = base * base;
    radius = base / 2.0;
    circle_area = PI * radius * radius;
    area = rectagular_area - circle_area;

    System.out.printf("한변의 길이가 %,d Cm인 정사각형의 면적 = %,d \u33A0\n", base, rectagular_area);
    System.out.printf("이 정사형 내부 원의 반지름 : %.2f Cm, 면적 : %,.2f", radius, circle_area);
    System.out.printf("구하려는 면적 :%,.2f\u33a0\n", area);


}
