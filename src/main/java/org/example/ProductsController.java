package org.example;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller // jsp 파일과 /주소를 연결하는 로직
@RequiredArgsConstructor
public class ProductsController {

    // 이 문서 안에서만 사용될 것이며, productsService 공간의 데이터를
    // 아래에서 변경하지 못하도록 final 상수 처리 할 것이다.
    private final ProductsService productsService;

    // http://localhost:8080/products
    // 위 주소로 이동하면 views/productList.jsp 에서 작성한 코딩을 확인할 수 있어요.

    // 인터넷으로 우리가 확인할 경로는 아래와 같아요 ^^
    @GetMapping("/products") // http://localhost:8080/products
    public String 모든상품조회페이지(Model jsp로전달하기){
        List<Products> 전체상품들 = productsService.전제상품조회();
        jsp로전달하기.addAttribute("productList",전체상품들);
        return "productList"; // productList.jsp 파일에서 결과를 확인하겠어요.
    }
}
