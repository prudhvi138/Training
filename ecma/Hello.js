class Hello{
    constructor(fname,lname,age)
    {
        this.fn=fname;
        this.ln=lname;
        this.a=age;
    }
    full_name()
    {
        return this.fn + ' '+this.ln;
    }
}
// let hello = new Hello('prudhvi','E',22);
// console.log('Full name:'+hello.full_name());

