package java0920.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Panel;

public class LayoutFrame extends Frame {
	public LayoutFrame() {
		Panel p = new Panel();
		
		//FlowLayout은 수평 방향으로 순서대로 배치
		//더 이상 배치가 안되면 아래쪽으로 배치
		//p.setLayout(new FlowLayout());
		
		
		//BorderLayout -화면을 5등분해서 배치
		//add 를 하면 기본적으로 Center에 배치
		//겹쳐서 배치가 됩니다.
		p.setLayout(new BorderLayout());
		
		//버튼 10개
		//btn1, btn2... : 각각의 이름으로 만들면 반복문을 사용못함
		//btn[0], btn[2] ... : 반복문을 사용할 수 있음
		Button []btn = new Button[10];
		
		for(int i = 0; i < btn.length ; i++)
		{
			btn[i] = new Button("버튼" + i);
			p.add(btn[i]);
		}
		add(p);
		
		setResizable(false);
		setBounds(100,100,200,200);
		this.setVisible(true);
	}
}
