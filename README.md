# Spring Boot Ecommerce

<p><span style="color: rgb(0, 0, 0); font-family: Ubuntu; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">Technology:&nbsp;</span></p>
<p><span style="color: rgb(0, 0, 0); font-family: Ubuntu; font-size: 14px; font-style: normal; font-variant-ligatures: normal; font-variant-caps: normal; font-weight: 400; letter-spacing: normal; orphans: 2; text-align: start; text-indent: 0px; text-transform: none; white-space: normal; widows: 2; word-spacing: 0px; -webkit-text-stroke-width: 0px; background-color: rgb(255, 255, 255); text-decoration-thickness: initial; text-decoration-style: initial; text-decoration-color: initial; display: inline !important; float: none;">Java, TypeScript, Angular, Spring Boot, MySQL, Postman, Okta, REST API, Bootstrap, Lombok</span> </p>

<p>SpringBoot Backend :&nbsp;<a href="https://github.com/debrupofficial365/spring-boot-ecommerce-backend">https://github.com/debrupofficial365/spring-boot-ecommerce-backend</a></p>
<p>Angular Frontend : <a href="https://github.com/debrupofficial365/angular-ecommerce-website-frontend">https://github.com/debrupofficial365/angular-ecommerce-website-frontend</a></p>
<p>Database scripts :&nbsp;<a href="https://github.com/debrupofficial365/db-scripts-ecommerce">https://github.com/debrupofficial365/db-scripts-ecommerce</a></p>


<br/>
#######################################################
<br/>


[![Build Status](https://travis-ci.org/codecentric/springboot-sample-app.svg?branch=master)](https://travis-ci.org/codecentric/springboot-sample-app)
[![Coverage Status](https://coveralls.io/repos/github/codecentric/springboot-sample-app/badge.svg?branch=master)](https://coveralls.io/github/codecentric/springboot-sample-app?branch=master)
[![License](http://img.shields.io/:license-apache-blue.svg)](http://www.apache.org/licenses/LICENSE-2.0.html)

Minimal [Spring Boot](http://projects.spring.io/spring-boot/) sample app.

## Requirements

For building and running the application you need:

- [JDK 1.8](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
- [Maven 3](https://maven.apache.org)

## Running the application locally

There are several ways to run a Spring Boot application on your local machine. One way is to execute the `main` method in the `de.codecentric.springbootsample.Application` class from your IDE.

Alternatively you can use the [Spring Boot Maven plugin](https://docs.spring.io/spring-boot/docs/current/reference/html/build-tool-plugins-maven-plugin.html) like so:

```shell
mvn spring-boot:run
```

## Deploying the application to OpenShift

The easiest way to deploy the sample application to OpenShift is to use the [OpenShift CLI](https://docs.openshift.org/latest/cli_reference/index.html):

```shell
oc new-app codecentric/springboot-maven3-centos~https://github.com/codecentric/springboot-sample-app
```

This will create:

* An ImageStream called "springboot-maven3-centos"
* An ImageStream called "springboot-sample-app"
* A BuildConfig called "springboot-sample-app"
* DeploymentConfig called "springboot-sample-app"
* Service called "springboot-sample-app"

If you want to access the app from outside your OpenShift installation, you have to expose the springboot-sample-app service:

```shell
oc expose springboot-sample-app --hostname=www.example.com
```

## Copyright

Released under the Apache License 2.0. See the [LICENSE](https://github.com/codecentric/springboot-sample-app/blob/master/LICENSE) file.

<br/>
#######################################################
<br/>


---> <br/>
A website to buy different categorized items, with signup login logout feature, you can go inside the product to check the details, you can add products in the card, and inside the card section, you can increase, decrease the product quantity, or you can remove them from the card, and you can checkout with your valid details to buy products. You can search products by keywords and also have a VIP member section.

---> <br/>
In this website, the frontend is designed with angular, and the backend is with Spring Boot and here for the authentication section I use the okta authentication service, and for storing the products I use MySQL as the database.

---> <br/>
In spring boot here I have entities, mapped to table and to hold attributes of different properties and we also have the dto(data transfer object) to transfer the data between Angular front-end and Spring Boot back-end. We have a controller and service to send the order to the backend and store it in the database. Config class to disable HTTP methods and make it read-only. And the dao(data access object) classes extended by JpaRepository to access the database.

---> <br/>
For testing the backend API HTTP requests, I use Postman.

---><br/>
In the Angular part to get the data from the backend, I use HttpModule and Observable, Here I also have models same as the entities of spring boot, components to build each block (Html and login for each component), have config class to connect the website with okta OAuth service, and also services to implement the several operations of this website and also I use Angular routes to handle the navigation from one view to the next. In this project, I use Reactive Forms, bootstrap, and font awesome icons.

---> Technology: Angular, Spring Boot, MySQL, Postman API, Okta, REST API, Bootstrap
