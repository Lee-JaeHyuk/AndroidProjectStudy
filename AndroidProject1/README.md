# AndroidProject1

## **1. MyCalculator**  
- 일반적인 숫자를 입력하여 사칙연산이 가능한 계산기
- XML 부분은 EditText 와 TableLayout을 토대로 만들었다.  
- 두 자릿수 이상 숫자의 입력이 가능하며 연속된 사칙연산이 가능하다.  

### **theory**  
- numberOfPoint 변수를 통해 버튼의 동작 횟수를 세어 한자리 수 이상의 수를 입력받는다.  
- numOperand 변수를 통해 순차적으로 계산을 하게 만들었다.

<br/><br/>


## **2. Draw_touch**  
- 기존의 View 클래슷 상속받아서 필요한 기능의 위젯을 만든다.  
- View 클래스를 상속받아 MyView라는 클래스를 새롭게 만들었고 안에 이벤트 처리 매서드를 새
롭게 정의했다. 여기서 Myview는 백그라운드 색을 지정하고 선의 굵기를 조정하고 선의 색과 스
타일을 선택하여 만들었다.  
-  새롭게 정의한 이벤트 처리 메소드에서는 터치 된 지점에 x,y값을 새롭게 받아와서 조건
문을 통해 그림을 그리도록 했다.


<br/><br/>

## **3. Multi_Touch_App**  
- 사이즈 크기를 지정하고 최대 10개의 포인터 위치와 상태를 저장하게끔 만들었다. 이부분은 추가
로 조정이 가능한 부분이다.  
- 인덱스를 통해 id를 구분하고 화면이 터치되면 위치를 계산하여 배열에 저장하고 touching[] 배열
에 인덱스를 통해 현재 터치가 되어있는지 True, False를 통해 구분한다.
- 마지막 onDraw에서 현재 터치되어 있는 포인터에 내가 코딩한 것을 그리게 된다.  








