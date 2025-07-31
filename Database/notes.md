- création Dockerfile
- création init-db

- ``docker build -t plant-db-img .``

- ``docker run -d --name plant-db-container -p 3306:3306 plant-db-img``

- ``docker exec -it plant-db-container mysql -u plantuser -puserpassword plantDB``
