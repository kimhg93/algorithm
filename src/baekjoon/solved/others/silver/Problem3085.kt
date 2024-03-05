package baekjoon.solved.others.silver

import java.lang.Integer.max

fun main() {
    val n = readLine()!!.toInt()
    val list: MutableList<MutableList<Int>> = ArrayList()

    repeat(n){
        val subList: MutableList<Int> = ArrayList()
        val str = readLine()!!.toString()
        repeat(n){ j ->
            val s = str.substring(j, j+1)
            val num = if(s == "C") 0
            else if(s == "P") 1
            else if(s == "Z") 2
            else 3

            subList.add(num)
        }
        list.add(subList)
    }

    val col = IntArray(n)
    val row = IntArray(n)

    for(i in 0 until n){
        for(j in 0 until n){
            val colArr = IntArray(n)
            repeat(n) { colArr[it] = list[i][it] }
            col[i] = max(count(colArr, n), col[i])
            if(j < n-1) col[i] = max(count(swap(colArr, j, j+1, list, 0), n), col[i])

            repeat(n) { colArr[it] = list[i][it] }
            if(j > 0) col[i] = max(count(swap(colArr, j, j-1, list, 0), n), col[i])

            repeat(n) { colArr[it] = list[i][it] }
            if(i < n-1) col[i] = max(count(swap(colArr, i+1, j, list, 1), n), col[i])

            repeat(n) { colArr[it] = list[i][it] }
            if(i > 0) col[i] = max(count(swap(colArr, i-1, j, list, 1), n), col[i])
        }
    }

    for(i in 0 until n){
        for(j in 0 until n){
            val rowArr = IntArray(n)
            repeat(n) { rowArr[it] = list[it][i] }
            row[i] = max(count(rowArr, n), row[i])
            if(j < n-1) row[i] = max(count(swap(rowArr, j, j+1, list, 0), n), row[i])

            repeat(n) { rowArr[it] = list[it][i] }
            if(j > 0) row[i] = max(count(swap(rowArr, j, j-1, list, 0), n), row[i])

            repeat(n) { rowArr[it] = list[it][i] }
            if(i < n-1) row[i] = max(count(swap(rowArr, j, i+1, list, 2), n), row[i])

            repeat(n) { rowArr[it] = list[it][i] }
            if(i > 0) row[i] = max(count(swap(rowArr, j, i-1, list, 2), n), row[i])
        }
    }

    println(max(col.maxOrNull()!!.toInt(), row.maxOrNull()!!.toInt()))
}


fun count(arr: IntArray, n: Int) : Int {
    var cnt = 1
    var max = 0
    for(i in 0 until n-1){
        if(arr[i] == arr[i+1]) cnt++
        else cnt = 1
        max = max(cnt, max)
    }
    return max
}

fun swap(arr: IntArray, n: Int, m: Int, source: MutableList<MutableList<Int>>, type: Int) : IntArray{
    if(type == 0){
        val temp = arr[n]
        arr[n] = arr[m]
        arr[m] = temp
    } else if(type == 1) arr[m] = source[n][m]
    else  arr[n] = source[n][m]

    return arr
}


//    // 세로 검사 해당row에 각각 색상이 존재하는지 확인 후 있으면 ++
//    for(i in 0 until n){
//        if(list[i].contains("C")) row[0]++
//        if(list[i].contains("C")) row[0]++
//        if(list[i].contains("C")) row[0]++
//        if(list[i].contains("C")) row[0]++
//    }


/*
사탕 게임 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	46287	16078	11017	33.655%
문제
상근이는 어렸을 적에 "봄보니 (Bomboni)" 게임을 즐겨했다.
가장 처음에 N×N크기에 사탕을 채워 놓는다. 사탕의 색은 모두 같지 않을 수도 있다.
상근이는 사탕의 색이 다른 인접한 두 칸을 고른다. 그 다음 고른 칸에 들어있는 사탕을 서로 교환한다.
이제, 모두 같은 색으로 이루어져 있는 가장 긴 연속 부분(행 또는 열)을 고른 다음 그 사탕을 모두 먹는다.
사탕이 채워진 상태가 주어졌을 때, 상근이가 먹을 수 있는 사탕의 최대 개수를 구하는 프로그램을 작성하시오.

입력
첫째 줄에 보드의 크기 N이 주어진다. (3 ≤ N ≤ 50)
다음 N개 줄에는 보드에 채워져 있는 사탕의 색상이 주어진다. 빨간색은 C, 파란색은 P, 초록색은 Z, 노란색은 Y로 주어진다.
사탕의 색이 다른 인접한 두 칸이 존재하는 입력만 주어진다.

출력
첫째 줄에 상근이가 먹을 수 있는 사탕의 최대 개수를 출력한다.

예제 입력 1
3
CCP
CCP
PPC
예제 출력 1
3
예제 입력 2
4
PPPP
CYZY
CCPY
PPCC
예제 출력 2
4
예제 입력 3
5
YCPZY
CYZZP
CCPPP
YCYZC
CPPZZ
예제 출력 3
4
힌트
예제 3의 경우 4번 행의 Y와 C를 바꾸면 사탕 네 개를 먹을 수 있다.

 */