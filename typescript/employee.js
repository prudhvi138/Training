"use strict";
exports.__esModule = true;
var Employee = /** @class */ (function () {
    function Employee(id, name, location, phone) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phone = phone;
    }
    return Employee;
}());
exports.Employee = Employee;
var employee = new Employee(101, 'ramesh', 'chennai', 787899992);
console.log('Name:' + employee.name);
