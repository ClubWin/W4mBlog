## 创建子模块注意事项:
   - **groupId: 统一为com.clubWin**
   - **artifactId: 为w4mblog-xxx xxx 为子模块名称**
   - **所有的包名称统一为: com.clubwin.xxx  xxx 为子模块名称**

## 项目说明
  #### 本项目由ClubWin开发并发布，一切资料均来源于互联网。
  ####  本项目采用spring cloud全家桶构建，采用nacos 作为服务注册中心以及配置管理中心
        nacos，
        aliyu-oss,
        springclub,
        springboot,
        mysql,
        mybatis,
        mybatis-plus,
        redis,
        vue,
        element-ui,
        vue-router,
        ...
## 模块说明
  #### w4mblog-common
        用来构建子模块的通用依赖，比如mysql依赖，mybatis-plus依赖
        各个子模块的通用工具类也在这里创建
        ...
  #### w4mblog-gateway
        网关模块，所有请求的入口，转发请求，解决跨域问题，以及一些权限检查
        ...
  #### renren-generator
        一个开源的代码生成工具，可以根据数据表生成基本的entity 类，mybatis mapper 映射文件以及dao 接口类
        使用说明见renren-generator/readme.md
  #### .....