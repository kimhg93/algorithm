package baekjoon.solved.others.gold

import kotlin.math.pow

fun main() {
    val n = readLine()!!.toInt()
    val list: MutableList<Int> = ArrayList()
    repeat(n){
        list.add(readLine()!!.toInt())
    }

    val l : MutableList<String> = ArrayList()
    l.add("1")

    var idx = 0
    for(i in 1..9){
        for(j in 1..(3.0.pow(i-2).toInt())){
            val str = l[idx++]
            l.add("$str+$i")
            l.add("$str-$i")
            l.add("$str $i")
        }
    }

    val result: MutableList<String> = ArrayList()

    for(i in 0 until l.size){
        val str = l[i]
        val num = try {
            str.replace(" ", "").toInt()
        } catch(e: Exception){
            cal(str)
        }
        if(num == 0) result.add(str)
    }

    result.sort()

    for(i in 0 until list.size){
        for(j in 0 until result.size){
            if(result[j].last().toString() == list[i].toString()) println(result[j])
        }
        println()
    }

}

fun cal(s: String): Int {
    var a = 0
    var sum = 0
    var bf = '+'
    for(c in s.replace(" ", "")){
        if(c == '+' || c == '-'){
            sum = if(bf == '+') sum+a else sum-a
            bf = c
            a = 0
        } else a = (a.toString()+ c.toString()).toInt()
    }
    sum = if(bf == '+') sum+a else sum-a

    return sum
}

/*
0 만들기 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	7882	3883	2910	48.403%
문제
1부터 N까지의 수를 오름차순으로 쓴 수열 1 2 3 ... N을 생각하자.
그리고 '+'나 '-', 또는 ' '(공백)을 숫자 사이에 삽입하자(+는 더하기, -는 빼기, 공백은 숫자를 이어 붙이는 것을 뜻한다).
이렇게 만든 수식의 값을 계산하고 그 결과가 0이 될 수 있는지를 살피자.
N이 주어졌을 때 수식의 결과가 0이 되는 모든 수식을 찾는 프로그램을 작성하라.

입력
첫 번째 줄에 테스트 케이스의 개수가 주어진다(<10).
각 테스트 케이스엔 자연수 N이 주어진다(3 <= N <= 9).

출력
각 테스트 케이스에 대해 ASCII 순서에 따라 결과가 0이 되는 모든 수식을 출력한다. 각 테스트 케이스의 결과는 한 줄을 띄워 구분한다.

예제 입력 1
2
3
7
예제 출력 1
1+2-3

1+2-3+4-5-6+7
1+2-3-4+5+6-7
1-2 3+4+5+6+7
1-2 3-4 5+6 7
1-2+3+4-5+6-7
1-2-3-4-5+6+7
출처
ICPC > Regionals > Europe > Southeastern European Regional Contest > All-Ukrainian Collegiate Programming Contest > AUCPC Semi-Final 2010 J번

문제를 번역한 사람: wwiiiii
알고리즘 분류
구현
문자열
브루트포스 알고리즘
백트래킹

 */