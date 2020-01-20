// var person = { 
//     firstname:"Ram", 
//     lastname:"krishna", 
//     func:function(){return "Hello!!"},    
//  }; 
//  //access the object values 
//  console.log(person.firstname)   
//  console.log(person.lastname) 
//  console.log(person.func())
var myobj = new Object; 
myobj.a = 5; 
myobj.b = 12; 
delete myobj.a;
console.log("b" in myobj);
console.log('a' in myobj);