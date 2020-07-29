# MAVEN

## Creación de un nuevo proyecto JAVA basado en una plantilla (arquetipo)
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-quickstart
mvn archetype:generate -DarchetypeArtifactId=maven-archetype-webapp

## Identificar un proyecto MAVEN:
- groupID: 
    - Empresa/Organización al cargo del desarrollo (Dominio internet invertido)
        - Ejemplo: com.gfi
    - Qué estoy desarrollando a alto nivel?
        - Ejemplo: web-app-nominas
    - Las juntamos mediante un punto: com.gfi.web-app-nominas
- artifactId: Qué es nuestro proyecto a bajo nivel?
        - Ejemplo: web-services   
El identificador de un proyecto es groupID + artifactID

# GOLES
mvn GOLE_NAME
    - clean:            
    - compile:          Compilación del proyecto
    - test-compile:     Compilar los test unitarios
    - test:             Ejecutar todas las pruebas unitarias
    - package:          Empaquetar proyecto
    - install:          Incluir nuestro artefacto en el repo local de maven