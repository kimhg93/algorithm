package baekjoon.solved.others.gold

import java.lang.Integer.max
import java.util.*

fun main() {
    val list: MutableList<Pair<Int, Int>> = ArrayList()

    var last = 0
    repeat(readLine()!!.toInt()) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        val pair: Pair<Int, Int> = Pair(x, y)
        list.add(pair)
        last = max(last, x)
    }

    list.sortBy { -it.second }
    val arr = IntArray(last)

    for (i in 0 until list.size) {
        for (j in list[i].first - 1 downTo 0) {
            if (arr[j] == 0) {
                arr[j] = list[i].second
                break
            }
        }
    }

    println(arr.sum())

}

/*
과제

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	9027	4722	3742	52.512%
문제
웅찬이는 과제가 많다. 하루에 한 과제를 끝낼 수 있는데, 과제마다 마감일이 있으므로 모든 과제를 끝내지 못할 수도 있다.
과제마다 끝냈을 때 얻을 수 있는 점수가 있는데, 마감일이 지난 과제는 점수를 받을 수 없다.
웅찬이는 가장 점수를 많이 받을 수 있도록 과제를 수행하고 싶다. 웅찬이를 도와 얻을 수 있는 점수의 최댓값을 구하시오.

입력
첫 줄에 정수 N (1 ≤ N ≤ 1,000)이 주어진다.
다음 줄부터 N개의 줄에는 각각 두 정수 d (1 ≤ d ≤ 1,000)와 w (1 ≤ w ≤ 100)가 주어진다. d는 과제 마감일까지 남은 일수를 의미하며, w는 과제의 점수를 의미한다.

출력
얻을 수 있는 점수의 최댓값을 출력한다.

예제 입력 1
7
4 60
4 40
1 20
2 50
3 30
4 10
6 5
예제 출력 1
185
힌트
예제에서 다섯 번째, 네 번째, 두 번째, 첫 번째, 일곱 번째 과제 순으로 수행하고, 세 번째, 여섯 번째 과제를 포기하면 185점을 얻을 수 있다.

input
5
3 1
3 2
3 3
2 10
1 10

ans
23  (첫째 날에 (1, 10), 둘째 날에 (2, 20), 셋째 날에 (3, 3))

wrong output
21


제가 틀렸었던 반례가 있어서 도움이 될까해서 올립니다.

4
9 9
9 9
9 9
1 10

답 : 37


7
4 100
2 10
1 20
2 50
5 99
5 99
5 99

output : 397
answer : 447

입력 :

4
5 100
2 2
2 2
2 2

출력 : 106
정답: 104

출처
University > 서강대학교 > 2016 Sogang Programming Contest > Champion E번

University > 서강대학교 > 2016 Sogang Programming Contest > Master E번

문제를 만든 사람: Telcontar
알고리즘 분류
자료 구조
그리디 알고리즘
정렬
우선순위 큐
 */