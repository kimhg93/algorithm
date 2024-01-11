package baekjoon.solved.others.silver

import java.lang.StringBuilder

fun main() {
    val n = readLine()!!.toInt()
    val m = readLine()!!.toInt()
    val arr: Array<IntArray> = Array(n){ IntArray(n) }

    var x = n/2
    var y = n/2
    var dir = 0
    var cnt = 1
    var num = 1
    arr[x][y] = num++

    var posX = x+1
    var posY = y+1

    while(true){
        if(cnt > n) break

        for(i in 1..cnt){
            if(dir == 0) x--
            else if(dir == 1) y++
            else if(dir == 2) x++
            else if(dir == 3) y--

            if(x < 0 || x > n || y < 0 || y > n) break
            arr[x][y] = num++

            if(arr[x][y] == m){
                posX = x+1
                posY = y+1
            }
        }
        dir++
        if(dir == 2) cnt++
        else if(dir == 4) {
            dir = 0
            cnt++
        }
    }
    val sb = StringBuilder()

    repeat(n){
        sb.append(arr[it].contentToString().replace(",", "")
                .replace("[", "")
                .replace("]", "")).append("\n")
    }
    print(sb)
    print("$posX $posY")

}
/*
3 > (2, 2)
5 > (3, 3)
7 > (4, 4)


달팽이

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	17173	7339	5496	45.750%
문제
홀수인 자연수 N이 주어지면, 다음과 같이 1부터 N2까지의 자연수를 달팽이 모양으로 N×N의 표에 채울 수 있다.

9	2	3
8	1	4
7	6	5

25	10	11	12	13
24	9	2	3	14
23	8	1	4	15
22	7	6	5	16
21	20	19	18	17

N이 주어졌을 때, 이러한 표를 출력하는 프로그램을 작성하시오. 또한 N2 이하의 자연수가 하나 주어졌을 때, 그 좌표도 함께 출력하시오.
예를 들어 N=5인 경우 6의 좌표는 (4,3)이다.

입력
첫째 줄에 홀수인 자연수 N(3 ≤ N ≤ 999)이 주어진다. 둘째 줄에는 위치를 찾고자 하는 N2 이하의 자연수가 하나 주어진다.

출력
N개의 줄에 걸쳐 표를 출력한다. 각 줄에 N개의 자연수를 한 칸씩 띄어서 출력하면 되며, 자릿수를 맞출 필요가 없다.
N+1번째 줄에는 입력받은 자연수의 좌표를 나타내는 두 정수를 한 칸 띄어서 출력한다.

예제 입력 1
7
35 t 1
   r 1
   b 2
   l 2

   t 3
   r 3
   b 4
   l 4

   t 5
   r 5
   b 6
   l 6

   ....
예제 출력 1
49 26 27 28 29 30 31
48 25 10 11 12 13 32
47 24  9  2  3 14 33
46 23  8  1  4 15 34
45 22  7  6  5 16 35
44 21 20 19 18 17 36
43 42 41 40 39 38 37
5 7
출처
문제를 만든 사람: author5
데이터를 추가한 사람: inbdni
알고리즘 분류
구현
채점 및 기타 정보
이 문제의 채점 우선 순위는 2이다.

 */