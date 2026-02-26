package org.example;

public class MySQL세팅 {
    /*
        -- 윈도우 명령어 ctrl + a 전체 선택   ctrl + c 복사
        -- mySQL SQL 명령어와 Oracle SQL 명령어 동일
        -- mSQL 은 우리가 접속할 DB 선택
        -- 명령어 한줄 실행 CTRL + Enter
        USE mydb;


        -- 테이블 생성
        CREATE TABLE users (
        id iNT AUTO_INCREMENT PRIMARY KEY,
        name VARCHAR(50),
        email VARCHAR(100),
        create_at DATETIME DEFAULT NOW()
        );

        oracle 과 mysql 차이점

               oracle                   mysql
                유료                     무료
              고성능 DB           중소규모 범용 DB
        은행, 대기업, 공공기관  스타트업, 웹서비스, 개인


      oracle 에서 다른 버전으로 나온 mysql 은 oracle 이랑 사용하는 단어 살짝 다름
                    oracle                   mysql
      자동증가      SEQUENCE              AUTO_INCREMENT
      현재시간       SYSDATE                 NOW()
      페이징         ROWNUM                 LIMIT
      문자열합치기     ||                  CONCAT()
      NULL 처리      NVL()                IFNULL()

      ⭐⭐⭐⭐⭐
      정수         NUMBER(10)              INT
      작은정수     NUMBER(5)              SMALLINT
      큰정수       NUMBER(19)             BIGINT
      소수        NUMBER(10,2)           DECIMAL(10,2)
      가변길이문자 VARCHAR2(100)          VARCHAR(100)     2를 안붙인다.
      ==> 오라클은 기존에 보유하고 있는 회사들에서 VARCHAR 라는 이름을 사용하는
          회사들의 DB 자료형 변형이 있으면 기존 DB 에 영향을 끼치므로
          Version2로 VARCHAR2 라는 자료형을 만듦

         MYSQL 생성할 때는 위와 같은 경우를 참고해서 VARCHAR 자체를
         ORACLE VARCHAR2 자료형을 참고하여 만들어 VARCHAR 만으로 사용할 수 있게 만듦

      날짜/시간   DATE 모두 사용           DATETIME 등 종류를 세분화

    SQL을 만들 때 주로 사용하는 것은 VARCHAR
    ===> 이름, 이메일, 주소 게시글제목, 내용 등

    SQL을 만들 때 CHAR 를 사용하는 경우
    ===> 주민번호(항상 14자리), 휴대폰번호(항상 11자리), 성별1자리(F,M), 한국우편번호(5자리)


      가변 VARCHAR 255 자리로 설정하더라도 데이터 용량 크기에 따라 크기가 유동적으로 변함
                       보통 255나 최대 자리로 설정한다음 사용
      고정 CHAR        길이가 항상 일정하기 때문에, 길이가 고정적인 데이터 사용
                       가변보다 빠름

      VARCHAR는 실제 길이를 매번 계산해야하지만 CHAR 는 고정 길이이기 때문에
      바로 공간의 크기를 찾을 수 있어 조회가 빠름
     */
}
