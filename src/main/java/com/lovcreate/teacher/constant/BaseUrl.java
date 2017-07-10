package com.lovcreate.teacher.constant;


public class BaseUrl {
    public static String baseUrl = "http://172.16.1.57:8083/daxingshebei";
    //验证码
    public static String code = baseUrl+"/a/sms/sendVerify";
    //注册1
    public static String register_01 = baseUrl+"/a/register";
    //注册2
    public static String register_02 = baseUrl+"/a/register/realRegister";
    //登录
    public static String login = baseUrl+"/a/appLogin";
    //用户协议
    public static String protocol = baseUrl+"/a/view/getProtocolUrl";
    //忘记密码1
    public static String forget_01 = baseUrl+"/a/appUser/forgetPasswordOne";
    //忘记密码2
    public static String forget_02 = baseUrl+"/a/appUser/forgetPasswordTwo";
    //首页查询
    public static String main_search = baseUrl+"/a/homePage/";
    //团队列表
    public static String team = baseUrl+"/a/appUser/team";
    //我的邀请码
    public static String myInvitationCode = baseUrl+"/a/appUserInviteCode";
    //我的上级
    public static String mySuperior = baseUrl+"/a/appUser/superior";
    //下级团队收益详细
    public static String juniorSalesDetail = baseUrl+"/a/appProfitInfo";
    //公告列表
    public static String newsList = baseUrl+"/a/appNotice";
    //公告详情
    public static String newsDetail = baseUrl+"/a/view/getNoticeUrl";
    //知识堂列表
    public static String knowledgeList = baseUrl+"/a/appKnowledge";
    //知识堂详情
    public static String knowledgeDetail = baseUrl+"/a/view/getKnowledgeUrl";
    //我的流水列表
    public static String myAccountList = baseUrl+"/a/appAccountFlow";
    //我的流水 提现详情
    public static String withdrawalsDetail = baseUrl+"/a/appWithdraw";
    //我的流水 收益详情
    public static String incomeDetail = baseUrl+"/a/appProfitInfo";
    //我的流水 订单详情
    public static String orderDetail = baseUrl+"/a/appOrderInfo";
    //我的收益
    public static String myProfitList = baseUrl+"/a/appProfitInfo";
    //更换手机
    public static String changePhone = baseUrl+"/a/appUser/changeTel";
    //更换登录密码
    public static String changeLoginPwd = baseUrl+"/a/appUser";
    //收货地址列表
    public static String addressList = baseUrl+"/a/appAddress/list";
    //收货地址修改
    public static String addressUpdate = baseUrl+"/a/appAddress"; //put
    //收货地址--设置默认地址
    public static String addressDefault = baseUrl+"/a/appAddress/changeState";
    //收货地址--删除地址
    public static String addressDelete = baseUrl+"/a/appAddress";
    //收货地址信息回显
    public static String addressDetail = baseUrl+"/a/appAddress"; //GET
    //收货地址新增
    public static String addressAdd = baseUrl+"/a/appAddress"; //post
    //收货地址--地区查询
    public static String cityList = baseUrl+"/a/appOrderInfo/getCity"; //get
    //投诉与建议列表
    public static String adviseList = baseUrl+"/a/appAdvise";
    //投诉与建议列表
    public static String adviseAdd = baseUrl+"/a/appAdvise";
    //消息提醒开关
    public static String noticeRemind = baseUrl+"/a/appUser/message";
    //退出登录
    public static String quit = baseUrl+"/a/appLogin/logout";
    //我的销售订单
    public static String myOrders = baseUrl+"/a/appOrderInfo";
    //商品购买--收货人信息
    public static String receiverInfo = baseUrl+"/a/appOrderInfo/getUserMessage";
    //商品购买--商品信息
    public static String goodsInfo = baseUrl+"/a/appGoods";
    //商品购买--提交订单
    public static String orderSubmit = baseUrl+"/a/appOrderInfo/submitOrder";
    //商品购买--支付
    public static String orderPay = baseUrl+"/a/appOrderInfo/payOrder";
    //商品购买--支付成功
    public static String paySuccess = baseUrl+"/a/appOrderInfo";
    //商品购买--修改订单
    public static String orderUpdate = baseUrl+"/a/appOrderInfo/updateOrder";
    //取消订单
    public static String cancelOrder = baseUrl+"/a/appOrderInfo"; //put
    //删除订单
    public static String deleteOrder = baseUrl+"/a/appOrderInfo/delete"; //put
    //提现查询
    public static String withdrawal = baseUrl+"/a/appUser/myBalance"; //put
}
