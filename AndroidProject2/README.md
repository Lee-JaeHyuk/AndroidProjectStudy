# AndroidProject2

## **1. Notification**  
- 순서는 알림 채널 생성 -> 알림 빌더 생성 -> 알림 속성 설정 -> 액션 첨부 -> 알림 객체 생성
순으로 된다  
- 채널이 생성되고 코드안에서 객체를 만든다.  
- 버튼이 눌러지면 sendNotification 이벤트가 실행되도록 button click event를 설정했다.  
- sendNotification은 새로운 인텐트를 알림으로 보내게 되는데 여기서는 구굴의 URL을 보내도록
만들었다.
- 메일이 도착하면 나오는 메시지를 설정했다.  

### **theory**
- Notification 알림은 어떤 이벤트가 발생했을 때, 앱이 사용자에게 전달하는 메시지이다. 


<br/><br/>


## **2. CustomListView**  
- 우선 핵심은 BaseAdapter를 상속받는 MyAdapter 즉 나만의 Adpater를 만드는 것이다.  
- getView 함수는 자기가 화면에 보여 지면 화면에 보여주는 item 항목을 그려서 ListView 형식으
로 보여주는 함수이다.  
- getView로 들어가게 되면 inflator를 통해서 list01.xml을 확장 시키고 text는 미리 넣은 string list
를 이용하여 순차적으로 보여준다.  
- 그리고 만일 App, Cher, Ban 로 시작하는 단어의 경우는 good.png를 아닌 경우는 fig.png를
R.drawable에서 불러와서 Image View에 집어 넣는다.  

### **theory**
- customListView는 기존의 안드로이드 스튜디오에서 제공하는 ListView를 나에 상황과 활용도에 맞
게 코드를 바꾸어 사용하는 맞춤형 ListView이다.  


<br/><br/>

## **3. Fragment**  
- 핵심은 Fragment를 생성하는것과 Fragment id를 통해서 어느 Fragment를 보여줄지 선택하는 것
이다. 또한 Fragment를 inflater 하는것도 중요하다.  
- 코드는 FragmentA 와 FragmentB 코드를 생성하고 메인에서 버튼을 누르면 각 Fragment의 id를
불러와 조건문을 통해 선택하게 했다.  


### **theory**
- Fragment 란 하나의 액티비티 안에서 여러 개의 화면을 분할해서 독립적으로 보여주거나 혹은
각 디바이스별로 화면의 구성을 다르게 해주는 것 이다.  








