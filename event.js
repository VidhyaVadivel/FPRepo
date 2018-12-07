var e=require('events');
var eE=new e.EventEmitter();
var c=function connected()
{
    console.log('Connection successful');
    eE.emit('data_received');
}
eE.on('connection',c);
eE.on('data_received',function()
{
    console.log('data received successfully');
});
eE.emit('connection');
console.log("done");