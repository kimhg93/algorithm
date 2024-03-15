package baekjoon.solved.others.silver


fun main() {
    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map { it.toInt() }
    val sb = StringBuilder()

    var cnt = 1

    while(cnt < n){
        val chkList: MutableList<Int> = ArrayList()
        for(i in cnt downTo 0){
            chkList.add(list[n-1-i])
        }

        val front = chkList[0]

        if(front == chkList.maxOrNull()) cnt++
        else {
            chkList.sort()
            for(j in 0 until cnt){
                if(chkList[j] == front) {
                    chkList.add(0, chkList.removeAt(j+1))
                    break
                }
            }
            val result = list.subList(0, n-cnt-1).toMutableList()
            result.addAll(chkList)
            result.forEach { num -> sb.append(num).append(" ") }
            break
        }
    }

    if(cnt == n) sb.append(-1)

    println(sb)
}

/*
다음 순열

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	256 MB	29537	11871	8713	40.650%
문제
1부터 N까지의 수로 이루어진 순열이 있다. 이때, 사전순으로 다음에 오는 순열을 구하는 프로그램을 작성하시오.

사전 순으로 가장 앞서는 순열은 오름차순으로 이루어진 순열이고, 가장 마지막에 오는 순열은 내림차순으로 이루어진 순열이다.

N = 3인 경우에 사전순으로 순열을 나열하면 다음과 같다.

1, 2, 3
1, 3, 2
2, 1, 3
2, 3, 1
3, 1, 2
3, 2, 1
입력
첫째 줄에 N(1 ≤ N ≤ 10,000)이 주어진다. 둘째 줄에 순열이 주어진다.

출력
첫째 줄에 입력으로 주어진 순열의 다음에 오는 순열을 출력한다. 만약, 사전순으로 마지막에 오는 순열인 경우에는 -1을 출력한다.

예제 입력 1
4
1 2 3 4
예제 출력 1
1 2 4 3
예제 입력 2
5
5 4 3 2 1
예제 출력 2
-1
출처
문제를 만든 사람: baekjoon
알고리즘 분류
수학
조합론

 */