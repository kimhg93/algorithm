package baekjoon.solved.others.silver


fun main() = with(System.`in`.bufferedReader()) {
    val map = HashMap<String, Int>()

    repeat(readLine().toInt()) {
        val str = readLine()
        map[str] = map.getOrDefault(str, 0) + 1
    }

    var max = 0
    var str = ""

    map.forEach {
        if (it.value > max) {
            max = it.value
            str = it.key
        } else if (it.value == max && it.key < str) str = it.key
    }
    println(str)
}

/*
베스트셀러

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	20287	10590	8804	52.367%
문제
김형택은 탑문고의 직원이다. 김형택은 계산대에서 계산을 하는 직원이다. 김형택은 그날 근무가 끝난 후에, 오늘 판매한 책의 제목을 보면서 가장 많이 팔린 책의 제목을 칠판에 써놓는 일도 같이 하고 있다.

오늘 하루 동안 팔린 책의 제목이 입력으로 들어왔을 때, 가장 많이 팔린 책의 제목을 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 오늘 하루 동안 팔린 책의 개수 N이 주어진다. 이 값은 1,000보다 작거나 같은 자연수이다. 둘째부터 N개의 줄에 책의 제목이 입력으로 들어온다. 책의 제목의 길이는 50보다 작거나 같고, 알파벳 소문자로만 이루어져 있다.

출력
첫째 줄에 가장 많이 팔린 책의 제목을 출력한다. 만약 가장 많이 팔린 책이 여러 개일 경우에는 사전 순으로 가장 앞서는 제목을 출력한다.

예제 입력 1
5
top
top
top
top
kimtop
예제 출력 1
top
예제 입력 2
9
table
chair
table
table
lamp
door
lamp
table
chair
예제 출력 2
table
예제 입력 3
6
a
a
a
b
b
b
예제 출력 3
a
예제 입력 4
8
icecream
peanuts
peanuts
chocolate
candy
chocolate
icecream
apple
예제 출력 4
chocolate
예제 입력 5
1
soul
예제 출력 5
soul
출처
문제를 번역한 사람: baekjoon
데이터를 추가한 사람: sukwoo0711
알고리즘 분류
자료 구조
문자열
정렬
해시를 사용한 집합과 맵
 */