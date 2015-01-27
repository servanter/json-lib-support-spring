#json-lib-support-spring

##Introduction

<p>It can help for springmvc using net.sf.json-lib returns json format</p>
##How to use
    <mvc:annotation-driven>
        <mvc:message-converters>
            <bean id="netJsonHttpMessageConverter" class="com.github.servanter.net.sf.json.support.spring.NetJsonHttpMessageConverter">
                <property name="charset" value="GBK">
            </bean>
        </mvc:message-converters>
    </mvc:annotation-driven>
##Maven association
### dependency
        <dependency>
            <groupId>com.github.servanter</groupId>
            <artifactId>netsfjson-support-spring</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
