//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    double PI = 3.141592;
    int radius; //원의 반지름
    double area;



    System.out.print("원의 반지름 입력 (정수형) ? ");
    radius = keyboard.nextInt();

    area = PI * radius * radius;

    System.out.printf("원의 반지름 : %,d Cm, 면적 : %,.2f \u33A0\n", radius, area);


}
