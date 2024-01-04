# spring-postgres

mvn clean package -DskipTests

docker build -t rzanarelli/my-application:1.0.16 .

docker push rzanarelli/my-application:1.0.16

kubectl apply -f .\k8s\postgresql-deployment.yaml

kubectl apply -f .\k8s\deployment.yaml