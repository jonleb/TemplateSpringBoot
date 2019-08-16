Mapstruct will help to convert an object to another object by using a mapper. 
It is a powerful tool when you have some specific domain object to dto.

```xml
<dependency>
    <groupId>org.mapstruct</groupId>
    <artifactId>mapstruct</artifactId>
    <version>${mapstruct.version}</version>
</dependency>
```
Mapstruct requires to compile and some elements have to be
addressed
 ```xml
 <plugin>
     <groupId>org.apache.maven.plugins</groupId>
     <artifactId>maven-compiler-plugin</artifactId>
     <version>3.8.1</version>
     <configuration>
         <annotationProcessorPaths>
             <path>
                 <groupId>org.mapstruct</groupId>
                 <artifactId>mapstruct-processor</artifactId>
                 <version>1.3.0.Final</version>
             </path>
             <path>
                 <groupId>org.projectlombok</groupId>
                 <artifactId>lombok</artifactId>
                 <version>1.18.8</version>
             </path>
         </annotationProcessorPaths>
         <compilerArgs>
             <compilerArg>-Amapstruct.default.defaultComponentModel=spring</compilerArg>
         </compilerArgs>
     </configuration>
 </plugin>
```

One important point is that you can easily forget is to add the instruction 
@Mapper(componentModel = "spring")
on your interface mapper.
An example is provided here: 
TemplateSpringBoot/src/test/java/org/jonleb/examples/support/mapstruct/test/CharacterMapperTest.java


[http://mapstruct.org/] (more details on mapstruct.org)