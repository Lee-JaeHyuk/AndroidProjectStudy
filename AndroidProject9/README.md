# AndroidProject8 

## **1. PedometerExample**  
- sensor 코딩을 위해서 sensorManager를 호출하여 진행했다. 
- 센서의 변하는 값은 기기마다 그 반응에 대한 차이가 있으므로 직접 값을 조절해야 한다.  
- seekBar와 threshold 값은 각각 5로 정하고 진행하였다.  


<br/><br/>


## **2. RecordLisst**   
- PedometerExample 예제와 비슷하게 진행하였다.  

<br/><br/>


### **theory**
- SensorManager  
* - SensorManager class 는 장치에 내장되어 있는 센서의 리스트를 제공한다.  
* - Sensor getDefaultSensor: 주어진 타입에 대한 디폴트 센서를 얻을 수 있다.  
* - 센서의 타입은 메크로로 지정해 놓았다. (INT 값)  
* - 값을 받고 싶은 센서에 리스너를 등록해 놓으면 애플리케이션에서 값을 전달받을 수 있다.
