const express = require("express");
const dbconnect = require("./config");
const ModelUser = require("./models");
const app=express();
const router = express.Router();

router,post('/',async(req,res)=>{
const body = req.body;
const respuesta = await ModelUser.create(body)
res.send(respuesta)
})
app.use(express.json());
app.use(router);
app.listen (3005,()=>{
    console.log ("El servidor esta en el puerto 3005")

})
dbconnect();

