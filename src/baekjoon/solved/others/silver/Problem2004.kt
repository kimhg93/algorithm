package baekjoon.solved.others.silver

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val st = StringTokenizer(readLine())
    val list : MutableList<Int> = ArrayList()

    list.add(st.nextToken().toInt())
    list.add(st.nextToken().toInt())
    list.add(list[0] - list[1])

    println(count(list, 2).coerceAtMost(count(list, 5)))
}

fun count(list: List<Int>, d: Int): Int {
    var result = 0
    for(i in list.indices){
        var cnt = 0
        var n = list[i]
        while (n >= d) {
            n /= d
            cnt += n
        }
        if(i==0) result = cnt
        else result -= cnt
    }
    return result
}

/*
조합 0의 개수

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	47607	13389	11056	28.699%
문제
 
binom(n, m)의 끝자리
0의 개수를 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 정수
n, m(0 <= m < n <= 2,000,000,000 , n!=0)이 들어온다.

출력
첫째 줄에
binom(n, m)의 끝자리
0의 개수를 출력한다.

예제 입력 1
25 12
예제 출력 1
2
출처
데이터를 추가한 사람: dcrgkev
알고리즘 분류
수학
정수론
메모

 */