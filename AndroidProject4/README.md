# AndroidProject4

## **1. ProgressBarThread**  
-  XML 파트에서 Progressbar를 선언하고 Main_Activity에서 id를 찾아와서 수행시키는 flow 이
다.  
- 중간에 Thread를 새롭게 생성하여 UI 부분이 아닌 작업 Tread로 run 하였다.  
- Sleep 함수를 통해 1초마다 Progressbar 상태를 1씩 증가시켰다.  
- post() method를 통해 큐에 집어 넣어 Main Thread에게 결과물을 넘겼다.  



<br/><br/>


## **2. AsyncCounter**  
- AsyncTask를 extend 하여 함수를 새롭게 만들고 onPreExecute()를 통해 작업 Thread를 호출하여
일을 시킨다. 여기서 작업 Thread는 일을 마치고 publishProgress()를 통해 Main Thread에게 작업
한 결과물을 넘긴다.  
- Main Thread는 작업 Thread로부터 받은 결과물을 update하고 새롭게 execute를 하게 된
다.  
- 이렇게 진행되면 백그라운드에서 작업 Thread를 통해 완수를 한 임무가 UI에 나타나게 된다.  
- 중요한 것은 Manifest 파일에서 user-permission 에 internet을 추가해주어야 한다.  


### **theory**
- AsyncTask란?  
AsyncTask 클래스는 1.5 버전부터 추가된 클래스로 작업 Thread와 관련된 복잡한 부분을 쉽게 처
리해주는 클래스이다.  










