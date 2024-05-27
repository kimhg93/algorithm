package baekjoon.solved.others.gold

import kotlin.math.sqrt


fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val arr = BooleanArray(m + 1){ true }
    val sb = StringBuilder()

    arr[0] = false
    arr[1] = false
    for(i in 2..sqrt(m.toDouble()).toInt()) {
        if(arr[i]) {
            for (j in i*i..m step i) {
                arr[j] = false
            }
        }
    }

    for (i in n..m) {
        if (arr[i] && pal(i.toString())) sb.append(i).append("\n")
    }

    sb.append(-1)
    println(sb)
}

fun pal(str: String): Boolean {
    var head = 0
    var rear = str.length-1
    while(head < rear){
        if(str[head] == str[rear]){
            head++
            rear--
        } else return false
    }
    return true
}

/*
소수인팰린드롬

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	8868	2075	1422	22.313%
문제
151은 소수이면서 동시에 팰린드롬이기 때문에 소수인 팰린드롬이다. 팰린드롬이란 앞으로 읽어나 뒤로 읽으나 같은 수를 말한다.
예를 들어 1234는 앞으로 읽으면 1234지만, 뒤로 읽으면 4321이 되고 이 두 수가 다르기 때문에 팰린드롬이 아니다.
두 정수 a, b가 주어졌을 때, a이상 b이하인 소수인 팰린드롬을 모두 구하는 프로그램을 작성하시오.

입력
입력은 첫째 줄에 공백으로 구분된 두 자연수 a, b가 주어진다. 단 5 ≤ a < b ≤ 100,000,000 이다.

출력
첫째 줄부터 차례로 증가하는 순서대로 한 줄에 한개씩 소수인 팰린드롬을 출력한다. 마지막 줄에는 -1을 출력한다.

예제 입력 1
5 550
예제 출력 1
5
7
11
101
131
151
181
191
313
353
373
383
-1
알고리즘 분류
수학
정수론
소수 판정
에라토스테네스의 체

 */