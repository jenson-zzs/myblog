# myblog

调用方式：
1.RestTemplate
2.@Feign

使用区别：
（1）前者使用负载均衡，需要加@LoadBalanced，直接自动选择默认算法均衡，
如果还需要自定义想要的算法，要加上@RibbonClient(name = "myblog-provider", configuration = com.zzs.config.LoadBalanced.class)
其中configuration配置自定义算法；

后者自动有了默认负载均衡，想要自定义负载均衡，在yml配置
myblog-provider:ribbon:NFLoadBalancerRuleClassName=指定类名

（2）前者若使用熔断器，需要加上@EnableHystrix，@HystrixCommand(fallbackMethod = "getUserFallback")
其中fallbackMethod配置返回自定义结果所在的方法名；

后者加上@EnableHystrix，
@FeignClient(name = "myblog-provider", fallbackFactory = HystrixClientFactory.class)，
feign.hystrix.enabled: true
其中，fallbackFactory还可以知道熔断的异常原因是什么。
