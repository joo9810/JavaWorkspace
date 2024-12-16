package chap_04;

// 주차요금은 시간당 4000 원 (일일 최대 요금은 30000 원)
// 경차 또는 장애인 차량은 최종 요금에서 50% 할인

// 일반 차량 5시간 주차 시 20000 원
// 경차 5시간 주차 시 10000 원
// 장애인 차량 10시간 주차 시 15000 원

// 실행결과 : 주차 요금은 xx 원입니다.

public class _Quiz_04 {
    public static void main(String[] args) {
        String car;
        int time = 10; // 주차 시간
        int max = 30000;
        int charge = 0;
        boolean isSmallCar = false; // 경차 여부
        boolean withDisabledPerson = true; // 장애인 차량 여부

        for (int i = 0; i < time; i++) {
             charge += 4000;

             if (charge > max) {
                 charge = max;
                 break;
             }
         }
         if (isSmallCar || withDisabledPerson) {
             charge /= 2;
         }

         System.out.println("주차 요금은 " + charge + " 원입니다.");
    }
}
