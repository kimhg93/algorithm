package baekjoon.solved.others.gold

import kotlin.math.pow

fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toLong() }
    println(count(m) - count(n-1))
}

fun count(n: Long): Long{
    var idx = 0
    var result: Long = 0
    while (2.0.pow(idx).toLong() <= n) {
        val one: Long = 2.0.pow(idx).toLong()

        val divide: Long = n / (one * 2)
        val remain: Long = n % (one * 2)

        result += divide * one
        if (remain >= one) result += (remain - one) + 1

        idx++
    }
    return result
}
/*
1의 개수 세기 실패다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	6139	2325	1834	42.035%
문제
두 자연수 A, B가 주어졌을 때, A ≤ x ≤ B를 만족하는 모든 x에 대해 x를 이진수로 표현했을 때 1의 개수의 합을 구하는 프로그램을 작성하시오.


입력
첫 줄에 두 자연수 A, B가 주어진다. (1 ≤ A ≤ B ≤ 10^16)

출력
1의 개수를 세어 출력한다.

예제 입력 1
2 12
예제 출력 1
21
출처
ICPC > Regionals > Latin America > Latin America Regional Contests 2013 C번

문제를 번역한 사람: myungwoo
문제를 만든 사람: Ray Williams Robinson Valiente
알고리즘 분류
수학
누적 합
비트마스킹
 */