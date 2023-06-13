package com.atguigu05._super.exer2;

/**
 * ClassName: CylinderTest
 * Description:
 *
 * @Author 尚硅谷-宋红康
 * @Create 10:04
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cy = new Cylinder();

        cy.setRadius(2.3);
        cy.setLength(1.4);

        System.out.println("圆柱的体积为：" + cy.findVolume());

        System.out.println("圆柱的表面积：" + cy.findArea());

    }
}
