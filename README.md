Spring Boot Project Template
----------------------------

 

With Spring Boot and the actuator starter

org.springframework.boot spring-boot-starter-actuator

you can check the endpoint /beans

 

**A Spring Boot starter consists of two components:**

-   One `autoconfigure` module containing the automatic configuration including
    it's default values.

-   The `starter` module itself, providing the dependency to
    the `autoconfigure` module and all needed additional dependencies

Including the `starter` as a dependency for a Spring Boot application should be
enough to start using that library. If a separation of those two isn't needed,
combine everything into the `starter` module.

 

 

**The environments automatic configuration is based on two core components:**

-   Profiles (`@Profile`, available since Spring 3.1)

Profiles allow provisioning of Beans based on active profiles
(`spring.profiles.active`), whereas conditions can be used to model simple to
complex conditions under which Beans are instantiated and configured:

 

-   Conditions (`@Conditional` together
    with `org.springframework.context.annotation.Condition`, available since
    Spring 4)

-   `@Conditional` from the core framework allows with a custom implementation
    of a `Condition`arbitrary statements

Spring Boot contains several useful implementations

-   `@ConditionalOnBean` / `@ConditionalOnMissingBean`: Configuration and beans
    are only instantiated and used when certain other Beans are available or
    missing

-   `@ConditionalOnClass` / `@ConditionalOnMissingClass`: Configuration and
    beans are only instantiated and used when certain classes are available to
    the classloader

-   `@ConditionalOnResource` is triggered only when specific resources are
    available

-   `@ConditionalOnProperty`: A really powerful condition that matches concrete
    properties inside configurational files

 

As much the automatic configuration of Spring Boot applications and their
adaption to environment seems magical, it doesn't fit Clarke's third law. It's
all there to see and use. Spring Boot even provides
a [ConditionEvaluationReport](http://docs.spring.io/spring-boot/docs/current/api/org/springframework/boot/autoconfigure/condition/ConditionEvaluationReport.html),
that allows exactly to understand, why a configuration in a given order took
place.

 
