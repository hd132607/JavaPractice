
/**
 Created by Junseong Kim, 2016.6.20
 경고 : 무단복제 및 공유를 불허합니다.
**/

//기본 문법
<script language= "javascript" src="abc.js">
document.write(“line 1 <br>”);

//1. 특수문자는 _과 $만 허용된다.
//2. 공백문자를 포함할 수 없다.
//3. 숫자로 시작할 수 없다.

typeof(a)

//1. 더하기는 문자열이 있으면 무조건 문자열로 ㄱㄱ
alert('52' + 273); -> '52273'
alert(52 + '273'); -> '52273'

//2. 곱하기는 숫자를 곱함.
alert('52' * 273); -> 14196

// == : 동등연산자
alert(1 == "1"); //T
alert(0 == false); //T
alert('' == false); //T
alert(null == false); //F
alert('' == null); //F

// === 항등연산자 : 같음 연산자와 동일하게 동작하지만 형식 변환이 수행 되지 않습니다. 두 식의 형식이 같지 않으면 항상 false 를 반환합니다.
alert(1 === "1"); //F
alert(0 === false); //F
alert('' === false); //F
alert(null === false); // F
alert('' === null); //F

//1~6 난수 생성
Math.floor(Math.random() * 6)+1


//document에서 객체 가져오기
var fromNum = Number(document.frmAcc.from.value);
<body>
  <h3>자바스크립트 연산</h3>
  <form method="POST" name="frmAcc">
  <input type="text" name="from" value="1" size="4" />부터
  </form>
</body>


//For 문 사용법
var array = [273, 32, 'String', true, [123, 124]];
// 배열의 순회 방법1
for (i = 0; i < array.length; i++)
  alert(array[i]);
// 배열의 순회 방법2
for (var i in array)
  alert(array[i]);


//window.confirm()
var ans = window.confirm('계속 진행할까요?');
if(ans == true)
  document.write('continue...');
else
  document.write('stopped');

//window.open()
window.open('http://m.daum.net', '','width=400, height=600, scrollbars=yes, toolbar=yes');
//window.close()
// <input type="button" value="닫기" onClick=“window.close();"/>

//객체생성
var product = {
  제품명: '7D 건조 망고',
  유형: '당절임',
  원산지: '필리핀'
}

//객체 접근
product['제품명'] == product.제품명
//for문에서 객체 접근
for(var key in product) {
  output += '● ' + key + ': ' + product[key] + '\n';
}

var person = { // 객체 정의
  name: '최은국',
  eat: function (food) {
    // 멤버변수 접근 시 this 생략 불가능
    alert(this.name + '이 ' + food + '을/를 먹습니다.');
  }
};

// 동적으로 속성 추가
var student = {}; // 빈 객체 생성
student.이름 = '이주진';
student.개인기 = '병혁샘 목소리 흉내';
student.장래희망 = 'IT CEO';
student.toString = function (){...}

//객체 속성 제거
delete(student.개인기);
//객체 생성자
function Student(name, kor, mat, eng, sci){
  this.name =name;
  ...
}
//객체 생성
new Student('강민수', 80, 81, 82, 83)

//프로토 타입과 일반 함수(중복되서 메모리를 계속 차지함)
this.getSum = function () {
  return this.국어 + this.수학 + this.영어 + this.과학;
}
Student.prototype.getSum = function () {
  return this.국어 + this.수학 + this.영어 + this.과학;
}

상속
Square.prototype = Rectangle.prototype;
