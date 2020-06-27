package com.zy.fund.beans;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Android Studio.
 * User: Administrator
 * Date: 2020/6/25 0025
 * Time: 20:25
 */
public class Product {

    /**
     * resultcode : 200
     * reason : SUCCESSED!
     * result : [{"1":{"code":"600519","name":"贵州茅台","fundnum":"1240","total":"5,782","change":"-76","totalcap":"6423901.99","accrate":"4.60","changesta":"-0.06","time":"20200331"},"2":{"code":"600276","name":"恒瑞医药","fundnum":"870","total":"33,777","change":"629","totalcap":"3108511.95","accrate":"7.65","changesta":"+0.12","time":"20200331"},"3":{"code":"601318","name":"中国平安","fundnum":"810","total":"60,023","change":"-17,037","totalcap":"4151845.74","accrate":"3.28","changesta":"-0.94","time":"20200331"},"4":{"code":"600036","name":"招商银行","fundnum":"725","total":"84,062","change":"-26,493","totalcap":"2713546.86","accrate":"3.33","changesta":"-1.05","time":"20200331"},"5":{"code":"002475","name":"立讯精密","fundnum":"629","total":"75,925","change":"-13,566","totalcap":"2885619.87","accrate":"14.15","changesta":"-2.53","time":"20200331"},"6":{"code":"600887","name":"伊利股份","fundnum":"577","total":"69,439","change":"-16,804","totalcap":"2073457.53","accrate":"11.81","changesta":"-2.79","time":"20200331"},"7":{"code":"000858","name":"五粮液","fundnum":"574","total":"28,251","change":"-2,554","totalcap":"3254606.67","accrate":"7.44","changesta":"-0.68","time":"20200331"},"1982":{"code":"300178","name":"腾邦国际","fundnum":"1","total":"361","change":"-36","totalcap":"1240.45","accrate":"0.62","changesta":"-0.06","time":"20200331"}}]
     * error_code : 0
     */

    private String resultcode;
    private String reason;
    private int error_code;
    private List<ResultBean> result;

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public int getError_code() {
        return error_code;
    }

    public void setError_code(int error_code) {
        this.error_code = error_code;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * 1 : {"code":"600519","name":"贵州茅台","fundnum":"1240","total":"5,782","change":"-76","totalcap":"6423901.99","accrate":"4.60","changesta":"-0.06","time":"20200331"}
         * 2 : {"code":"600276","name":"恒瑞医药","fundnum":"870","total":"33,777","change":"629","totalcap":"3108511.95","accrate":"7.65","changesta":"+0.12","time":"20200331"}
         * 3 : {"code":"601318","name":"中国平安","fundnum":"810","total":"60,023","change":"-17,037","totalcap":"4151845.74","accrate":"3.28","changesta":"-0.94","time":"20200331"}
         * 4 : {"code":"600036","name":"招商银行","fundnum":"725","total":"84,062","change":"-26,493","totalcap":"2713546.86","accrate":"3.33","changesta":"-1.05","time":"20200331"}
         * 5 : {"code":"002475","name":"立讯精密","fundnum":"629","total":"75,925","change":"-13,566","totalcap":"2885619.87","accrate":"14.15","changesta":"-2.53","time":"20200331"}
         * 6 : {"code":"600887","name":"伊利股份","fundnum":"577","total":"69,439","change":"-16,804","totalcap":"2073457.53","accrate":"11.81","changesta":"-2.79","time":"20200331"}
         * 7 : {"code":"000858","name":"五粮液","fundnum":"574","total":"28,251","change":"-2,554","totalcap":"3254606.67","accrate":"7.44","changesta":"-0.68","time":"20200331"}
         * 1982 : {"code":"300178","name":"腾邦国际","fundnum":"1","total":"361","change":"-36","totalcap":"1240.45","accrate":"0.62","changesta":"-0.06","time":"20200331"}
         */

        @SerializedName("1")
        private _$1Bean _$1;
        @SerializedName("2")
        private _$2Bean _$2;
        @SerializedName("3")
        private _$3Bean _$3;
        @SerializedName("4")
        private _$4Bean _$4;
        @SerializedName("5")
        private _$5Bean _$5;
        @SerializedName("6")
        private _$6Bean _$6;
        @SerializedName("7")
        private _$7Bean _$7;
        @SerializedName("1982")
        private _$1982Bean _$1982;

        public _$1Bean get_$1() {
            return _$1;
        }

        public void set_$1(_$1Bean _$1) {
            this._$1 = _$1;
        }

        public _$2Bean get_$2() {
            return _$2;
        }

        public void set_$2(_$2Bean _$2) {
            this._$2 = _$2;
        }

        public _$3Bean get_$3() {
            return _$3;
        }

        public void set_$3(_$3Bean _$3) {
            this._$3 = _$3;
        }

        public _$4Bean get_$4() {
            return _$4;
        }

        public void set_$4(_$4Bean _$4) {
            this._$4 = _$4;
        }

        public _$5Bean get_$5() {
            return _$5;
        }

        public void set_$5(_$5Bean _$5) {
            this._$5 = _$5;
        }

        public _$6Bean get_$6() {
            return _$6;
        }

        public void set_$6(_$6Bean _$6) {
            this._$6 = _$6;
        }

        public _$7Bean get_$7() {
            return _$7;
        }

        public void set_$7(_$7Bean _$7) {
            this._$7 = _$7;
        }

        public _$1982Bean get_$1982() {
            return _$1982;
        }

        public void set_$1982(_$1982Bean _$1982) {
            this._$1982 = _$1982;
        }

        public static class _$1Bean {
            /**
             * code : 600519
             * name : 贵州茅台
             * fundnum : 1240
             * total : 5,782
             * change : -76
             * totalcap : 6423901.99
             * accrate : 4.60
             * changesta : -0.06
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class _$2Bean {
            /**
             * code : 600276
             * name : 恒瑞医药
             * fundnum : 870
             * total : 33,777
             * change : 629
             * totalcap : 3108511.95
             * accrate : 7.65
             * changesta : +0.12
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class _$3Bean {
            /**
             * code : 601318
             * name : 中国平安
             * fundnum : 810
             * total : 60,023
             * change : -17,037
             * totalcap : 4151845.74
             * accrate : 3.28
             * changesta : -0.94
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class _$4Bean {
            /**
             * code : 600036
             * name : 招商银行
             * fundnum : 725
             * total : 84,062
             * change : -26,493
             * totalcap : 2713546.86
             * accrate : 3.33
             * changesta : -1.05
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class _$5Bean {
            /**
             * code : 002475
             * name : 立讯精密
             * fundnum : 629
             * total : 75,925
             * change : -13,566
             * totalcap : 2885619.87
             * accrate : 14.15
             * changesta : -2.53
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class _$6Bean {
            /**
             * code : 600887
             * name : 伊利股份
             * fundnum : 577
             * total : 69,439
             * change : -16,804
             * totalcap : 2073457.53
             * accrate : 11.81
             * changesta : -2.79
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class _$7Bean {
            /**
             * code : 000858
             * name : 五粮液
             * fundnum : 574
             * total : 28,251
             * change : -2,554
             * totalcap : 3254606.67
             * accrate : 7.44
             * changesta : -0.68
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }

        public static class _$1982Bean {
            /**
             * code : 300178
             * name : 腾邦国际
             * fundnum : 1
             * total : 361
             * change : -36
             * totalcap : 1240.45
             * accrate : 0.62
             * changesta : -0.06
             * time : 20200331
             */

            private String code;
            private String name;
            private String fundnum;
            private String total;
            private String change;
            private String totalcap;
            private String accrate;
            private String changesta;
            private String time;

            public String getCode() {
                return code;
            }

            public void setCode(String code) {
                this.code = code;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getFundnum() {
                return fundnum;
            }

            public void setFundnum(String fundnum) {
                this.fundnum = fundnum;
            }

            public String getTotal() {
                return total;
            }

            public void setTotal(String total) {
                this.total = total;
            }

            public String getChange() {
                return change;
            }

            public void setChange(String change) {
                this.change = change;
            }

            public String getTotalcap() {
                return totalcap;
            }

            public void setTotalcap(String totalcap) {
                this.totalcap = totalcap;
            }

            public String getAccrate() {
                return accrate;
            }

            public void setAccrate(String accrate) {
                this.accrate = accrate;
            }

            public String getChangesta() {
                return changesta;
            }

            public void setChangesta(String changesta) {
                this.changesta = changesta;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }
        }
    }
}
