# What I did
I configured the application to expose 2 services: 
* /api/v1/characters/${characterId}
* /api/v1/characters/name/${characterName}

and only the second is unprotected

# What I learned
With spring boot if you don't use the standard structure of a spring project:
- org.mypackage
  - MyBootApp.class
  - config
    - WebConfig.class
  - controller
    - MyController.class

you have to specify packages to scan like this
`@SpringBootApplication(
        scanBasePackageClasses = {
                WebSecurityConfiguration.class},
        scanBasePackages = {
                "org.jonleb.examples.restapi"
        })
`

In the WebSecurityConfiguration you have to declare the permission is a specific order like
`
        http
                .authorizeRequests()
                .mvcMatchers("/api/v1/character/name/**").permitAll()
                .anyRequest().denyAll()
                ;
`
