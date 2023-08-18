package baekjoon.solved.others.gold

fun main() {
    val n = readLine()!!.toInt()
    var cnt = 9
    val arr = IntArray(10)
    var j = 2

    if(n <= 10) {
        println(n.toString())
        return
    }

    while(j <= 10){
        for (i in arr.size-1 downTo arr.size-j-1) {
            if(i > 0 && arr[i]+1 < arr[i-1]){
                arr[i]++
                reset(arr, i + 1)
                break
            }

            if(arr.size-i == j){
                if (arr[i] != 9) {
                    arr[i]++
                    reset(arr, i+1)
                } else if(arr[i] == 9) {
                    j++
                    if(i > 0){
                       arr[i-1] = 1
                       reset(arr, i)
                    }
                }
                break
            }
        }

        if(j <= 10 && check(arr, j)) cnt++
        if(cnt == n) {
            println(arr.joinToString("").trimStart('0'))
            break
        }
    }

    if(j > 10) println(-1)
}

fun reset(arr: IntArray, n: Int){
    for(i in n until arr.size){
        arr[i] = 0
    }
}

fun check(arr: IntArray, j: Int): Boolean {
    for(i in arr.size-j..arr.size-2){
        if(arr[i] <= arr[i+1]) return false
    }
    return true
}

/*

감소하는 수
시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	512 MB	25282	7938	6239	33.838%
문제
음이 아닌 정수 X의 자릿수가 가장 큰 자릿수부터 작은 자릿수까지 감소한다면, 그 수를 감소하는 수라고 한다.
예를 들어, 321과 950은 감소하는 수지만, 322와 958은 아니다. N번째 감소하는 수를 출력하는 프로그램을 작성하시오.
0은 0번째 감소하는 수이고, 1은 1번째 감소하는 수이다. 만약 N번째 감소하는 수가 없다면 -1을 출력한다.

1, 2, 3, 4, 5, 6, 7, 8, 9
10, 20, 21
30, 31, 32
40, 41, 42, 43
50, 51, 52, 53, 54

530
531
532
540

입력
첫째 줄에 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수 또는 0이다.

출력
첫째 줄에 N번째 감소하는 수를 출력한다.

예제 입력 1
18
예제 출력 1
42
예제 입력 2
0
예제 출력 2
0
예제 입력 3
500000
예제 출력 3
-1

알고리즘 분류
브루트포스 알고리즘
백트래킹

 */