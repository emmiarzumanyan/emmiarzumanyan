//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    // int[] score;
    // score = new int[5];

    /* int a;
    int[] score = new int[5];
    score[0] = 95;
    score[1] = 70;
    score[2] = 80;
    score[3] = 75;
    score[4] = 100; */


    // int[] score = new int[] {95, 70, 80, 75, 100};

    int[] score = {95, 70, 80, 75, 100};
    int total = 0;
    float avg;

    for (int i = 0; i < score.length; i++)
        total += score[i];
    avg = (float) total / score.length;

    for (int i = 0; i < score.length; i++)
        System.out.printf("%d\n", score[i]);
    System.out.printf("총점 : %d\n", total);
    System.out.printf("평균 : %.2f\n", avg);

}
