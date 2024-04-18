package baekjoon.solved.others.silver

import kotlin.math.pow

fun main() {
    val n = readLine()!!.toInt()
    var pair: Pair<Long, Long> = Pair(0, 0)
    repeat(n){
        pair = if(it == 0) Pair(0, 2)
        else Pair(pair.second, (pair.second*3) % (10.0.pow(9)+9).toInt())
    }
    println(pair.first)
}


/*
걷다보니 신천역 삼 (Small)
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	256 MB	1928	1398	1209	75.374%
문제
욱제는 ‘삼’이란 음절을 참 좋아한다. 인삼, 홍삼, 해삼, 삼성, 이춘삼(李春森), 삼식이, 삼시세끼, ㄴㄴ 그거 안 삼, 삼과 죽음, 알았삼, 금강삼도 식후경, 걷다보니 신천역 삼, 그리고 특히 일이삼을 좋아한다. 그래서 욱제는 3을 가지고 놀아보기로 했삼.

3개 숫자(0, 1, 2)만 가지고 N자리 3의 배수를 만들어 보삼. 만드는 배수는 자연수 이삼. 0으로 시작하는 수는 만들 수 없는 수 이삼. 3의 배수가 몇 개나 나올 수 있삼?

입력
N을 입력 받으삼. (1 ≤ N ≤ 9)

출력
0, 1, 2만 가지고 만들 수 있는 N자리 3의 배수의 개수를 출력하삼.

예제 입력 1
1
예제 출력 1
0
예제 입력 2
3
예제 출력 2
6

 */