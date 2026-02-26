package org.example;
/*
controller 백엔드와 프론트엔드를 연결하는 로직

@Controller : jsp 나 html 로 작성되어 있는 화면을 소비자에게 보여줄 때 사용
  @GetMapping("소비자가 접속할 주소 경로")
  public String 기능명칭(Model model) {
      model.addAttribute("jsp 화면에서 사용할 변수이름", "jsp 화면에서 사용될 데이터")
      return "jsp 파일 이름"
  }


@RestController : 오직 db 에서 조회된 결과의 데이터만 전달 / html 이나 jsp 파일 XXX
  @GetMapping("소비자가 접속할 주소 경로")
  public String 기능명칭() {
      return "DB 에서 가져온 데이터를 프론트엔드에 전달"
  }

 */
public class Java문법 {
    /*
    접근제한자
    public default protected private

    메서드 = 기능
     1. 생성자
     2. 리턴이 존재하는 기능
     3. 리턴이 존재하지 않는 기능
     4. getter setter
     */

    // 오버라이드 오버라이딩
    // 오버로드(Overload)
    // 같은 이름의 메서드(=기능)을 여러 개 만드는 것
    // 같은 이름을 쓰더라도 매개변수(=파라미터)가 달라야한다.
    /*
    * 매개변수(=파라미터)
    * 매 = 중매   매
    * 개 = 개입할 개
    * 변 = 변할   변
    * 수 = 셀    수
    * 중간에 개입하여 결과를 변경하는 공간의 명칭
    *
    * 변수 = 특정 공간의 명칭으로 내부 데이터는 변할 수 있다.
    * */
    public void 계산기기능(){
        System.out.println("계산을 한다.");
    }
    //              a 와 b에 어떠한 값이 들어가는지에 따라서
    // return 계산기기능이 마지막으로 전달하는 결과가 변경
    public int 계산기기능(int a, int b){
        System.out.println("a와 b의 수를 더한다.");
        return  a+b;
    }
}
