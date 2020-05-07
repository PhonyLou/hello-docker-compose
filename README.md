# hello-docker-compose

### Precondition

- Docker

### Architecture

![docker-compose.jpg](https://i.loli.net/2020/05/06/P4KpI9my7J2z6CG.jpg)

### Run with docker

```sh
$ docker-compose up -d
```

### How to use

#### Caesar

Caesar generates directive each 10 seconds, you can visit below link to see all of the directives.
```
$ open http://localhost:8081/api/directive
```

#### Postman

Postman gets the latest directive by manual, via using blow link.
```
$ open http://localhost:8082/api/directive
```

Postman needs to forward directive, try below link.
```
$ open http://localhost:8082/api/forward
```

#### Pompeii

Pompeii receives directive by using blow link.
```
$ open http://localhost:8082/api/directive
```

Postman needs to forward directive, try below link.
```
$ open http://localhost:8083/api/directive
```

### Stop run

```sh
$ docker-compose down
```

### Stop run and remove data

```sh
$ docker-compose down --volume
```