# jfinal_demo

## 项目启动步骤

- 使用 `/script/blog.sql` 中的 sql 语句创建数据库与数据库表

- 修改 `WebRoot/WEB-INF/a_little_config.txt` 文件，填入正确的数据库连接用户名、密码

- 将项目导入 eclipse。推荐使用 Eclipse IDE for Java EE Developers

- 打开 `com.demo.common` 包下的 `DemoConfig` 文件，右键单击该文件并选择 Debug As ---> Java Application。
        其它启动项目的方式见 [《JFinal手册》](http://download.jfinal.com/download/3.1/jfinal-3.1-manual.pdf)。除此之外，项目还可以与其它普通java web 项目一样使用 tomcat
   jetty 等 web server 来启动，启动方式与非jfinal项目完全一样。

- maven 项目还可以在控制台通过 `mvn jetty:run` 来启动

- 打开浏览器输入 [http://localhost](http://localhost) 即可查看运行效果

> 注意： 请确保您安装了 JavaSE 1.6 或更高版本，tomcat下运行项目需要先删除 jetty-server-xxx.jar，否则会有冲突

## 链接
- [JFinal 极速开发社区](http://www.jfinal.com/)
- [JFinal 极速开发框架](http://www.jfinal.com/project/1)