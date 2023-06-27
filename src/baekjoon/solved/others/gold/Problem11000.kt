package baekjoon.solved.others.gold

import java.util.*

fun main() {
    val n = readLine()!!.toInt()
    val arr: Array<IntArray> = Array(n) { readLine()!!.split(" ").map { it.toInt() }.toIntArray() }

    arr.sortBy { it[0] }

    val pq = PriorityQueue<Int>()
    pq.add(arr[0][1])

    repeat(n) {
        val start = arr[it][0]
        val end = arr[it][1]
        if (pq.peek() <= start) pq.poll()
        pq.add(end)
    }

    println(pq.size)
}

/*

8
1 8
9 16
3 7
8 10
10 14
5 6
6 11
11 12

5
1 7
2 3
3 4
4 8
7 10
*/

/*
강의실 배정

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	34898	10279	7531	28.848%
문제
수강신청의 마스터 김종혜 선생님에게 새로운 과제가 주어졌다.

김종혜 선생님한테는 Si에 시작해서 Ti에 끝나는 N개의 수업이 주어지는데, 최소의 강의실을 사용해서 모든 수업을 가능하게 해야 한다.

참고로, 수업이 끝난 직후에 다음 수업을 시작할 수 있다. (즉, Ti ≤ Sj 일 경우 i 수업과 j 수업은 같이 들을 수 있다.)

수강신청 대충한 게 찔리면, 선생님을 도와드리자!

입력
첫 번째 줄에 N이 주어진다. (1 ≤ N ≤ 200,000)

이후 N개의 줄에 Si, Ti가 주어진다. (0 ≤ Si < Ti ≤ 109)

출력
강의실의 개수를 출력하라.

예제 입력 1
3
1 3
2 4
3 5
예제 출력 1
2
출처
문제를 만든 사람: koosaga
데이터를 추가한 사람: zlzmsrhak
알고리즘 분류
자료 구조
그리디 알고리즘
정렬
우선순위 큐
 */