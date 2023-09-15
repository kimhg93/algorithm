package baekjoon.solved.others.silver

fun main() {
    val n = readLine()!!.toInt()
    val d = IntArray(n + 1)
    val map = HashMap<Int, Int>()
    val sb = StringBuilder()

    for(i in 2..n){
        var pos: Int
        if(i%6 == 0) {
            pos = if (d[i - 1] < d[i / 2]) i - 1 else i / 2
            if (d[pos] > d[i / 3]) pos = i / 3
        } else if(i%3 == 0) pos = if(d[i-1] < d[i/3]) i-1 else i/3
        else if(i%2 == 0) pos = if(d[i-1] < d[i/2]) i-1 else i/2
        else pos = i-1

        d[i] = d[pos]+1
        map[i] = pos
    }
    sb.append(d[n]).append("\n")

    var idx = n
    while(true){
        sb.append(idx).append(" ")
        if(idx == 1) break
        idx = map[idx]!!
    }

    println(sb)
}

/*
1로 만들기 2 실패스페셜 저지

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
0.5 초	512 MB	24947	11639	9287	47.159%
문제
정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

입력
첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 자연수 N이 주어진다.

출력
첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다.

둘째 줄에는 N을 1로 만드는 방법에 포함되어 있는 수를 공백으로 구분해서 순서대로 출력한다. 정답이 여러 가지인 경우에는 아무거나 출력한다.

예제 입력 1
2
예제 출력 1
1
2 1
예제 입력 2
10
예제 출력 2
3
10 9 3 1
출처
문제를 만든 사람: baekjoon
알고리즘 분류
다이나믹 프로그래밍
그래프 이론
그래프 탐색
 */