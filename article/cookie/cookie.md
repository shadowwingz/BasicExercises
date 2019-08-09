客户端请求服务器之后，服务器会生成一段码返回给客户端，这个码就是 cookie，同时，会返回一个字段 set cookie ，这个字段是用来通知客户端保存这个cookie，客户端下次发起请求时，带上这个cookie，服务端检查这个cookie，可以知道是哪个客户端发的请求，以及这个cookie有没有过期。

cookie 生成：服务端
通知客户端保存这个 cookie：set cookie 字段