//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner keyboard = new Scanner(System.in);
    final float DON = 3.75f;  //1돈은 3.75g
    final int GOLD = 910000;
    float weight;
    float don;

    System.out.print("당신의 채중은 ? ");
    weight = keyboard.nextFloat();  // 단위 : 45.7 45 Kg 0.7

   /* int intweight = (int) weight;
    float reminder = weight - intweight;
    int gram = (int) (intweight * 1000 + reminder * 1000); */

    int gram = (int) (weight * 1000);
    don = gram / DON;
    long price = (long)(don * GOLD);
    price /= 1000;
    price *= 1000;

    System.out.printf("%.2f Kg -> %,d g\n", weight, gram);
    System.out.printf("%.2f Kg -> %,2f 돈\n", weight, don);
    System.out.printf("%.2f Kg -> %,d 원\n", weight, price);



}
