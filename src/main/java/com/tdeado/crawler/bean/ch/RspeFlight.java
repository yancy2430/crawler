package com.tdeado.crawler.bean.ch;

import java.util.List;

/**
 * 请求航线bean
 */
public class RspeFlight {


    /**
     * flightQueryResults : [{"oriCity":"深圳","arvCity":"长春","oriCityCode":"SZX","arvCityCode":"CGQ","oriTimeStyle":0,"oriDate":"2018-11-10","oriTime":"06:25","arvTime":"11:35","destTime":"2018-11-10 11:35:00","oriAirport":"宝安国际机场T3航站楼","arvAirport":"龙嘉国际机场T2航站楼","oriAirportCode":"SZX","arvAirportCode":"CGQ","flightNO":"9C8655","flightType":0,"segId":"1100213","aircraft":"A320","publicPrice":2750,"publicPriceDisplay":"民航公布价：￥2750","fuelFee":50,"airportFee":50,"oriTimeLocal":"2018-11-10 06:25:00","destTimeLocal":"2018-11-10 11:35:00","minCabinName":"R1","minCabinPrice":"980","minCabinPriceDisplay":"￥980","moneyClassDisplay":"￥","cabinLevel":"B","arvCity1":"南昌","companyId":0,"oriTimeType":"2018-11-10 06:25:00","routeId":1731,"routeAreaFlag":1,"routeFlag":1,"punctuality":0,"discount":0,"moreCabinBean":{"normCabinBeans":[{"cabinName":"R1","cabinPrice":"980","cabinPriceDisplay":"￥980","cabinDisName":"会员专享","cabinLevel":"B","youHuiNotice":[],"characters":["7KG手提行李|Y","无托运行李","最高返980积分","不可退改","手提行李限1件体积为20*30*40CM以内"],"remainTicketCount":9,"remainTicket":"9张","ifShowTax":false,"taxPriceDisplay":"￥1080","taxPrice":1080,"custRuleUrl":"https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22B%22%2C%22carbin%22%3A%22R1%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=980","discount":3.6,"discountDisplay":"3.6折","ifTeJia":false,"cabinNameShow":"R1舱"},{"cabinName":"R1","cabinPrice":"1040","cabinPriceDisplay":"￥1040","cabinDisName":"经济座","cabinLevel":"CGroup","youHuiNotice":[],"characters":["20KG总行李额|Y","最高返1040积分","手提行李限1件体积为20*30*40CM以内","不可退改"],"remainTicketCount":9,"remainTicket":"9张","ifShowTax":false,"taxPriceDisplay":"￥1140","taxPrice":1140,"custRuleUrl":"https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22CGroup%22%2C%22carbin%22%3A%22R1%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=1040","discount":3.8,"discountDisplay":"3.8折","ifTeJia":false,"combId":"1","combType":1,"cabinNameShow":"R1舱"}],"superCabinBeans":[{"subProdId":25,"subProdName":"商务经济座服务","subProdPrice":0,"saleSegId":10607406,"cabinName":"U","cabinPrice":"1260","cabinPriceDisplay":"￥1260","cabinDisName":"商务经济座","cabinLevel":"S","youHuiNotice":[],"characters":["25KG总行李额|Y","最高返1260积分","更灵活的退改规则","前舱宽敞座椅","精美餐点","手提行李限1件体积为20*30*40CM以内"],"remainTicketCount":-1,"ifShowTax":false,"taxPriceDisplay":"￥1360","taxPrice":1360,"custRuleUrl":"https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22S%22%2C%22carbin%22%3A%22U%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=1260","discount":4.6,"discountDisplay":"4.6折","ifTeJia":false,"cabinNameShow":"U舱"}]},"flightDateDisplay":"2018年11月10日","flightWeekDisplay":"星期六","airportAndFlueDisplay":"机建/燃油费 ￥50/50","priceDisplay":"￥980","saleOut":false,"serverFlag":false,"ifMinCabinShowTax":false,"minCabinTaxPrice":0,"ifTeJia":false,"destTimeBJ1":"2018-11-10 07:55:00","oriTimeBJ2":"2018-11-10 08:45:00"}]
     * minPriceResults : [{"date":"2018-11-09","price":"-1","totalPriceDisplay":"暂无航班","priceDisplay":"暂无航班"},{"date":"2018-11-10","price":"980","totalPriceDisplay":"￥1080","priceDisplay":"￥980"},{"date":"2018-11-11","price":"570","totalPriceDisplay":"￥670","priceDisplay":"￥570"},{"date":"2018-11-12","price":"570","totalPriceDisplay":"￥670","priceDisplay":"￥570"},{"date":"2018-11-13","price":"570","totalPriceDisplay":"￥670","priceDisplay":"￥570"},{"date":"2018-11-14","price":"570","totalPriceDisplay":"￥670","priceDisplay":"￥570"},{"date":"2018-11-15","price":"570","totalPriceDisplay":"￥670","priceDisplay":"￥570"},{"date":"2018-11-16","price":"570","totalPriceDisplay":"￥670","priceDisplay":"￥570"},{"date":"2018-11-17","price":"570","totalPriceDisplay":"￥670","priceDisplay":"￥570"}]
     * usedTime : 0
     * ifSuccess : Y
     */

    private int usedTime;
    private String ifSuccess;
    private List<FlightQueryResultsBean> flightQueryResults;
    private List<MinPriceResultsBean> minPriceResults;

    public int getUsedTime() {
        return usedTime;
    }

    public void setUsedTime(int usedTime) {
        this.usedTime = usedTime;
    }

    public String getIfSuccess() {
        return ifSuccess;
    }

    public void setIfSuccess(String ifSuccess) {
        this.ifSuccess = ifSuccess;
    }

    public List<FlightQueryResultsBean> getFlightQueryResults() {
        return flightQueryResults;
    }

    public void setFlightQueryResults(List<FlightQueryResultsBean> flightQueryResults) {
        this.flightQueryResults = flightQueryResults;
    }

    public List<MinPriceResultsBean> getMinPriceResults() {
        return minPriceResults;
    }

    public void setMinPriceResults(List<MinPriceResultsBean> minPriceResults) {
        this.minPriceResults = minPriceResults;
    }

    public static class FlightQueryResultsBean {
        /**
         * oriCity : 深圳
         * arvCity : 长春
         * oriCityCode : SZX
         * arvCityCode : CGQ
         * oriTimeStyle : 0
         * oriDate : 2018-11-10
         * oriTime : 06:25
         * arvTime : 11:35
         * destTime : 2018-11-10 11:35:00
         * oriAirport : 宝安国际机场T3航站楼
         * arvAirport : 龙嘉国际机场T2航站楼
         * oriAirportCode : SZX
         * arvAirportCode : CGQ
         * flightNO : 9C8655
         * flightType : 0
         * segId : 1100213
         * aircraft : A320
         * publicPrice : 2750
         * publicPriceDisplay : 民航公布价：￥2750
         * fuelFee : 50
         * airportFee : 50
         * oriTimeLocal : 2018-11-10 06:25:00
         * destTimeLocal : 2018-11-10 11:35:00
         * minCabinName : R1
         * minCabinPrice : 980
         * minCabinPriceDisplay : ￥980
         * moneyClassDisplay : ￥
         * cabinLevel : B
         * arvCity1 : 南昌
         * companyId : 0
         * oriTimeType : 2018-11-10 06:25:00
         * routeId : 1731
         * routeAreaFlag : 1
         * routeFlag : 1
         * punctuality : 0
         * discount : 0
         * moreCabinBean : {"normCabinBeans":[{"cabinName":"R1","cabinPrice":"980","cabinPriceDisplay":"￥980","cabinDisName":"会员专享","cabinLevel":"B","youHuiNotice":[],"characters":["7KG手提行李|Y","无托运行李","最高返980积分","不可退改","手提行李限1件体积为20*30*40CM以内"],"remainTicketCount":9,"remainTicket":"9张","ifShowTax":false,"taxPriceDisplay":"￥1080","taxPrice":1080,"custRuleUrl":"https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22B%22%2C%22carbin%22%3A%22R1%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=980","discount":3.6,"discountDisplay":"3.6折","ifTeJia":false,"cabinNameShow":"R1舱"},{"cabinName":"R1","cabinPrice":"1040","cabinPriceDisplay":"￥1040","cabinDisName":"经济座","cabinLevel":"CGroup","youHuiNotice":[],"characters":["20KG总行李额|Y","最高返1040积分","手提行李限1件体积为20*30*40CM以内","不可退改"],"remainTicketCount":9,"remainTicket":"9张","ifShowTax":false,"taxPriceDisplay":"￥1140","taxPrice":1140,"custRuleUrl":"https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22CGroup%22%2C%22carbin%22%3A%22R1%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=1040","discount":3.8,"discountDisplay":"3.8折","ifTeJia":false,"combId":"1","combType":1,"cabinNameShow":"R1舱"}],"superCabinBeans":[{"subProdId":25,"subProdName":"商务经济座服务","subProdPrice":0,"saleSegId":10607406,"cabinName":"U","cabinPrice":"1260","cabinPriceDisplay":"￥1260","cabinDisName":"商务经济座","cabinLevel":"S","youHuiNotice":[],"characters":["25KG总行李额|Y","最高返1260积分","更灵活的退改规则","前舱宽敞座椅","精美餐点","手提行李限1件体积为20*30*40CM以内"],"remainTicketCount":-1,"ifShowTax":false,"taxPriceDisplay":"￥1360","taxPrice":1360,"custRuleUrl":"https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22S%22%2C%22carbin%22%3A%22U%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=1260","discount":4.6,"discountDisplay":"4.6折","ifTeJia":false,"cabinNameShow":"U舱"}]}
         * flightDateDisplay : 2018年11月10日
         * flightWeekDisplay : 星期六
         * airportAndFlueDisplay : 机建/燃油费 ￥50/50
         * priceDisplay : ￥980
         * saleOut : false
         * serverFlag : false
         * ifMinCabinShowTax : false
         * minCabinTaxPrice : 0
         * ifTeJia : false
         * destTimeBJ1 : 2018-11-10 07:55:00
         * oriTimeBJ2 : 2018-11-10 08:45:00
         */

        private String oriCity;
        private String arvCity;
        private String oriCityCode;
        private String arvCityCode;
        private int oriTimeStyle;
        private String oriDate;
        private String oriTime;
        private String arvTime;
        private String destTime;
        private String oriAirport;
        private String arvAirport;
        private String oriAirportCode;
        private String arvAirportCode;
        private String flightNO;
        private int flightType;
        private String segId;
        private String aircraft;
        private int publicPrice;
        private String publicPriceDisplay;
        private int fuelFee;
        private int airportFee;
        private String oriTimeLocal;
        private String destTimeLocal;
        private String minCabinName;
        private String minCabinPrice;
        private String minCabinPriceDisplay;
        private String moneyClassDisplay;
        private String cabinLevel;
        private String arvCity1;
        private int companyId;
        private String oriTimeType;
        private int routeId;
        private int routeAreaFlag;
        private int routeFlag;
        private int punctuality;
        private int discount;
        private MoreCabinBeanBean moreCabinBean;
        private String flightDateDisplay;
        private String flightWeekDisplay;
        private String airportAndFlueDisplay;
        private String priceDisplay;
        private boolean saleOut;
        private boolean serverFlag;
        private boolean ifMinCabinShowTax;
        private int minCabinTaxPrice;
        private boolean ifTeJia;
        private String destTimeBJ1;
        private String oriTimeBJ2;

        public String getOriCity() {
            return oriCity;
        }

        public void setOriCity(String oriCity) {
            this.oriCity = oriCity;
        }

        public String getArvCity() {
            return arvCity;
        }

        public void setArvCity(String arvCity) {
            this.arvCity = arvCity;
        }

        public String getOriCityCode() {
            return oriCityCode;
        }

        public void setOriCityCode(String oriCityCode) {
            this.oriCityCode = oriCityCode;
        }

        public String getArvCityCode() {
            return arvCityCode;
        }

        public void setArvCityCode(String arvCityCode) {
            this.arvCityCode = arvCityCode;
        }

        public int getOriTimeStyle() {
            return oriTimeStyle;
        }

        public void setOriTimeStyle(int oriTimeStyle) {
            this.oriTimeStyle = oriTimeStyle;
        }

        public String getOriDate() {
            return oriDate;
        }

        public void setOriDate(String oriDate) {
            this.oriDate = oriDate;
        }

        public String getOriTime() {
            return oriTime;
        }

        public void setOriTime(String oriTime) {
            this.oriTime = oriTime;
        }

        public String getArvTime() {
            return arvTime;
        }

        public void setArvTime(String arvTime) {
            this.arvTime = arvTime;
        }

        public String getDestTime() {
            return destTime;
        }

        public void setDestTime(String destTime) {
            this.destTime = destTime;
        }

        public String getOriAirport() {
            return oriAirport;
        }

        public void setOriAirport(String oriAirport) {
            this.oriAirport = oriAirport;
        }

        public String getArvAirport() {
            return arvAirport;
        }

        public void setArvAirport(String arvAirport) {
            this.arvAirport = arvAirport;
        }

        public String getOriAirportCode() {
            return oriAirportCode;
        }

        public void setOriAirportCode(String oriAirportCode) {
            this.oriAirportCode = oriAirportCode;
        }

        public String getArvAirportCode() {
            return arvAirportCode;
        }

        public void setArvAirportCode(String arvAirportCode) {
            this.arvAirportCode = arvAirportCode;
        }

        public String getFlightNO() {
            return flightNO;
        }

        public void setFlightNO(String flightNO) {
            this.flightNO = flightNO;
        }

        public int getFlightType() {
            return flightType;
        }

        public void setFlightType(int flightType) {
            this.flightType = flightType;
        }

        public String getSegId() {
            return segId;
        }

        public void setSegId(String segId) {
            this.segId = segId;
        }

        public String getAircraft() {
            return aircraft;
        }

        public void setAircraft(String aircraft) {
            this.aircraft = aircraft;
        }

        public int getPublicPrice() {
            return publicPrice;
        }

        public void setPublicPrice(int publicPrice) {
            this.publicPrice = publicPrice;
        }

        public String getPublicPriceDisplay() {
            return publicPriceDisplay;
        }

        public void setPublicPriceDisplay(String publicPriceDisplay) {
            this.publicPriceDisplay = publicPriceDisplay;
        }

        public int getFuelFee() {
            return fuelFee;
        }

        public void setFuelFee(int fuelFee) {
            this.fuelFee = fuelFee;
        }

        public int getAirportFee() {
            return airportFee;
        }

        public void setAirportFee(int airportFee) {
            this.airportFee = airportFee;
        }

        public String getOriTimeLocal() {
            return oriTimeLocal;
        }

        public void setOriTimeLocal(String oriTimeLocal) {
            this.oriTimeLocal = oriTimeLocal;
        }

        public String getDestTimeLocal() {
            return destTimeLocal;
        }

        public void setDestTimeLocal(String destTimeLocal) {
            this.destTimeLocal = destTimeLocal;
        }

        public String getMinCabinName() {
            return minCabinName;
        }

        public void setMinCabinName(String minCabinName) {
            this.minCabinName = minCabinName;
        }

        public String getMinCabinPrice() {
            return minCabinPrice;
        }

        public void setMinCabinPrice(String minCabinPrice) {
            this.minCabinPrice = minCabinPrice;
        }

        public String getMinCabinPriceDisplay() {
            return minCabinPriceDisplay;
        }

        public void setMinCabinPriceDisplay(String minCabinPriceDisplay) {
            this.minCabinPriceDisplay = minCabinPriceDisplay;
        }

        public String getMoneyClassDisplay() {
            return moneyClassDisplay;
        }

        public void setMoneyClassDisplay(String moneyClassDisplay) {
            this.moneyClassDisplay = moneyClassDisplay;
        }

        public String getCabinLevel() {
            return cabinLevel;
        }

        public void setCabinLevel(String cabinLevel) {
            this.cabinLevel = cabinLevel;
        }

        public String getArvCity1() {
            return arvCity1;
        }

        public void setArvCity1(String arvCity1) {
            this.arvCity1 = arvCity1;
        }

        public int getCompanyId() {
            return companyId;
        }

        public void setCompanyId(int companyId) {
            this.companyId = companyId;
        }

        public String getOriTimeType() {
            return oriTimeType;
        }

        public void setOriTimeType(String oriTimeType) {
            this.oriTimeType = oriTimeType;
        }

        public int getRouteId() {
            return routeId;
        }

        public void setRouteId(int routeId) {
            this.routeId = routeId;
        }

        public int getRouteAreaFlag() {
            return routeAreaFlag;
        }

        public void setRouteAreaFlag(int routeAreaFlag) {
            this.routeAreaFlag = routeAreaFlag;
        }

        public int getRouteFlag() {
            return routeFlag;
        }

        public void setRouteFlag(int routeFlag) {
            this.routeFlag = routeFlag;
        }

        public int getPunctuality() {
            return punctuality;
        }

        public void setPunctuality(int punctuality) {
            this.punctuality = punctuality;
        }

        public int getDiscount() {
            return discount;
        }

        public void setDiscount(int discount) {
            this.discount = discount;
        }

        public MoreCabinBeanBean getMoreCabinBean() {
            return moreCabinBean;
        }

        public void setMoreCabinBean(MoreCabinBeanBean moreCabinBean) {
            this.moreCabinBean = moreCabinBean;
        }

        public String getFlightDateDisplay() {
            return flightDateDisplay;
        }

        public void setFlightDateDisplay(String flightDateDisplay) {
            this.flightDateDisplay = flightDateDisplay;
        }

        public String getFlightWeekDisplay() {
            return flightWeekDisplay;
        }

        public void setFlightWeekDisplay(String flightWeekDisplay) {
            this.flightWeekDisplay = flightWeekDisplay;
        }

        public String getAirportAndFlueDisplay() {
            return airportAndFlueDisplay;
        }

        public void setAirportAndFlueDisplay(String airportAndFlueDisplay) {
            this.airportAndFlueDisplay = airportAndFlueDisplay;
        }

        public String getPriceDisplay() {
            return priceDisplay;
        }

        public void setPriceDisplay(String priceDisplay) {
            this.priceDisplay = priceDisplay;
        }

        public boolean isSaleOut() {
            return saleOut;
        }

        public void setSaleOut(boolean saleOut) {
            this.saleOut = saleOut;
        }

        public boolean isServerFlag() {
            return serverFlag;
        }

        public void setServerFlag(boolean serverFlag) {
            this.serverFlag = serverFlag;
        }

        public boolean isIfMinCabinShowTax() {
            return ifMinCabinShowTax;
        }

        public void setIfMinCabinShowTax(boolean ifMinCabinShowTax) {
            this.ifMinCabinShowTax = ifMinCabinShowTax;
        }

        public int getMinCabinTaxPrice() {
            return minCabinTaxPrice;
        }

        public void setMinCabinTaxPrice(int minCabinTaxPrice) {
            this.minCabinTaxPrice = minCabinTaxPrice;
        }

        public boolean isIfTeJia() {
            return ifTeJia;
        }

        public void setIfTeJia(boolean ifTeJia) {
            this.ifTeJia = ifTeJia;
        }

        public String getDestTimeBJ1() {
            return destTimeBJ1;
        }

        public void setDestTimeBJ1(String destTimeBJ1) {
            this.destTimeBJ1 = destTimeBJ1;
        }

        public String getOriTimeBJ2() {
            return oriTimeBJ2;
        }

        public void setOriTimeBJ2(String oriTimeBJ2) {
            this.oriTimeBJ2 = oriTimeBJ2;
        }

        public static class MoreCabinBeanBean {
            private List<NormCabinBeansBean> normCabinBeans;
            private List<SuperCabinBeansBean> superCabinBeans;

            public List<NormCabinBeansBean> getNormCabinBeans() {
                return normCabinBeans;
            }

            public void setNormCabinBeans(List<NormCabinBeansBean> normCabinBeans) {
                this.normCabinBeans = normCabinBeans;
            }

            public List<SuperCabinBeansBean> getSuperCabinBeans() {
                return superCabinBeans;
            }

            public void setSuperCabinBeans(List<SuperCabinBeansBean> superCabinBeans) {
                this.superCabinBeans = superCabinBeans;
            }

            public static class NormCabinBeansBean {
                /**
                 * cabinName : R1
                 * cabinPrice : 980
                 * cabinPriceDisplay : ￥980
                 * cabinDisName : 会员专享
                 * cabinLevel : B
                 * youHuiNotice : []
                 * characters : ["7KG手提行李|Y","无托运行李","最高返980积分","不可退改","手提行李限1件体积为20*30*40CM以内"]
                 * remainTicketCount : 9
                 * remainTicket : 9张
                 * ifShowTax : false
                 * taxPriceDisplay : ￥1080
                 * taxPrice : 1080
                 * custRuleUrl : https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22B%22%2C%22carbin%22%3A%22R1%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=980
                 * discount : 3.6
                 * discountDisplay : 3.6折
                 * ifTeJia : false
                 * cabinNameShow : R1舱
                 * combId : 1
                 * combType : 1
                 */

                private String cabinName;
                private String cabinPrice;
                private String cabinPriceDisplay;
                private String cabinDisName;
                private String cabinLevel;
                private int remainTicketCount;
                private String remainTicket;
                private boolean ifShowTax;
                private String taxPriceDisplay;
                private int taxPrice;
                private String custRuleUrl;
                private double discount;
                private String discountDisplay;
                private boolean ifTeJia;
                private String cabinNameShow;
                private String combId;
                private int combType;
                private List<?> youHuiNotice;
                private List<String> characters;

                public String getCabinName() {
                    return cabinName;
                }

                public void setCabinName(String cabinName) {
                    this.cabinName = cabinName;
                }

                public String getCabinPrice() {
                    return cabinPrice;
                }

                public void setCabinPrice(String cabinPrice) {
                    this.cabinPrice = cabinPrice;
                }

                public String getCabinPriceDisplay() {
                    return cabinPriceDisplay;
                }

                public void setCabinPriceDisplay(String cabinPriceDisplay) {
                    this.cabinPriceDisplay = cabinPriceDisplay;
                }

                public String getCabinDisName() {
                    return cabinDisName;
                }

                public void setCabinDisName(String cabinDisName) {
                    this.cabinDisName = cabinDisName;
                }

                public String getCabinLevel() {
                    return cabinLevel;
                }

                public void setCabinLevel(String cabinLevel) {
                    this.cabinLevel = cabinLevel;
                }

                public int getRemainTicketCount() {
                    return remainTicketCount;
                }

                public void setRemainTicketCount(int remainTicketCount) {
                    this.remainTicketCount = remainTicketCount;
                }

                public String getRemainTicket() {
                    return remainTicket;
                }

                public void setRemainTicket(String remainTicket) {
                    this.remainTicket = remainTicket;
                }

                public boolean isIfShowTax() {
                    return ifShowTax;
                }

                public void setIfShowTax(boolean ifShowTax) {
                    this.ifShowTax = ifShowTax;
                }

                public String getTaxPriceDisplay() {
                    return taxPriceDisplay;
                }

                public void setTaxPriceDisplay(String taxPriceDisplay) {
                    this.taxPriceDisplay = taxPriceDisplay;
                }

                public int getTaxPrice() {
                    return taxPrice;
                }

                public void setTaxPrice(int taxPrice) {
                    this.taxPrice = taxPrice;
                }

                public String getCustRuleUrl() {
                    return custRuleUrl;
                }

                public void setCustRuleUrl(String custRuleUrl) {
                    this.custRuleUrl = custRuleUrl;
                }

                public double getDiscount() {
                    return discount;
                }

                public void setDiscount(double discount) {
                    this.discount = discount;
                }

                public String getDiscountDisplay() {
                    return discountDisplay;
                }

                public void setDiscountDisplay(String discountDisplay) {
                    this.discountDisplay = discountDisplay;
                }

                public boolean isIfTeJia() {
                    return ifTeJia;
                }

                public void setIfTeJia(boolean ifTeJia) {
                    this.ifTeJia = ifTeJia;
                }

                public String getCabinNameShow() {
                    return cabinNameShow;
                }

                public void setCabinNameShow(String cabinNameShow) {
                    this.cabinNameShow = cabinNameShow;
                }

                public String getCombId() {
                    return combId;
                }

                public void setCombId(String combId) {
                    this.combId = combId;
                }

                public int getCombType() {
                    return combType;
                }

                public void setCombType(int combType) {
                    this.combType = combType;
                }

                public List<?> getYouHuiNotice() {
                    return youHuiNotice;
                }

                public void setYouHuiNotice(List<?> youHuiNotice) {
                    this.youHuiNotice = youHuiNotice;
                }

                public List<String> getCharacters() {
                    return characters;
                }

                public void setCharacters(List<String> characters) {
                    this.characters = characters;
                }
            }

            public static class SuperCabinBeansBean {
                /**
                 * subProdId : 25
                 * subProdName : 商务经济座服务
                 * subProdPrice : 0
                 * saleSegId : 10607406
                 * cabinName : U
                 * cabinPrice : 1260
                 * cabinPriceDisplay : ￥1260
                 * cabinDisName : 商务经济座
                 * cabinLevel : S
                 * youHuiNotice : []
                 * characters : ["25KG总行李额|Y","最高返1260积分","更灵活的退改规则","前舱宽敞座椅","精美餐点","手提行李限1件体积为20*30*40CM以内"]
                 * remainTicketCount : -1
                 * ifShowTax : false
                 * taxPriceDisplay : ￥1360
                 * taxPrice : 1360
                 * custRuleUrl : https://app.ch.com/ECommercePlatform/m/queryFltAndHtl/newCustRule?data=%7B%22segment_id%22%3A%221100213%22%2C%22seat_type%22%3A%22S%22%2C%22carbin%22%3A%22U%22%2C%22showtype%22%3A%22125%22%2C%22routeAreaFlag%22%3A%221%22%2C%22lang%22%3A%22zh_CN%22%2C%22usedTime%22%3A0%7D&points=1260
                 * discount : 4.6
                 * discountDisplay : 4.6折
                 * ifTeJia : false
                 * cabinNameShow : U舱
                 */

                private int subProdId;
                private String subProdName;
                private int subProdPrice;
                private int saleSegId;
                private String cabinName;
                private String cabinPrice;
                private String cabinPriceDisplay;
                private String cabinDisName;
                private String cabinLevel;
                private int remainTicketCount;
                private boolean ifShowTax;
                private String taxPriceDisplay;
                private int taxPrice;
                private String custRuleUrl;
                private double discount;
                private String discountDisplay;
                private boolean ifTeJia;
                private String cabinNameShow;
                private List<?> youHuiNotice;
                private List<String> characters;

                public int getSubProdId() {
                    return subProdId;
                }

                public void setSubProdId(int subProdId) {
                    this.subProdId = subProdId;
                }

                public String getSubProdName() {
                    return subProdName;
                }

                public void setSubProdName(String subProdName) {
                    this.subProdName = subProdName;
                }

                public int getSubProdPrice() {
                    return subProdPrice;
                }

                public void setSubProdPrice(int subProdPrice) {
                    this.subProdPrice = subProdPrice;
                }

                public int getSaleSegId() {
                    return saleSegId;
                }

                public void setSaleSegId(int saleSegId) {
                    this.saleSegId = saleSegId;
                }

                public String getCabinName() {
                    return cabinName;
                }

                public void setCabinName(String cabinName) {
                    this.cabinName = cabinName;
                }

                public String getCabinPrice() {
                    return cabinPrice;
                }

                public void setCabinPrice(String cabinPrice) {
                    this.cabinPrice = cabinPrice;
                }

                public String getCabinPriceDisplay() {
                    return cabinPriceDisplay;
                }

                public void setCabinPriceDisplay(String cabinPriceDisplay) {
                    this.cabinPriceDisplay = cabinPriceDisplay;
                }

                public String getCabinDisName() {
                    return cabinDisName;
                }

                public void setCabinDisName(String cabinDisName) {
                    this.cabinDisName = cabinDisName;
                }

                public String getCabinLevel() {
                    return cabinLevel;
                }

                public void setCabinLevel(String cabinLevel) {
                    this.cabinLevel = cabinLevel;
                }

                public int getRemainTicketCount() {
                    return remainTicketCount;
                }

                public void setRemainTicketCount(int remainTicketCount) {
                    this.remainTicketCount = remainTicketCount;
                }

                public boolean isIfShowTax() {
                    return ifShowTax;
                }

                public void setIfShowTax(boolean ifShowTax) {
                    this.ifShowTax = ifShowTax;
                }

                public String getTaxPriceDisplay() {
                    return taxPriceDisplay;
                }

                public void setTaxPriceDisplay(String taxPriceDisplay) {
                    this.taxPriceDisplay = taxPriceDisplay;
                }

                public int getTaxPrice() {
                    return taxPrice;
                }

                public void setTaxPrice(int taxPrice) {
                    this.taxPrice = taxPrice;
                }

                public String getCustRuleUrl() {
                    return custRuleUrl;
                }

                public void setCustRuleUrl(String custRuleUrl) {
                    this.custRuleUrl = custRuleUrl;
                }

                public double getDiscount() {
                    return discount;
                }

                public void setDiscount(double discount) {
                    this.discount = discount;
                }

                public String getDiscountDisplay() {
                    return discountDisplay;
                }

                public void setDiscountDisplay(String discountDisplay) {
                    this.discountDisplay = discountDisplay;
                }

                public boolean isIfTeJia() {
                    return ifTeJia;
                }

                public void setIfTeJia(boolean ifTeJia) {
                    this.ifTeJia = ifTeJia;
                }

                public String getCabinNameShow() {
                    return cabinNameShow;
                }

                public void setCabinNameShow(String cabinNameShow) {
                    this.cabinNameShow = cabinNameShow;
                }

                public List<?> getYouHuiNotice() {
                    return youHuiNotice;
                }

                public void setYouHuiNotice(List<?> youHuiNotice) {
                    this.youHuiNotice = youHuiNotice;
                }

                public List<String> getCharacters() {
                    return characters;
                }

                public void setCharacters(List<String> characters) {
                    this.characters = characters;
                }
            }
        }
    }

    public static class MinPriceResultsBean {
        /**
         * date : 2018-11-09
         * price : -1
         * totalPriceDisplay : 暂无航班
         * priceDisplay : 暂无航班
         */

        private String date;
        private String price;
        private String totalPriceDisplay;
        private String priceDisplay;

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public String getTotalPriceDisplay() {
            return totalPriceDisplay;
        }

        public void setTotalPriceDisplay(String totalPriceDisplay) {
            this.totalPriceDisplay = totalPriceDisplay;
        }

        public String getPriceDisplay() {
            return priceDisplay;
        }

        public void setPriceDisplay(String priceDisplay) {
            this.priceDisplay = priceDisplay;
        }
    }
}
