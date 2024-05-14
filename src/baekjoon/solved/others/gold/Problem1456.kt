package baekjoon.solved.others.gold

import kotlin.math.min
import kotlin.math.sqrt

fun main() {
    val (a: Long, b: Long) = readLine()!!.split(" ").map { it.toLong() }
    val s = System.currentTimeMillis()
    val max = min(10000000.0, sqrt(b.toDouble()) * 2).toInt()
    val arr = IntArray(max + 1){-1}
    arr[1] = 0
    var cnt = 0

    for(i in 2..max) {
        var j = i

        if (j == i && arr[j] == -1) {
            var n: Long = j.toLong()
            while(n < b / i){
                try {
                    n = Math.multiplyExact(n, j)
                } catch (e: ArithmeticException) {
                    break
                }
                if(n in a..b) cnt++
            }
        }

        while (j <= max) {
            if (j == i && arr[j] == -1) arr[j] = 1
            else if(arr[j] < 1) arr[j] = 0
            j += i
        }

    }
    val e = System.currentTimeMillis()
    System.err.println((e - s).toString() + "ms")

    println(cnt)
}



/*
거의 소수

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	256 MB	15732	3952	2691	23.997%
문제
어떤 수가 소수의 N제곱(N ≥ 2) 꼴일 때, 그 수를 거의 소수라고 한다.

두 정수 A와 B가 주어지면, A보다 크거나 같고, B보다 작거나 같은 거의 소수가 몇 개인지 출력한다.

입력
첫째 줄에 왼쪽 범위 A와 오른쪽 범위 B가 공백 한 칸을 사이에 두고 주어진다.

출력
첫째 줄에 총 몇 개가 있는지 출력한다.

제한
1 ≤ A ≤ B ≤ 1014
예제 입력 1
1 1000
예제 출력 1
25
예제 입력 2
1 10
예제 출력 2
3
예제 입력 3
5324 894739
예제 출력 3
183
출처
문제를 번역한 사람: baekjoon
빠진 조건을 찾은 사람: dlwodnsdl
알고리즘 분류
수학
정수론
소수 판정
에라토스테네스의 체
 */