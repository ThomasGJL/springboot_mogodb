# springboot_mongodb

拉取容器  
```
docker pull mongo:latest
```

运行容器  
```
docker run -itd --name mongo -p 27017:27017 mongo --auth
```

添加用户和设置密码，并且尝试连接。    
MongoDB 6.0 及以上版本  
```
docker exec -it mongo mongosh admin
```
MongoDB 6.0 以下版本  
```
docker exec -it mongo mongo admin
```

创建一个名为 admin，密码为 123456 的用户。  
```
db.createUser({ user:'admin',pwd:'123456',roles:[ { role:'userAdminAnyDatabase', db: 'admin'},"readWriteAnyDatabase"]});
```
