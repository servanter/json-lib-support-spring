#json-lib-support-spring

##Introduction

<p>It can help for springmvc using net.sf.json-lib and @Responsebody returns json format</p>
##How to use
    <mvc:annotation-driven>
        <mvc:message-converters>
            <bean id="netJsonHttpMessageConverter" class="com.github.servanter.net.sf.json.support.spring.NetJsonHttpMessageConverter">
                <property name="charset" value="GBK">
            </bean>
        </mvc:message-converters>
    </mvc:annotation-driven>
##Maven association

[![Build Status](https://travis-ci.org/servanter/json-lib-support-spring.svg?branch=master)](https://travis-ci.org/servanter/json-lib-support-spring)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/com.github.servanter/netsfjson-support-spring/badge.svg)](https://maven-badges.herokuapp.com/maven-central/com.github.servanter/netsfjson-support-spring)
### Dependency
        <dependency>
        	<groupId>com.github.servanter</groupId>
        	<artifactId>netsfjson-support-spring</artifactId>
        	<version>1.0.0</version>
        </dependency>

##License
The MIT License (MIT)
Copyright © 2015 servanter <fengshang@126.com>

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the “Software”), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
