package baekjoon.solved.others.gold

import kotlin.math.max


fun main() {
    val str = readLine()!!
    var max = 0
    var left = 0
    var right = str.length
    val dup = str.replace(str[0].toString(), "")

    if(isPal(str) && dup.isEmpty()) {
        println(-1)
        return
    }

    while(left < right){
        val s = str.substring(left, right)
        if(isPal(s)) right--
        else {
            max = max(max, right-left)
            break
        }
        if(left > right) break
    }

    right = str.length
    while (left < right) {
        val s = str.substring(left, right)
        if (isPal(s)) left++
        else {
            max = max(max, right-left)
            break
        }
    }

    if(max == 0) println(-1)
    else println(max)
}

fun isPal(str: String): Boolean {
    var head = 0
    var rear = str.length-1
    while(head < rear){
        if(str[head] == str[rear]){
            head++
            rear--
        } else return false
    }
    return true
}

/*
회문은 회문아니야!!

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
2 초	512 MB	4724	1953	1601	40.696%
문제
팰린드롬이란 앞으로 읽으나 뒤로 읽으나 같은 문자열을 말한다. 팰린드롬의 예시로 POP, ABBA 등이 있고, 팰린드롬이 아닌 것의 예시로 ABCA, PALINDROME 등이 있다.

같은 의미를 가지는 여러 단어들을 보자.

회문 (한국어)
palindrome (영어, 프랑스어, 노르웨이어, 그리스어, 라틴어)
回文 (일본어, 중국어)
palindrom (독일어, 덴마크어)
palindromi (핀란드어)
palíndromo (스페인어, 포르투갈어)
palindromo (이탈리아어, 에스페란토어)
палиндром (러시아어)
قلب مستو (아랍어)
뭔가 이상한 점이 보이지 않는가? 그 어떤 언어에서도 팰린드롬을 뜻하는 단어는 팰린드롬이 아니다! 많은 사람들이 추구하는 “대칭의 아름다움”은 그저 허상에 불과하다.

알파벳 대문자로 이루어진 문자열이 주어졌을 때, 팰린드롬이 아닌 가장 긴 부분문자열의 길이를 구해 보자. 이때 부분문자열을 이루는 글자는 연속해야 한다.
AB는 ABCD의 부분문자열이지만, AC는 아니다.

입력
길이가 1 이상 50만 이하인 문자열이 주어진다.

출력
팰린드롬이 아닌 가장 긴 부분문자열의 길이를 출력한다. 그런 부분문자열이 없으면 -1을 출력한다.

예제 입력 1
ABCBA
예제 출력 1
4
예제 입력 2
PALINDROME
예제 출력 2
10
예제 입력 3
ZZZ
예제 출력 3
-1
출처
High School > 선린인터넷고등학교 > 제2회 천하제일 코딩대회 L번

문제를 만든 사람: jh05013
알고리즘 분류
문자열
애드 혹
 */