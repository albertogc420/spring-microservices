build-images:
	@echo Build Images.
	mvn spring-boot:build-image -f ../eureka_server/pom.xml
	mvn spring-boot:build-image -f ../configuration_server/pom.xml

docker-up:
	@echo Docker-compose up
	docker-compose up

database:
	@echo Create Database.
	docker exec -ti mysql sh -c "cd /opt/bd && mysql -uroot -proot < 01-database.sql"

docker-delete:
	@echo Docker Delete all
	docker volume prune
	docker system prune -a

api-gateway:
	mvn spring-boot:run -f ../api_gateway/pom.xml

patients:
	mvn spring-boot:run -f ../patients/pom.xml

patients-hist:
	mvn spring-boot:run -f ../patientHistory/pom.xml
