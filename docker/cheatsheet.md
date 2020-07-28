# Listado de imagenes descargadas
docker image list

# Borrar imagen
docker image rm ID_IMAGEN
docker rmi ID_IMAGEN

# Crear contenedor
docker container create --name NOMBRE NOMBRE_IMAGEN

# Listado de contenedores en ejecución
docker container list
docker container list --all # Incluyendo los parados
docker ps 
docker ps --all

# Control del estado de un contendor
docker ( start / stop / restart) NOMBRE_CONTENEDOR

# Borrar contenedor
docker container rm NOMBRE_CONTENEDOR
docker rm NOMBRE_CONTENEDOR
docker rm NOMBRE_CONTENEDOR -f # Lo borre incluso si está arrancado

# logs dentro del contenedor
docker logs NOMBRE_CONTENEDOR

# docker-compose
docker-compose (up/down/stop/start) -d (-d = en segundo plano)
    up: crea contenedore y los arranca
    down: para contenedores y los borra
    start: los arranca si están creados
    stop: los para si están arrancados
    









