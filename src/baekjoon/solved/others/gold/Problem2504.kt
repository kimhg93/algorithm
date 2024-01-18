package baekjoon.solved.others.gold

fun main() {
    var str = readLine()
    var bf = str
    var flag: Boolean
    var original = str

    while(true){
        str = str!!.replace("()", "")
                .replace("[]", "")
        if(bf == str && str.isNotEmpty()) {
            flag = false
            break
        } else if(str.isEmpty()){
            flag = true
            break
        } else bf = str
    }

    if(!flag) println(0)
    else {
        val list: MutableList<String> = ArrayList()

        original = original!!.replace("()", "2")
                .replace("[]", "3")

        repeat(original.length) {
            list.add(original.substring(it, it+1))
        }

        var idx = 0
        while(list.size > 1){
            if(isNumeric(list[idx])) {
                val num = list[idx].toInt()

                if(idx > 0 && list[idx-1] == "[" && list[idx+1] == "]"){
                    list[idx] = (num*3).toString()
                    list.removeAt(idx-1)
                    list.removeAt(idx)
                    idx = 0
                } else if(idx > 0 && list[idx-1] == "(" && list[idx+1] == ")"){
                    list[idx] = (num*2).toString()
                    list.removeAt(idx-1)
                    list.removeAt(idx)
                    idx = 0
                } else if(isNumeric(list[idx+1])){
                    list[idx] = (num + list[idx+1].toInt()).toString()
                    list.removeAt(idx+1)
                    idx = 0
                } else idx++
            } else idx++
        }
        println(list[0])
    }

}

fun isNumeric(str: String): Boolean{
    return try {
        str.toInt()
        true
    } catch (e: Exception){
        false
    }
}

/*
괄호의 값

시간 제한	메모리 제한	제출	정답	맞힌 사람	정답 비율
1 초	128 MB	58624	15997	12029	30.171%
문제
4개의 기호 ‘(’, ‘)’, ‘[’, ‘]’를 이용해서 만들어지는 괄호열 중에서 올바른 괄호열이란 다음과 같이 정의된다.

한 쌍의 괄호로만 이루어진 ‘()’와 ‘[]’는 올바른 괄호열이다.
만일 X가 올바른 괄호열이면 ‘(X)’이나 ‘[X]’도 모두 올바른 괄호열이 된다.
X와 Y 모두 올바른 괄호열이라면 이들을 결합한 XY도 올바른 괄호열이 된다.
예를 들어 ‘(()[[]])’나 ‘(())[][]’ 는 올바른 괄호열이지만 ‘([)]’ 나 ‘(()()[]’ 은 모두 올바른 괄호열이 아니다.
우리는 어떤 올바른 괄호열 X에 대하여 그 괄호열의 값(괄호값)을 아래와 같이 정의하고 값(X)로 표시한다.

‘()’ 인 괄호열의 값은 2이다.
‘[]’ 인 괄호열의 값은 3이다.
‘(X)’ 의 괄호값은 2×값(X) 으로 계산된다.
‘[X]’ 의 괄호값은 3×값(X) 으로 계산된다.
올바른 괄호열 X와 Y가 결합된 XY의 괄호값은 값(XY)= 값(X)+값(Y) 로 계산된다.
예를 들어 ‘(()[[]])([])’ 의 괄호값을 구해보자. ‘()[[]]’ 의 괄호값이 2 + 3×3=11 이므로 ‘(()[[]])’의 괄호값은 2×11=22 이다.
그리고 ‘([])’의 값은 2×3=6 이므로 전체 괄호열의 값은 22 + 6 = 28 이다.

여러분이 풀어야 할 문제는 주어진 괄호열을 읽고 그 괄호값을 앞에서 정의한대로 계산하여 출력하는 것이다.

입력
첫째 줄에 괄호열을 나타내는 문자열(스트링)이 주어진다. 단 그 길이는 1 이상, 30 이하이다.

출력
첫째 줄에 그 괄호열의 값을 나타내는 정수를 출력한다. 만일 입력이 올바르지 못한 괄호열이면 반드시 0을 출력해야 한다.

예제 입력 1
(()[[]])([])
예제 출력 1
28
예제 입력 2
[][]((])
예제 출력 2
0
출처
Olympiad > 한국정보올림피아드 > 한국정보올림피아드시․도지역본선 > 지역본선 2008 > 초등부 4번

Olympiad > 한국정보올림피아드 > 한국정보올림피아드시․도지역본선 > 지역본선 2008 > 중등부 2번

데이터를 추가한 사람: 906bc, djm03178, eatgugbab, ikissedagirl, leedongbin, sang7, sankim90, sayfour, whiteque
잘못된 데이터를 찾은 사람: djm03178
알고리즘 분류
구현
자료 구조
스택

 */