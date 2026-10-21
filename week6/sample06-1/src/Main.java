//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final int HEART = 65;
    int age;

    System.out.print("당시느은 몇년동안 살았나요 ? ");
    age = keyboard.nextInt();

    int day = age * 365;
    int hour = day * 24;
    int minute = hour * 60;

    long count = (long) (minute) * HEART;

    System.out.printf("사람은 핑균 분당 %d회 심장이 박동한다.\n", HEART);
    System.out.printf("심장은 %d년동안 %,d회 박동한다.\n", age, count);

}
