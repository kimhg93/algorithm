package baekjoon.solved.others.gold

import java.util.*

fun main() {
    val (_, k) = readLine()!!.split(" ").map { it.toInt() }
    val list = readLine()!!.split(" ").map { it.toLong() }
    val pq = PriorityQueue(list)

    var idx = 0
    var x = 0L
    while(idx < k){
        x = pq.poll()
        idx++
        for(i in list.indices){
            pq.offer(x * list[i])
            if(x % list[i] == 0L) break
        }
    }
    println(x)
}
/*
소수의 곱

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	15185	3655	2559	23.712%
문제
K개의 소수가 있다. 이때, 이 소수들 중에서 몇 개를 곱해서 얻게 되는 수들이 있을 것이다. 소수들을 선택할 때에는 같은 수를 선택해도 되며, 주어지는 소수 자체도 포함시키자.
예를 들어 세 소수가 2, 5, 7이었다면, 이러한 곱들을 오름차순으로 나타내 보면, 2, 4, 5, 7, 8, 10, 14, 16, 20, 25, 28, 32, 35, 등이 된다.
K개의 소수가 주어졌을 때, 이러한 소수의 곱들 중에서 N번째 수를 구해 보자. 단 정답은 231보다 작은 자연수이다.

입력
첫째 줄에 K(1 ≤ K ≤ 100), N(1 ≤ N ≤ 100,000)이 주어진다. 다음 줄에는 K개의 소수가 오름차순으로 주어진다.
같은 소수가 여러 번 주어지는 경우는 없으며, 주어지는 소수는 모두 541보다 작거나 같은 자연수이다.

출력
첫째 줄에 문제에서 설명한 대로 소수의 곱을 나열했을 때, N번째 오는 것을 출력한다.

예제 입력 1
4 19
2 3 5 7
예제 출력 1
27
출처
빠진 조건을 찾은 사람: djm03178
데이터를 추가한 사람: tiro25
알고리즘 분류
수학
자료 구조
정수론
우선순위 큐

 */