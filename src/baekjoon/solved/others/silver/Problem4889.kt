package baekjoon.solved.others.silver

import java.lang.StringBuilder

fun main() {
    val sb = StringBuilder()
    var num = 1
    while(true){
        val str = readLine()!!
        if(str.contains("-")) break
        val result = check(str)
        sb.append(num++)
        if(result.isEmpty()) sb.append(". 0")
        else sb.append(". ").append(convert(result))
        sb.append("\n")
    }
    println(sb)
}

fun convert(str: String): Int {
    var cnt = 0
    val arr = str.toCharArray()
    while(check(arr.joinToString("")).isNotEmpty()){
        for(i in arr.indices step 2){
            if(arr[i] == '}') {
                arr[i] = '{'
                cnt++
            }
            if(arr[i+1] == '{'){
                arr[i+1] = '}'
                cnt++
            }
        }
    }
    return cnt
}

fun check(str: String): String {
    var bf = str
    while(true){
        val af = bf.replace("{}", "")
        if(af.length == bf.length) break
        else bf = af
    }
    return bf
}

/*
안정적인 문자열 다국어

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	6459	3023	2481	46.244%
문제
여는 괄호와 닫는 괄호만으로 이루어진 문자열이 주어진다. 여기서 안정적인 문자열을 만들기 위한 최소 연산의 수를 구하려고 한다. 안정적인 문자열의 정의란 다음과 같다.

빈 문자열은 안정적이다.
S가 안정적이라면, {S}도 안정적인 문자열이다.
S와 T가 안정적이라면, ST(두 문자열의 연결)도 안정적이다.
{}, {}{}, {{}{}}는 안정적인 문자열이지만, }{, {{}{, {}{는 안정적인 문자열이 아니다.

문자열에 행할 수 있는 연산은 여는 괄호를 닫는 괄호로 바꾸거나, 닫는 괄호를 여는 괄호로 바꾸는 것 2가지이다.

입력
입력은 여러 개의 데이터 세트로 이루어져 있다. 각 데이터 세트는 한 줄로 이루어져 있다. 줄에는 여는 괄호와 닫는 괄호만으로 이루어진 문자열이 주어진다.
문자열의 길이가 2000을 넘는 경우는 없고, 항상 길이는 짝수이다.

입력의 마지막 줄은 '-'가 한 개 이상 주어진다.

출력
각 테스트 케이스에 대해서, 테스트 케이스 번호와 입력으로 주어진 문자열을 안정적으로 바꾸는데 필요한 최소 연산의 수를 출력한다.

예제 입력 1
}{
{}{}{}
{{{}
---
예제 출력 1
1. 2
2. 0
3. 1

 */