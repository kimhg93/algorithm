package baekjoon.solved.others.silver

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {
    val n = readLine().toInt()
    val front : Queue<String> = LinkedList()
    val rear : Queue<String> = LinkedList()

    for(i in 0 until n*2){
        if(i<n) front.offer(readLine())
        else rear.offer(readLine())
    }

    var result = 0
    val list : MutableList<String> = ArrayList()

    while(!front.isEmpty() && !rear.isEmpty()){
        val str1 : String = front.peek()
        val str2 : String = rear.peek()
        if(list.contains(str1)) front.poll()
        else {
            if(str1 == str2) {
                front.poll()
                rear.poll()
            } else {
                list.add(rear.poll())
                result++
            }
        }
    }
    println(result)
}

/*
추월 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	128 MB	5531	2533	2084	46.025%
문제
대한민국을 비롯한 대부분의 나라에서는 터널 내에서의 차선 변경을 법률로 금하고 있다.
조금만 관찰력이 있는 학생이라면 터널 내부에서는 차선이 파선이 아닌 실선으로 되어 있다는 것을 알고 있을 것이다. 이는 차선을 변경할 수 없음을 말하는 것이고,
따라서 터널 내부에서의 추월은 불가능하다.
소문난 명콤비 경찰 대근이와 영식이가 추월하는 차량을 잡기 위해 한 터널에 투입되었다.
대근이는 터널의 입구에, 영식이는 터널의 출구에 각각 잠복하고, 대근이는 차가 터널에 들어가는 순서대로, 영식이는 차가 터널에서 나오는 순서대로 각각 차량 번호를 적어 두었다.

N개의 차량이 지나간 후, 대근이와 영식이는 자신들이 적어 둔 차량 번호의 목록을 보고, 터널 내부에서 반드시 추월을 했을 것으로 여겨지는 차들이 몇 대 있다는 것을 알게 되었다.
대근이와 영식이를 도와 이를 구하는 프로그램을 작성해 보자.

입력
입력은 총 2N+1개의 줄로 이루어져 있다. 첫 줄에는 차의 대수 N(1 ≤ N ≤ 1,000)이 주어진다.
둘째 줄부터 N개의 줄에는 대근이가 적은 차량 번호 목록이 주어지고, N+2째 줄부터 N개의 줄에는 영식이가 적은 차량 번호 목록이 주어진다.
각 차량 번호는 6글자 이상 8글자 이하의 문자열로, 영어 대문자('A'-'Z')와 숫자('0'-'9')로만 이루어져 있다.

같은 차량 번호가 두 번 이상 주어지는 경우는 없다.

출력
첫째 줄에 터널 내부에서 반드시 추월을 했을 것으로 여겨지는 차가 몇 대인지 출력한다.

예제 입력 1
4
ZG431SN
ZG5080K
ST123D
ZG206A
ZG206A
ZG431SN
ZG5080K
ST123D
예제 출력 1
1
예제 입력 2
5
ZG508OK
PU305A
RI604B
ZG206A
ZG232ZF
PU305A
ZG232ZF
ZG206A
ZG508OK
RI604B
예제 출력 2
3
예제 입력 3
5
ZG206A
PU234Q
OS945CK
ZG431SN
ZG5962J
ZG5962J
OS945CK
ZG206A
PU234Q
ZG431SN
예제 출력 3
2
출처
Olympiad > Croatian Highschool Competitions in Informatics > 2002 > National Competition #1 - Seniors 1번

빠진 조건을 찾은 사람: kipa00
문제의 오타를 찾은 사람: pppqqqpq
알고리즘 분류
구현
자료 구조
문자열
해시를 사용한 집합과 맵
메모
 */