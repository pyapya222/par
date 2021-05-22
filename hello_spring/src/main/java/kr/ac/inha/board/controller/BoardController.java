package kr.ac.inha.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//ctrl + shift + o : 사용하지 않은 임포트를 다 지움
@RestController
public class BoardController {
	@RequestMapping("/hello")
	//hello 요청시 return 해줘라
	public String hello(int num) {
		String answer="";
		for(int i = 1;i<10;++i) {
			answer += (num + " * " + i+" = " + (num*i) + " ");
		}
		return answer;
	}
	@RequestMapping("/inha")
	public String inha(String para) {
		return para + "inha.ac.kr";
	}
	//넷상에서 parameter를 줄때 ?사용 (get방식이라함)
	//?para=asdfasdf
	@RequestMapping("/name")
	public String name(String id) {
		return "당신의 학번은 : " + id;
	}
	
}
