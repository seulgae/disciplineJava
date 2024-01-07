package DisciplineJava_01;

public class ex_03 {
    public static void main(String[] args) {
/*
    3, 4, 5, 6,
    5, 5, 4, 1,
    2, 3, 4, 7,
    4, 1, 0, 9,
    6, 10, 6, 8
*/

    // Q1. 위의 모양과 같은 배열을 만들어 보세요.
    // 1) 모든 값의 합과 평균을 구하고 출력해보세요. (for문, if문만 사용해서 풀어보기)
        int arr[][] = {{3, 4, 5, 6},
                       {5, 5, 4, 1},
                       {2, 3, 4, 7},
                       {4, 1, 0, 9},
                       {6, 10, 6, 8}};
        int sum = 0; // 합계
        int cnt = 0; // 배열의 갯수를 구할 카운트 변수
        double avg = 0.0; // 평균

        // 합
        for (int i = 0; i < arr.length; i++){
            for (int y = 0; y < arr.length -1; y++){
                sum += arr[i][y];
                cnt++;
                System.out.println("배열 인덱스 : "+ "arr[" + i + "]" + "[" + y +"]" + ", 배열의 합 : " + sum + ", 배열의 갯수 : " + cnt);
            }
            if(cnt == 20){
                // 평균
                avg = (double) sum / cnt;
                System.out.println("평균 : " + avg);
            }
        }

    // 2) 배열에서 최대값과 최소값을 출력해보세요.(for문, if문만 사용해서 풀어보기)

        int min = 0;
        int max = 0;
        int k = 0;
        int j = 0;
        int z = 0;
        int c = 0;

        for (int i = 0; i < arr.length; i++){
            for (int y = 0; y < arr.length -1; y++){
                if (arr[i][y] > max) { // 최대값
                    k = i;
                    j = y;
                    max = arr[i][y];
                }
                if (arr[i][y] <= min) { // 최소값
                    z = i;
                    c = y;
                    min = arr[i][y];
                }
            }
            // 3) 최대값과 최소값의 자리를 서로 바꿔 보세요.
            if(i == 4){
                arr[k][j] = min;
                arr[z][c] = max;
            }
        }

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

        System.out.println("=============검증==============");
        for (int i = 0; i < arr.length; i++){
            System.out.print("[");
            for (int y = 0; y < arr.length -1; y++){
                if(y != 3){
                    System.out.print(arr[i][y] + ", ");
                } else {
                    System.out.print(arr[i][y]);
                }
            }
            System.out.println("]");
        }


    // Q2. 2*13 모양의 빈 문자형 배열을 만들어 보세요. (for문, if문만 사용해서 풀어보기)
    // 1) 메모리에 배치된 순서에 따라 알파벳 'a'부터 'z'까지 순서대로 할당해 보세요.
        char[][] az = new char[2][13];

        System.out.println("==== 메모리에 배치된 순서에 따라 알파벳 출력 ====");
        for(int i = 0; i < az.length; i++){
            System.out.print("[");
            for (int y = 0; y < 13; y++){
                if(i == 0){
                    az[i][y] = 'a';
                    if(y != 12){
                        az[i][y] += y;
                        System.out.print(az[i][y] + ",");
                    } else{
                        az[i][y] += y;
                        System.out.print(az[i][y]);
                    }
                } else {
                    az[i][y] = az[0][12];
                    if(y != 12){
                        az[i][y] += y;
                        System.out.print(az[i][y] + ",");
                    } else{
                        az[i][y] += y;
                        System.out.print(az[i][y]);
                    }
                }
            }
            System.out.println("]");
        }
    }
}
