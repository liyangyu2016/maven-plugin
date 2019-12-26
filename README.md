1:记录学习mq的一些过程
2：demo是一个springboot和mybatis整合的项目
3：简单分布式项目，简单模拟外卖下单场景
订单下单（用户下单）->mq->消费订单（分配给外卖小哥）
orderservice  （http://127.0.0.1:8080/order/createOrder） 用于下单接口,并将消息发放到收单接口
dispatchservice  用于接受消息，进行分配外卖员

4：mq访问接口：http://106.12.40.229:15672/#/queues