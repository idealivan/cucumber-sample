Feature: 应用相关的操作
  为了能够查看我自己有权限查看的应用信息，
  作为应用管理者，
  在登录到管理控制台并进入到应用列表页面后，
  我创建的应用和已经授权我查看的应用会被显示到不同的tab中。

  @app @bvt
  Scenario Outline: 获取我的应用列表
    Given 我以用户"<userName>"和"<userPassword>"登录到系统然后输出用例简述"<comment>"
    When 我使用参数"<method>"和"<tabType>"访问了URL "http://console.centlui.com/MasAppList.json"
    Then 返回的JSON数据应该包括"<expectedStr>"所期望的内容
    And 返回JSON数据反序列化之后应当是ApplicationDetailBean的实例列表

    Examples:
      | comment        | userName        | userPassword | method      | tabType | expectedStr             |
      | 应用管理员获取创建应用的列表 | andriodAppAdmin | test01234    | searchMyApp | mine    | "appName":"自动化测试APP001" |
      | 应用开发者获取创建应用的列表 | andriodAppDev   | test01234    | searchMyApp | mine    | "appName":"自动化测试APP001" |
      | 应用运维者获取创建应用的列表 | andriodAppPe    | test01234    | searchMyApp | mine    | "appName":"自动化测试APP001" |