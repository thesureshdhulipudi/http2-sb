# http2-sb
http2 with spring boot


![image](https://github.com/user-attachments/assets/c6d48470-5fbc-4285-838e-0d1279696f6c)



To Enable Http2 in httpd
1. Edit the httpd.conf
* Ensure the following line is present and uncommented in httpd.conf:
* LoadModule http2_module modules/mod_http2.so
* LoadModule ssl_module modules/mod_ssl.so

2. Edit the httpd-ssl.conf
* Ensure that your SSL virtual host is configured to support HTTP/2 by adding the Protocols directive:
* Protocols h2 http/1.1

```
<VirtualHost *:443>
    -------------
    -------------
    Protocols h2 http/1.1
    -------------
    -------------
</VirtualHost>

```

