var http=require('http');
var fs=require('fs');
http.createServer(function(req,res)
{
   // res.writeHead(200);
      //  res.writeHead(200,{'Context-Type':''});
     //   res.write(data);
        return res.end("Hello World");
    
  
}).listen(8000);


console.log("Server is started");
