function add(a:string, b:string):string;
function add(a:number, b:string): string;
function add(a:number, b:number): number;
function add(a:number, b:string): string;
function add(a: any, b:any): any {
    return a + b;
}
var concat=add('hello','world');
console.log(concat);
var concat=add(3,'hello');
console.log(concat);
var sum=add(2,3);
console.log(sum);