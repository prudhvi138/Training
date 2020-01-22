export class Employee{
    id:number;
    name:string;
    location:string;
    phone:number;
    constructor(id:number, name:string, location:string, phone:number){
        this.id=id;
        this.name=name;
        this.location=location;
        this.phone=phone;
        }

}
let employee = new Employee(101,'ramesh','chennai',787899992);
console.log('Name:'+employee.name);