package com.example.demo.oop.domain;

/**
 * packageName: com.example.demo.oop.domain
 * fileName   : GalPhone
 * author     : seoseongmin
 * date       : 2022-02-09
 * desc       :
 * ================================
 * DATE        AUTHOR        NOTE
 * ================================
 * 2022-02-09     seoseongmin        최초 생성
 * 삼성은 신형 폰은 절대 아이포닝 아니라고 했다.
 * 갤럭시라고 하고, 신형폰은 페이 기능을 지원한다고 했다.
 */
public class GalPhone extends IPhone{
    public final static String KIND = "갤럭시";
    private String pay;

    public GalPhone(String company){
        super(company);
    }
    public String getPay() {
        return pay;
    }

    public void setPay(String pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return String.format("%s 에서 만든 %s 제품을 사용해서 %s 로 결제한다.",super.getCompany(),
                KIND,pay);
    }
}
