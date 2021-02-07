# AndroidProject8 

## **1. ImageCapture**  
- manifest에 Camera permission을 꼭 확인해야 한다.  
- openCamera를 통해서 카메라를 작동 시키고 캡처 버튼을 누르면 권한을 체크하고 해당 요청에 대한 값을 반환 한다.  


<br/><br/>


## **2. RecordLisst**   
- Android Studio의 surfaceView를 이용하였다.  
- 녹화 -> 재생목록 -> 해당 파일 클릭 -> 파일 재생 순으로 진행하기 위해 녹화하는 기능과 실행 시키는 기능을 분리했고 재생목록을 보여주기 위해 예전에 했던 listview adapter를 이용했다.  
- 녹화 할 때 파일명을 위해 추가한 기능으로는 data 가 있다. 중복을 방지하기 위해 현재 날짜와 현재 시간으로 파일명을 만들어서 Intent할 때 데이터를 같이 넘겼다.  
- 또한 Listview click 이벤트를 설정해 item이 눌러지면 Intent를 하고 해당 item의 파일명을 getExtra 했다.  
- 그렇게 마지막으로 넘어간 video player에서 getExtra를 통해 넘겨받은 데이터를 갖고 url를 찾아 mediaplayer를 진행시켜 녹음된 파일을 바로 play하게 만들었다.  
- 마지막 video player에서 해당 파일을 surface view를 통해 진행하려고 했지만 이상하게 화면이 나오지않고 소리만 나오는 현상이 계속되었다. 이 부분은 아무래도 surface holder 부분을 제데로 이
해하지 못하고 사용한 것 때문인 것 같았다.  

<br/><br/>


### **theory**
- 안드로이드 스튜디오가 제공하는 다양한 멀티미디어 기술  
사용하기 위해서는 안드로이드 스튜디오 공식 홈페이지에 자세히 기재되어 있다.  

1. MediaPlayer  

2. MediaRecorder  

3. surFace 

