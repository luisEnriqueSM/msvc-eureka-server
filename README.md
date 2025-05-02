# mssc-eureka-server

# Comandos Docker para levantar el contenedor de eureka-server

```bash
# Limpiar, generar Jar file
.\mvnw clean package

# Construir imagen
docker build -t eureka-server:v1 .

# Correr contenedor
docker run -p 8761:8761 --name eureka-server --network springcloud eureka-server:v1