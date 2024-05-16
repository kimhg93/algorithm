package baekjoon.solved.others.gold

fun main() {
    val n = readLine()!!.toInt()
    val sum = LongArray(1000001)
    val arr = LongArray(1000001)
    val sb = StringBuilder()

    for(i in 1 until arr.size) {
        var j = i
        while(j < arr.size){
            arr[j] = arr[j] + i
            j += i
        }
    }

    sum[1] = 1
    for(i in 2 until sum.size) {
        sum[i] = sum[i-1] + arr[i]
    }

    repeat(n) {
        sb.append(sum[readLine()!!.toInt()]).append("\n")
    }

    println(sb)
}



/*
약수의 합

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초 (추가 시간 없음)	512 MB	18772	4566	3372	25.138%
문제
두 자연수 A와 B가 있을 때, A = BC를 만족하는 자연수 C를 A의 약수라고 한다.
예를 들어, 2의 약수는 1, 2가 있고, 24의 약수는 1, 2, 3, 4, 6, 8, 12, 24가 있다.
자연수 A의 약수의 합은 A의 모든 약수를 더한 값이고, f(A)로 표현한다. x보다 작거나 같은 모든 자연수 y의 f(y)값을 더한 값은 g(x)로 표현한다.

자연수 N이 주어졌을 때, g(N)을 구해보자.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 100,000)가 주어진다. 둘째 줄부터 테스트 케이스가 한 줄에 하나씩 주어지며 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

출력
각각의 테스트 케이스마다, 한 줄에 하나씩 g(N)를 출력한다.

예제 입력 1
5
1
2
10
70
10000
예제 출력 1
1
4
87
4065
82256014
출처
문제를 만든 사람: baekjoon
알고리즘 분류
수학
정수론
누적 합
소수 판정
에라토스테네스의 체
 */