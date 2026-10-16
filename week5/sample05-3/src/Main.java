//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int apple;
    int pear;
    final int APPLE = 500;
    final int PEAR = 600;
    int price;
    int payment;

    System.out.print("사과 구입 개수 : ");
    apple = keyboard.nextInt();
    System.out.print("배 구입 개수 : ");
    pear = keyboard.nextInt();
    System.out.print("지볼 금액 입력");
    payment = keyboard.nextInt();

    price = apple * APPLE + pear * PEAR;

    String result = payment >= price ? String.format("거스름돈 :%,d 원", payment - price) : "금액이 부족합니다";

    System.out.printf("구입 금액 :%,d 원\n", price);
    System.out.printf("지볼 금액 :%,d 원\n", payment);
    System.out.println(result);

}
