package baekjoon.solved.others.gold

import java.util.*
import kotlin.collections.HashMap

fun main() {
    val (n, p, q) = readLine()!!.split(" ").map { it.toLong() }
    val d = HashMap<Long, Long>();
    d[0] = 1L

    val queue: Queue<Long> = LinkedList()
    queue.offer(n)

    while (!queue.isEmpty()) {
        val v = queue.poll()
        if (!d.containsKey(v)) {
            val x = v/p
            val y = v/q

            if (!d.containsKey(x) && !queue.contains(x)) queue.offer(x)
            if (!d.containsKey(y) && !queue.contains(y)) queue.offer(y)

            if (d[x] != null && d[y] != null) d[v] = d[x]!! + d[y]!!
            else queue.offer(v)
        }
    }

    println(d[n])
}

/*
무한 수열



시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초 	128 MB	9165	3532	2872	37.944%
문제

무한 수열 A는 다음과 같다.

    A0 = 1
    Ai = A⌊i/P⌋ + A⌊i/Q⌋ (i ≥ 1)

a1 = a0 + a0 = 2
a2 = a1 + a0 = 3
a3 = a1 + a1 = 4
a4 = a2 + a1 = 5
a5 = a2 + a1 = 5
a6 = a3 + a2 = 7
a7 = a3 + a2 = 7
a12 = a6 + a4 = 12


a300 = a150 + a100
a150 = a75 + a50 / a100 = a50 + a33
a75 =


N, P와 Q가 주어질 때, AN을 구하는 프로그램을 작성하시오.

입력
첫째 줄에 3개의 정수 N, P, Q가 주어진다.

출력
첫째 줄에 AN을 출력한다.

제한
0 ≤ N ≤ 1012
2 ≤ P, Q ≤ 109

예제 입력 1
7 2 3

예제 출력 1
7

예제 입력 2
0 2 3

예제 출력 2
1

예제 입력 3
10000000 3 3

예제 출력 3
32768

예제 입력 4
256 2 4

예제 출력 4
89

예제 입력 5
1 1000000 1000000

예제 출력 5
2

힌트
⌊x⌋는 x를 넘지 않는 가장 큰 정수이다.

출처
문제를 번역한 사람: baekjoon
문제의 오타를 찾은 사람: jh05013

알고리즘 분류
다이나믹 프로그래밍
자료 구조
해시를 사용한 집합과 맵


 */