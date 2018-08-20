package com.gms.web.domain;
import org.springframework.stereotype.Component;
import lombok.Data;


@Component   // 이 클래스를 bean 으로 쓰겠다
@Data		 // 아래 선언한 변수를 자동 getter setter 화 시키겠다는 뜻이라는 겁니다
public class Image {
	private String imgSeq;
	private String imgname;
	private String extension;
	private String memid;
}
