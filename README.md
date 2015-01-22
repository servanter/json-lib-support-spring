#json-lib-support-spring

##Introduction

<p>It can help for springmvc using json - lib returns json format</p>
##How to use

    <bean id="netJsonHttpMessageConverter" class="net.sf.json.ext.support.spring.NetJsonHttpMessageConverter">
        <property name="charset" value="GBK">
    </bean>
