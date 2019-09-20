package timer;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Timer;
import java.util.TimerTask;

//타이머 자겁을 위한 클래스
class TimerTaskEx extends TimerTask{
	//타이머로 동작할 작업
	@Override
	public void run() {
		System.out.printf("알람\n");
	}
}

public class TimerMain {

	public static void main(String[] args) {
		//Date 만들기
		Calendar cal = new GregorianCalendar(2019, 8, 20, 11, 15, 0);
		
		Date date = new Date(cal.getTimeInMillis());
		//Timer 만들기
		Timer timer = new Timer();
		//2019년9월20일 11시 15분에 동작하도록 설정
		//timer.schedule(new TimerTaskEx(), date);

		timer.schedule(new TimerTaskEx(), 1000, 10000);//1초 후에 10초마다 작업을 수행
		
		//timer.cancel();
	}

}
