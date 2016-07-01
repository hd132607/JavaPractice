
/**
 Created by Junseong Kim, 2016.6.20
 경고 : 무단복제 및 공유를 불허합니다.
**/

var getter = $('h3').css('text-align'); //css값 가져오기

$('h1').css('color','red');
//모든 h1에있는 자식 p의 배경 변경
$('h1 p').css('background-color','yellow');
//h1밑에 직계로 있는 자식만 변경
$('h1 > p').css(...)

//입력값중 체크된것
$('input:checked').val()

//테이블에서 Jquery 선택
$('tr:odd').css(...) //홀수 번째 선택
$('tr:even').css(...) //짝수 번째
$('tr:first').css(...)

$('h3:contians(문자열)').css(...) //특정 문자열 포함
$('h3:eq(n)') //n번째 엘리먼트 선택 (음수면 끝에서부터 셈)
$('h3:gt(n)') //n번째이후의 모든 엘리먼트 선택
$('h3:lt(n)') //n번째이전의 모든 엘리먼트 선택
$('h3:has(h1)') //h1테그를 갖고있는 엘리먼트 선택
$('body:not(h1)') //h1이 아닌 엘리먼트들 선택
$('tr:nth-child(3n+1)') //3n+1번째 엘리먼트들 선택

//선택자 반복하기
$('selector').each(function(index,object){
  $(this).css('...')
  $('selector').eq(index).css('...')
})

$('h3').filter(':odd').css('color','black').end().
       .filter(':even').css('color','yellow')

$('h1').addClass('red-man') //테그에 클래스를 추가함
$('h1').removeClass('red-man') //제거
$('h1').toggleClass('red-man') //지정되어있으면 제거, 있지 않으면 추가


$('img').attr('src');//src의 값 가져오기
$('img').attr('width', 150); //width값 설정하기

var btn = $('#switch').val();
$('#switch').val('OFF'); //Value값 설정


var color = ['red', 'blue', 'green'];
//h2의 index를 넘겨주는거 같은데...
$('h2').css('color', function(index){
  return color[index];
});

var str_html = $('div').html() // 결과 -> <h2>Hello</h2>
var str_text = $('div').text() // 결과 -> Hello

$('div').html('<h2>Add HTML</h2>')
$('div').text('Add TEXT')


$('div').remove() //객체삭제
$('div').empty() //내부 자손 삭제


$(A).appendTo(B) //A를 B의 뒷부분에 추가
$(A).prependTo(B) //A를 B의 앞부분에 추가
$(A).insertAfter(B) //A를 B의 뒤에 추가
$(A).insertBefore(B) //A를 B의 앞에 추가

$(A).append(B) //B를 A의 뒷부분에 추가
$(A).prepend(B) //B를 A의 앞부분에 추가
$(A).after (B) //B를 A의 뒤에 추가
$(A).before(B) //B를 A의 앞에 추가

$(A).clone() //객체 복사

var content = [
  { name: '윤인성', region: '서울특별시 강서구' },
  { name: '윤하린', region: '서울특별시 광진구' },
  { name: '윤인아', region: '서울특별시 강남구' }
];

//이렇게 함수로 HTML을 넘겨줘도 가능
$('div').append(function(index) {
  var item = content[index];
  var str = '';
  str += '<h3>'+ item.name +'</h3>';
  str += '<p>'+ item.region +'</p>';
  return str;
});

//bind()함수 : 이벤트 처리 함수 ('이벤트 명', 실행할함수)
$('input').bind('focusin', function () {
  $(this).css('background-color', 'yellow');
})

//객체로 여러개 념겨줄수도 있음
$('h2').bind({
  mouseenter: function() { $(this).css('color', 'red'); },
  mouseleave: function() { $(this).css('color', 'black'); }
})

//이런식으로 바로 사용도 가능
$('h2').click(function(event){
  ...
})


$(selector).unbind(); // 객체와 관련된 모든 이벤트 제거
$(selector).unbind(eventname); // 특정 이벤트와 관련된 모든 핸들러 제거
$(selector).unbind(eventname, function); // 특정 이벤트 핸들러를 제거

$(selector).one() //일회용 이벤트 : 한번 사용후 종료됨

$('div').click(function(event){
  //클릭된 div내에 있는 h2의 색을 바꿈
  $('h2',this).css('color'.red);
})

$(selector).trigger('click') // 강제 이벤트 발생
$('h2').each(function(index){...}); //for-each문

//Key Event
keydown : "키보드가 눌렸을때"
keyup : "키보드가 떼어질때"
keypress : "글자가 입력될때"

//내부저장소
localStorage.setItem('tag','text');
localStorage.getItem('tag');

//윈도우 이벤트
'ready' : 문서 객체가 준비를 완료할 때 발생합니다.
'load' : 문서 객체를 불러들일 때 발생합니다.
'unload' :문서 객체를 닫을 때 발생합니다.
'resize' : 크기를 변화 시킬 때 발생합니다.
'scroll' :스크롤 할 때 발생합니다.
'error' :에러가 있을 때 발생합니다.

mouseover : "버블링 : 큰디브 -> 작은디브 까지 이벤트가 전달"
mouseenter : "큰디브에서만 이벤트가 발생한다."


// 박스 내부의 좌표 가져오기
$("#demo-box").click(function(e) {

  var offset = $(this).offset();
  var relativeX = (e.pageX - offset.left);
  var relativeY = (e.pageY - offset.top);

  // pageX,Y 전체 페이지 내에서의 좌표계
});

$(selector).preventDefault() //기본 이벤트 (예 : a테그 링크 이동) 제거
$(selector).stopPropagation() //이벤트 전달을 제거합니다

//bind의 한계점 : 객체를 clone했을때 이벤트 헨들러까지 복제가 되지 않음 따라서 on()함수를 사용함.

$('h1').on('mousedown',function(event){...}); //모든 h1에 대해서 이벤트 적용

$('div').on('mousedown','h1',function(event){$(this).css('...')}); //div가 클릭되면 div안에 있는 h1에 대해서 css변경

$.cookie('tag') // 쿠키 가져오기
$.cookie('tag','value') //쿠기 setter
$.removeCookie('tag')
