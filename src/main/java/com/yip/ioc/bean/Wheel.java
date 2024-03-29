package com.yip.ioc.bean;

/**
 * @author Vincent-Yip
 * @date 2019/8/13 19:03
 */
public class Wheel {

    private String brand;
    private String specification ;


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "brand='" + brand + '\'' +
                ", specification='" + specification + '\'' +
                '}';
    }
}
