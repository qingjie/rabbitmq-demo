http://www.jianshu.com/p/53221f56a8f3

http://cgc243652136qq.blog.51cto.com/3989433/1795424

---
How install rabbitmq with docker?
```
docker run -d --hostname my-rabbit -p 5671:5671 -p 5672:5672 -p 4369:4369 -p 25672:25672 -p 15671:15671 -p 15672:15672 --name okong-rabbit rabbitmq:management
```

* http://localhost:15672/
* guest/guest
