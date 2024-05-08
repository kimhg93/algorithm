package baekjoon.solved.others.silver


fun main() {
    val n = readLine()!!.toInt()

    val prime = IntArray(2000001)
    prime[1] = 1
    for(i in 2..2000000) {
        var j = i
        while (j <= 2000000) {
            if(j == i && prime[j] != 1) prime[j] = 0
            else prime[j] = 1
            j+=i
        }
    }

    for(i in n until 2000000){
        if(prime[i] == 0){
            val s = i.toString()
            if(s == s.reversed()){
                println(i)
                break
            }
        }
    }

}







/*
소수&팰린드롬

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	256 MB	29055	9403	6986	30.702%
문제
어떤 수와 그 수의 숫자 순서를 뒤집은 수가 일치하는 수를 팰린드롬이라 부른다. 예를 들어 79,197과 324,423 등이 팰린드롬 수이다.

어떤 수 N (1 ≤ N ≤ 1,000,000)이 주어졌을 때, N보다 크거나 같고, 소수이면서 팰린드롬인 수 중에서, 가장 작은 수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 N이 주어진다.

출력
첫째 줄에 조건을 만족하는 수를 출력한다.

예제 입력 1
31
예제 출력 1
101
출처
문제를 번역한 사람: author6
문제의 오타를 찾은 사람: degurii, imgosari
데이터를 추가한 사람: djm03178
알고리즘 분류
수학
브루트포스 알고리즘
정수론
소수 판정
에라토스테네스의 체
 */