package baekjoon.solved.others.gold

import java.util.*

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }

    val cnt = IntArray(n + 1)
    val arr = Array(n + 1) { HashSet<Int>() }
    val pq = PriorityQueue<Int>()

    repeat(m) {
        val (x, y) = readLine()!!.split(" ").map { it.toInt() }
        arr[x].add(y)
        cnt[y]++
    }

    for (i in 1..n) {
        if(cnt[i] == 0) pq.offer(i)
    }

    val sb = StringBuilder()

    while (!pq.isEmpty()) {
        val v = pq.poll()
        sb.append(v).append(" ")
        arr[v].stream().forEach{
            cnt[it]--
            if(cnt[it] == 0) pq.offer(it)
        }
    }

    println(sb)
}


/*
줄 세우기 스페셜 저지

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초 	128 MB	41017	23995	15939	56.826%
문제

N명의 학생들을 키 순서대로 줄을 세우려고 한다. 각 학생의 키를 직접 재서 정렬하면 간단하겠지만, 마땅한 방법이 없어서 두 학생의 키를 비교하는 방법을 사용하기로 하였다.
그나마도 모든 학생들을 다 비교해 본 것이 아니고, 일부 학생들의 키만을 비교해 보았다.

일부 학생들의 키를 비교한 결과가 주어졌을 때, 줄을 세우는 프로그램을 작성하시오.

입력
첫째 줄에 N(1 ≤ N ≤ 32,000), M(1 ≤ M ≤ 100,000)이 주어진다. M은 키를 비교한 회수이다.
다음 M개의 줄에는 키를 비교한 두 학생의 번호 A, B가 주어진다.
이는 학생 A가 학생 B의 앞에 서야 한다는 의미이다.
학생들의 번호는 1번부터 N번이다.

출력
첫째 줄에 학생들을 앞에서부터 줄을 세운 결과를 출력한다. 답이 여러 가지인 경우에는 아무거나 출력한다.

예제 입력 1
3 2
1 3
2 3

예제 출력 1
1 2 3

예제 입력 2
4 2
4 2
3 1

예제 출력 2
4 2 3 1

출처
빠진 조건을 찾은 사람: indioindio
데이터를 추가한 사람: lhs456852, wlstn6278

알고리즘 분류

그래프 이론
위상 정렬



 */