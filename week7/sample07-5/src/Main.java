//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    int salary;
    int tax;
    String massege;

    System.out.print("당신의 급여액 입력 : ");
    salary = keyboard.nextInt();

    if (salary >= 0 && salary <= 30000000) {
        if (salary < 2000000){
            tax = 0;
        }else if (salary <= 4000000){
            tax = (int) ((salary - 2000000) * (10.0f / 100));
        }else if (salary <= 6000000) {
            tax = (int) ((salary - 2000000) * (8.0f / 100));
        } else if (salary <= 2000000) {
            tax = (int) ((salary - 2000000) * (6.0f / 100));
        }else {
            tax = (int) ((salary - 2000000) * (5.0f / 100));
        }
        massege = String.format("급여액 %,d원 세금은 %,d원 입니다",salary, tax);
    }else {
        massege = "ERROR : 급여액은 ) ~ 30,000,000 사이임";
    }

    System.out.println(massege);
}
