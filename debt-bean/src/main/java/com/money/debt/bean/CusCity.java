package com.money.debt.bean;

public class CusCity {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_city.city_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private Long cityId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_city.city_prv_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private Long cityPrvId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_city.city_name
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String cityName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cus_city.city_isenabled
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    private String cityIsenabled;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_city.city_id
     *
     * @return the value of cus_city.city_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public Long getCityId() {
        return cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_city.city_id
     *
     * @param cityId the value for cus_city.city_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_city.city_prv_id
     *
     * @return the value of cus_city.city_prv_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public Long getCityPrvId() {
        return cityPrvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_city.city_prv_id
     *
     * @param cityPrvId the value for cus_city.city_prv_id
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setCityPrvId(Long cityPrvId) {
        this.cityPrvId = cityPrvId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_city.city_name
     *
     * @return the value of cus_city.city_name
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_city.city_name
     *
     * @param cityName the value for cus_city.city_name
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setCityName(String cityName) {
        this.cityName = cityName == null ? null : cityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cus_city.city_isenabled
     *
     * @return the value of cus_city.city_isenabled
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public String getCityIsenabled() {
        return cityIsenabled;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cus_city.city_isenabled
     *
     * @param cityIsenabled the value for cus_city.city_isenabled
     *
     * @mbggenerated Sat May 12 13:09:34 CST 2018
     */
    public void setCityIsenabled(String cityIsenabled) {
        this.cityIsenabled = cityIsenabled == null ? null : cityIsenabled.trim();
    }
}