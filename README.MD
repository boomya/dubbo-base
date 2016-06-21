#### 对外提供dubbo服务的最佳实践
##### 模块介绍
- `share`   
所有需要对外开放的接口定义以及DTO
- `client`  
对外提供的jar包, 需要调用本项目dubbo服务的应用, 只需要依赖client包. 这个包应该包含dubbo-consumer的配置信息, 以及是所有对外dubbo服务的入口. 
- `service-consumer`  
模拟dubbo消费端, 现实情况中, 一般是第三方或者其他应用. 在其他应用调用dubbo服务时, 应该不需要知道具体的dubbo相关的配置信息, 尽量降低使用的成本和使用的风险.
- `service-provider`  
模拟dubbo提供端, 现实情况中, 一般是业务的服务端.

##### 模块之前的依赖关系
```
graph LR
  client-->share
```
```
graph LR
  service-consumer-->client
```
```
graph LR
  service-provider-->share
```

##### 最后
在开放dubbo服务的过程中, 应该避免使用方配置dubbo-consumer信息, 避免配置信息的碎片化, 以及降低使用方配置了不合理的参数的风险.  
只对外提供一个jar包, 使用方不需要知道具体的配置信息以及实现细节, 降低使用的门槛和成本, 统一维护管理配置信息.