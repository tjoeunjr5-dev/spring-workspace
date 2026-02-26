package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
아래 클래스는 Spring 으로 연결된 실행이 아님
단순 자바 코드 실행용 로직
public class App {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
}
 */
@SpringBootApplication
public class App {
    public static void main( String[] args ) {
        SpringApplication.run(App.class,args);
    }
}

