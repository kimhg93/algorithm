package baekjoon.solved.others.gold

import java.util.*

fun main() {
    val sb = StringBuilder()
     repeat(readLine()!!.toInt()) {

         val list: MutableList<Int> = ArrayList()
         val m = readLine()!!.toInt()
         for(i in 0..m/10){
             list.addAll(readLine()!!.split(" ").map{it.toInt()}.toMutableList())
         }

         val pq = PriorityQueue<Int>()
         val pq2 = PriorityQueue<Int>(Comparator.reverseOrder())

         sb.append((list.size+1)/2).append("\n")

         var cnt = 0

         for(i in 0 until list.size){
             pq.offer(list[i])

             while(pq2.size < pq.size-1) pq2.offer(pq.poll())

             if(pq2.size > 0 && pq2.peek() > pq.peek()){
                 pq.offer(pq2.poll())
                 pq2.offer(pq.poll())
             }

             if((i+1)%2 == 1){
                 sb.append(pq.peek()).append(" ")
                 cnt++
                 if(cnt%10 == 0) sb.append("\n")
             }

         }
         sb.append("\n")
    }

    println(sb)

}
/*
중앙값 구하기 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	6809	3171	2504	49.389%
문제
어떤 수열을 읽고, 홀수번째 수를 읽을 때 마다, 지금까지 입력받은 값의 중앙값을 출력하는 프로그램을 작성하시오.
예를 들어, 수열이 1, 5, 4, 3, 2 이면, 홀수번째 수는 1번째 수, 3번째 수, 5번째 수이고, 1번째 수를 읽었을 때 중앙값은 1, 3번째 수를 읽었을 때는 4, 5번째 수를 읽었을 때는 3이다.

입력
첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다.
각 테스트 케이스의 첫째 줄에는 수열의 크기 M(1 ≤ M ≤ 9999, M은 홀수)이 주어지고, 그 다음 줄부터 이 수열의 원소가 차례대로 주어진다.
원소는 한 줄에 10개씩 나누어져있고, 32비트 부호있는 정수이다.

출력
각 테스트 케이스에 대해 첫째 줄에 출력하는 중앙값의 개수를 출력하고, 둘째 줄에는 홀수 번째 수를 읽을 때 마다 구한 중앙값을 차례대로 공백으로 구분하여 출력한다.
이때, 한 줄에 10개씩 출력해야 한다.

예제 입력 1
3
9
1 2 3 4 5 6 7 8 9
9
9 8 7 6 5 4 3 2 1
23
23 41 13 22 -3 24 -31 -11 -8 -7
3 5 103 211 -311 -45 -67 -73 -81 -99
-33 24 56
예제 출력 1
5
1 2 3 4 5
5
9 8 7 6 5
12
23 23 22 22 13 3 5 5 3 -3
-7 -3
출처
ICPC > Regionals > North America > Greater New York Region > 2009 Greater New York Programming Contest D번

문제를 번역한 사람: baekjoon
데이터를 추가한 사람: keunbum, seh200
잘못된 데이터를 찾은 사람: tncks0121
알고리즘 분류
자료 구조
우선순위 큐

 */