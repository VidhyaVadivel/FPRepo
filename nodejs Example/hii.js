var fs=require("fs");
fs.readFile('ha.js',function(err,data)
{
    if(err) return console.error(err);
    console.log(data.toString());
});
console.log("Programm end");