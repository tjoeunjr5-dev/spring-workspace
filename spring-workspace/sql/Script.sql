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


-- 데이터 추가
-- 홍길동 gildong@gmail.com 현재시간 추가

INSERT INTO users (name, email, create_at)
VALUES ('홍길동','gildong@email.com', NOW());
--      #{백엔드에서 홍길동이 저장된 변수공간의 명칭}, #{백엔드에서 이메일이 저장된 변수공간의 명칭}, 현재시간

-- 매번 수기로 홍길동, 김영희, 박철수 를 작성할 수 없으므로
-- 프론트엔드 변수 공간에서  백엔드 변수 공간으로 데이터   전달
--     백엔드 변수 공간에서 프론드엔드에서 전달한 데이터를 전달받아 DB 컬럼에 저장


-- users 테이블 보기
SELECT * FROM users;





INSERT INTO users (name, email, create_at)
VALUES ('성춘향','chunhyang@naver.com', NOW());

INSERT INTO users (name, email, create_at)
VALUES ('장보고','jangbogo@daum.net', NOW());




-- *****************************
-- 테이블 생성 규칙
-- CREATE TABLE 테이블이름(
--  컬럼이름   자료형  컬럼에 대한 추가 설정 스페이스바로 구분지어 추가,
--   );
-- *****************************

-- SQL 대소문자 의미 없음  컬럼에서 단어를 구분할 때 _ 를 사용해서 구분
-- company_shopping_id
-- 대문자 : SQL에서 지정한 예약단어
-- 소문자 : 개발자가 의미를 부여한 명칭  테이블이름, 컬럼명 에서 주로 사용
CREATE TABLE users (
id iNT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(50),
email VARCHAR(100),
create_at DATETIME DEFAULT NOW()
);

-- create TABEL 에서 주석을 작성할 경우에는 맨 왼쪽에 붙여서 작성
-- 공백과 함께 주석이 작성될 경우에는 코드로 인식되어 오류 발생할 가능성이 있다.
CREATE TABLE products (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(100),
	price INT,
	stock INT,
	created_at DATETIME DEFAULT NOW()
);





-- 상품 3개 INSERT
--  1. 노트북  / 1500000원 / 재고 10개
--  2. 마우스  / 35000원   / 재고 50개
--  3. 키보드  / 75000원   / 재고 30개
  
-- ORACLE 은 다중 저장이 안됨
-- MYSQL  은 다중 저장이 가능 
INSERT INTO products (name, price, stock, created_at)
VALUES('노트북', 1500000, 10, NOW()),
	  ('마우스',   35000, 50, NOW()),
	  ('키보드',   75000, 30, NOW());





SELECT *
FROM products
WHERE id = 5;







