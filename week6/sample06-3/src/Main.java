//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    final int radius = 6378;
    final float PI = 3.1415926f;
    final int KOREA = 100505;

    double surface = 4 * PI * radius * radius;

    double ratio = KOREA / surface;
    System.out.printf("지구의 표면적은 %,.0f Km²\n", ratio);
    System.out.printf("대한민국 영토 %,d Km²는 지구의 %f %% 입니다\n",KOREA, ratio);


}
