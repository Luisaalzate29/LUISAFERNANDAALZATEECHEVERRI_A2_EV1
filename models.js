const mongoose = require('mongosse');
const UserModel = new mongoose.Schema(
{
nomuser:{

    type:string
},

password:{
    type: string
}

},
{
timestamps:true,
versionkey:false,

}
)