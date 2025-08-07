const mongoose = require("mongoose");
const dbconnect = ()=>{
    mongoose.set('strictQuery',true);
    mongoose.connect("mongodb://127.0.0.1:27017/basedatos7")
    .then((success)=>console.log("conexion exitosa"))
    .catch((err)=>console.log(err.message));

}
module.exports = dbconnect;