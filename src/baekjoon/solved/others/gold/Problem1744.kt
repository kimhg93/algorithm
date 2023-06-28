package baekjoon.solved.others.gold

import java.lang.Integer.max
import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val n = readLine()!!.toInt()
    val mpq = PriorityQueue<Int>()
    val ppq = PriorityQueue<Int>(Collections.reverseOrder())
    val remain = PriorityQueue<Int>()
    val result: MutableList<Int> = ArrayList()

    repeat(n){
        val num = readLine()!!.toInt()
        if(num == 0) remain.offer(num)
        else if(num < 0) mpq.offer(num)
        else ppq.offer(num)
    }

    while(!ppq.isEmpty()){
        if(ppq.size > 1){
            val num1 = ppq.poll()
            val num2 = ppq.poll()
            result.add(max(num1*num2, num1+num2))
        } else result.add(ppq.poll())
    }

    while(!mpq.isEmpty()){
        if(mpq.size > 1){
            val num1 = mpq.poll()
            val num2 = mpq.poll()
            result.add(num1*num2)
        } else remain.offer(mpq.poll())
    }

    while(!remain.isEmpty()){
        if(remain.size > 1){
            result.add(remain.poll()*remain.poll())
        } else result.add(remain.poll())
    }

    println(result.sum())
}
/*
수 묶기

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	32483	10436	8373	31.416%
문제
길이가 N인 수열이 주어졌을 때, 그 수열의 합을 구하려고 한다. 하지만, 그냥 그 수열의 합을 모두 더해서 구하는 것이 아니라, 수열의 두 수를 묶으려고 한다.
어떤 수를 묶으려고 할 때, 위치에 상관없이 묶을 수 있다. 하지만, 같은 위치에 있는 수(자기 자신)를 묶는 것은 불가능하다.
그리고 어떤 수를 묶게 되면, 수열의 합을 구할 때 묶은 수는 서로 곱한 후에 더한다.
예를 들면, 어떤 수열이 {0, 1, 2, 4, 3, 5}일 때, 그냥 이 수열의 합을 구하면 0+1+2+4+3+5 = 15이다.
하지만, 2와 3을 묶고, 4와 5를 묶게 되면, 0+1+(2*3)+(4*5) = 27이 되어 최대가 된다.
수열의 모든 수는 단 한번만 묶거나, 아니면 묶지 않아야한다.
수열이 주어졌을 때, 수열의 각 수를 적절히 묶었을 때, 그 합이 최대가 되게 하는 프로그램을 작성하시오.

입력
첫째 줄에 수열의 크기 N이 주어진다. N은 50보다 작은 자연수이다. 둘째 줄부터 N개의 줄에 수열의 각 수가 주어진다.
수열의 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.

출력
수를 합이 최대가 나오게 묶었을 때 합을 출력한다. 정답은 항상 231보다 작다.

예제 입력 1
4
-1
2
1
3
예제 출력 1
6
예제 입력 2
6
0
1
2
4
3
5
예제 출력 2
27
예제 입력 3
1
-1
예제 출력 3
-1
예제 입력 4
3
-1
0
1
예제 출력 4
1
예제 입력 5
2
1
1
예제 출력 5
2
출처
문제의 오타를 찾은 사람: acka, bupjae, jwvg0425, rainshot, silvercube, tncks0121
문제를 번역한 사람: baekjoon
데이터를 추가한 사람: godnes628
알고리즘 분류
그리디 알고리즘
정렬
많은 조건 분기
 */