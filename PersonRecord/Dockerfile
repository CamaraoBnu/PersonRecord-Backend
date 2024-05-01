# Use a imagem base do OpenJDK
FROM openjdk:17-jdk

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR do aplicativo para o contêiner
COPY target/PersonRecord-1.0-SNAPSHOT.jar /app/PersonRecord-1.0-SNAPSHOT.jar

# Comando para executar o aplicativo quando o contêiner for iniciado
CMD ["java", "-jar", "PersonRecord-1.0-SNAPSHOT.jar"]