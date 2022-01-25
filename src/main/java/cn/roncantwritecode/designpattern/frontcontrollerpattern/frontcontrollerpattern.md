前端控制器模式（Front Controller Pattern）是用来提供一个集中的请求处理机制，所有的请求都将由一个单一的处理程序处理。该处理程序可以做认证/授权/记录日志，或者跟踪请求，然后把请求传给相应的处理程序。以下是这种设计模式的实体。

调度器（Dispatcher） - 前端控制器可能使用一个调度器对象来调度请求到相应的具体处理程序。

视图（View） - 视图是为请求而创建的对象。

### 实现

我们将创建 FrontController、Dispatcher 分别当作前端控制器和调度器。HomeView 和 StudentView 表示各种为前端控制器接收到的请求而创建的视图。

FrontControllerPatternDemo，我们的演示类使用 FrontController 来演示前端控制器设计模式。

![](https://github.com/RonCantWriteCode/DesignPattern/blob/main/src/main/resources/image/frontcontrollerpattern.jpg)

#### 步骤 1

创建视图。

HomeView.java

StudentView.java

#### 步骤 2

创建调度器 Dispatcher。

Dispatcher.java

#### 步骤 3

创建前端控制器 FrontController。

FrontController.java

#### 步骤 4

使用 FrontController 来演示前端控制器设计模式。

FrontControllerPatternDemo.java

#### 步骤 5

验证输出。

```
Page requested: HOME
User is authenticated successfully.
Displaying Home Page
Page requested: STUDENT
User is authenticated successfully.
Displaying Student Page
```