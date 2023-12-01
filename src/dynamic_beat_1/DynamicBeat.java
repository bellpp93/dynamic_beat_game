package dynamic_beat_1;

import javax.swing.JFrame;

public class DynamicBeat extends JFrame {

	public DynamicBeat() {
		setTitle("Dynamic Beat");
		setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
		setResizable(false); // 창 사이즈 사용자가 임의적으로 조정불가
		setLocationRelativeTo(null); // 게임 창 정 중앙에 위치
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 게임 창 종료했을 때 프로그램 종료
		setVisible(true); // 화면을 정상적으로 출력
	}
}
