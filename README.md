# Spring Boot Ecommerce

<p>SpringBoot Backend :&nbsp;<a href="https://github.com/debrupofficial365/spring-boot-ecommerce-backend">https://github.com/debrupofficial365/spring-boot-ecommerce-backend</a></p>
<p>Angular Frontend : <a href="https://github.com/debrupofficial365/angular-ecommerce-website-frontend">https://github.com/debrupofficial365/angular-ecommerce-website-frontend</a></p>
<p>Database scripts :&nbsp;<a href="https://github.com/debrupofficial365/db-scripts-ecommerce">https://github.com/debrupofficial365/db-scripts-ecommerce</a></p>

---> A website to buy different categorized items, with signup login logout feature, you can go inside the product to check the details, you can add products in the card, and inside the card section, you can increase, decrease the product quantity, or you can remove them from the card, and you can checkout with your valid details to buy products. You can search products by keywords and also have a VIP member section.

---> In this website, the frontend is designed with angular, and the backend is with Spring Boot and here for the authentication section I use the okta authentication service, and for storing the products I use MySQL as the database.

---> In spring boot here I have entities, mapped to table and to hold attributes of different properties and we also have the dto(data transfer object) to transfer the data between Angular front-end and Spring Boot back-end. We have a controller and service to send the order to the backend and store it in the database. Config class to disable HTTP methods and make it read-only. And the dao(data access object) classes extended by JpaRepository to access the database.

---> For testing the backend API HTTP requests, I use Postman.

---> In the Angular part to get the data from the backend, I use HttpModule and Observable, Here I also have models same as the entities of spring boot, components to build each block (Html and login for each component), have config class to connect the website with okta OAuth service, and also services to implement the several operations of this website and also I use Angular routes to handle the navigation from one view to the next. In this project, I use Reactive Forms, bootstrap, and font awesome icons.

---> Technology: Angular, Spring Boot, MySQL, Postman API, Okta, REST API, Bootstrap
