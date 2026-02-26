package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;


@Getter
@Setter
@NoArgsConstructor  // 기본 생성자 필수로 작성하는 매개변수가 없는 생성자
@AllArgsConstructor // 필수 생성자 필수로 작성하는 매개변수가 있는 생성자 (ALL)
public class Users {
    // 필드 변수
    private int id;
    private String name;
    private String email;
    private LocalDateTime create_at;
}



/****************************************
 * 고전 방식의 class 객체 생성 형태
 * 모든 자바 언어를 사용하는 개발자들은 모두다 기본생성자, 매개변수생성자, 게터, 세터를 만드는 작업을
 * 모두가 항상 해야했었다.
 * 자바로 개발하려면 필드 5개 짜리 클래스인데 생성자 ~ toString 까지 만들면 100줄 코드를 매번 만들어야함
 * 이거 너무 귀찮고 반복적이야... 자동화 처리하는 거 어떨까?
 * 네덜란드 출신 개발자들이 lombok 이라는 외부 기능 만듦
 * 만들면서 돈을 벌려는 목적이 아니라 모든 자바 개발자들이 사용하게 해서 편리하게 개발하자!!! 오픈
 * 모든 자바 개발자들은 @Getter @Setter @ToString @NoArgsConstructor
 * @AllArgsConstructor 와 같은 줄임표현을 사용함으로써 아래와같이 번거롭게 코드를 사용할일 줄였으며
 * 스프링과 스프링부트 회사에서도 자바 프로젝트를 만들 때 롬복 회사에서 만든 기능 사용 권장
 *
 * Lombok 은 인도네시아 섬 이름
 * 자바(Java)섬 옆에 있는 Lombok 라는 의미로 지어진 회사이름
 */



/*
public class Users {
    // 필드 변수
    private int id;
    private String name;
    private String email;
    private LocalDateTime create_at;
    // 인텔리제이 단축키
    // Alt + Insert 생성자 만드는 단축키 생성
    // 생성자
    // 기본 생성자 / 필수로 Users 저장할 때 작성해야하는 값이 존재하지 않을 경우 사용
    public Users() {

    }
    // 파라미터 생성자 / User 정보를 가져오거나 저장할 때 작성해야하는 값이 필수로 존재할 경우 사용
    public Users(int id, String name, String email, LocalDateTime create_at){
        this.id = id;
        this.name = name;
        this.email = email;
        this.create_at = create_at;
    }
    // Getter / Setter
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public LocalDateTime getCreate_at() {
        return create_at;
    }
    public void setCreate_at(LocalDateTime create_at) {
        this.create_at = create_at;
    }
}
 */
