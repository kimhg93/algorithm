package baekjoon.solved.others.gold

fun main() {
    readLine()
    val arr = readLine()!!.split(" ").map { it.toInt() }
    val map: HashMap<Int, Int> = HashMap()
    var cnt = 0

    for(i in arr.indices){
        val now = arr[i]
        val target = if(map[now] == null) 0 else map[now]
        val next = if(map[now-1] == null) 0 else map[now-1]
        if(target!! > 0) map[now] = target-1
        else cnt++
        map[now-1] = next!! + 1
    }

    println(cnt)
}

/*
풍선 맞추기 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	256 MB	5679	1889	1436	36.972%
문제
큰 방에 N개의 풍선이 떠있다. 풍선들은 왼쪽부터 오른쪽까지 일렬로 있다. 진솔이는 화살 가지고 노는 것과 사냥 연습하는 것을 좋아한다.
진솔이는 화살을 왼쪽에서 오른쪽으로 쏜다. 높이는 임의로 선택한다. 화살은 선택된 높이 H에서 풍선을 마주칠 때까지 왼쪽에서 오른쪽으로 이동한다.
화살이 풍선을 마주치는 순간, 풍선은 터지고 사라진다. 화살은 계속해서 가던길을 가는데 높이는 1 줄어든다.
그러므로 만약 화살이 높이 H에서 이동 중이었다면 풍선을 터트린 후에는 높이가 H-1이 된다.

우리의 목표는 모든 풍선을 터트리되 가능한한 적은 화살을 사용하는 것이다.

입력
첫 번째 줄에는 정수 N(1 ≤ N ≤ 1 000 000)이 들어온다.
두 번째 줄에는 배열 Hi가 N개 들어온다.
각각의 Hi(1 ≤ Hi ≤ 1 000 000)는 i번째 풍선의 높이에 해당하며 왼쪽에서 오른쪽으로 나열되는 순서이다.

출력
첫 번째 줄 한줄에 최소한 필요한 화살의 개수를 출력한다.

예제 입력 1
5
2 1 5 4 3
예제 출력 1
2
예제 입력 2
5
1 2 3 4 5
예제 출력 2
5
예제 입력 3
5
4 5 2 1 4
예제 출력 3
3
힌트
첫 번째 예제 에서 [5,4,3] 을 터트리고 [2,1]을 터트리면 모든 풍선을 터트릴 수 있으므로 최소한 2개의 화살을 필요로 한다.

출처
Contest > Croatian Open Competition in Informatics > COCI 2015/2016 > Contest #1 3번

문제의 오타를 찾은 사람: admln
데이터를 추가한 사람: funny0728
문제를 번역한 사람: infoefficiency
알고리즘 분류
그리디 알고리즘
 */