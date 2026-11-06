//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final int SIZE = 5;
    Scanner keyboard = new Scanner(System.in);
    char answer;
    String result;

    for (int i = 1; i <= SIZE; i++) {

        System.out.printf("%d번 학생 출석했나요 (YES/NO) ? ",i);
        answer = keyboard.next().charAt(0);

         if(answer == 'Y' || answer == 'y') {
            result = "출석";
        }else{
            result = "결석";
        }
        System.out.printf("%d번 학생 -> %s\n",i, result);
    }

    // while
    int j = 1;
    while (j <= SIZE) {
        System.out.printf("%d번 학생 출석했나요 (YES/NO) ? ",j);
        answer = keyboard.next().charAt(0);

       /* if(answer == 'Y' || answer == 'y') {
            result = "출석";
        }else{
            result = "결석";
        } */
        result = (answer =='Y' || answer == 'y') ? "출석" : "결석";
        System.out.printf("%d번 학생 -> %s\n",j++, result);

    }
    // j++

    // do ~ while()

    int k = 1;
    do {
            System.out.printf("%d번 학생 출석했나요 (YES/NO) ? ",k);
            answer = keyboard.next().charAt(0);

            if(answer == 'Y' || answer == 'y') {
                result = "출석";
            }else{
                result = "결석";
            }
            System.out.printf("%d번 학생 -> %s\n",k++, result);
        } while (k <= SIZE);


}
