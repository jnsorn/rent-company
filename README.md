# rent-company
차량에 따른 연료 주입 실습을 통해 상속과 인터페이스를 이해한다.

## 🚗 예제

### 기능 요구사항
우리 회사는 렌터카를 운영하고 있다. 현재 보유하고 있는 차량은 Sonata 2대, Avante 1대, K5 2대로 총 5대의 차량을 보유하고 있다.
우리 회사는 고객이 인터넷으로부터 예약할 때 여행할 목적지의 대략적인 이동거리를 입력 받는다. 이 이동거리를 활용해 차량 별로 필요한 연료를 주입한다.

차량 별로 주입해야 할 연료량을 확인할 수 있는 보고서를 생성해야 한다.

각 차량별 연비는 다음과 같다.
                    
* Sonata : 10km/리터
* Avante : 15km/리터
* K5 : 13km/리터

                  
### 프로그래밍 요구사항 - 1단계
* 상속과 추상 메소드를 활용한다.
* 위 요구사항을 if/else 절을 쓰지 않고 구현해야 한다.

이 요구사항을 만족하는 테스트 코드는 다음과 같다.

*아래 테스트 코드에서 자동차 인스턴스를 생성할 때의 숫자는 자동차로 여행할 거리를 의미한다.*

```java                    
public class RentCompanyTest {
    private static final String NEWLINE = System.getProperty("line.separator");

    @Test
    public void report() throws Exception {
        RentCompany company = RentCompany.create(); // factory method를 사용해 생성
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));

        String report = company.generateReport();
        assertThat(report).isEqualTo(
            "Sonata : 15리터" + NEWLINE +
            "K5 : 20리터" + NEWLINE +
            "Sonata : 12리터" + NEWLINE +
            "Avante : 20리터" + NEWLINE +
            "K5 : 30리터" + NEWLINE
        );
    }
}
```
                  
**힌트**
상속을 활용해 구현해야 한다. 공통 기능 구현을 담당할 Car 클래스를 추가한다. Car 클래스에 abstract를 활용한다.

```java
public abstract class Car {
    /**
     * 리터당 이동 거리. 즉, 연비
     */
    abstract double getDistancePerLiter();

    /**
     * 여행하려는 거리
     */
    abstract double getTripDistance();
    
    /**
     * 차종의 이름
     */
    abstract String getName();

    /**
     * 주입해야할 연료량을 구한다.
    */
    double getChargeQuantity() {
        return getTripDistance() / getDistancePerLiter();
    }
}
```
                  
### 프로그래밍 요구사항 - 2단계
인터페이스를 적용해 구현한다.

## 📝 정리
