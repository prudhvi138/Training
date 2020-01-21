var array=new Array(10);
for(let index=0;index<array.length;index++)
{
array[index]=Math.floor(Math.random()*100)
}
let div=array.filter((x)=>x%2==0 &&  x%5==0)
let inc=array.map((x)=>parseInt(x*1.1))
console.log(div);
console.log(inc);