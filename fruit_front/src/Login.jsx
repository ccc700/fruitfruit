import {useState} from "react";

function Login(){
    return(
        <>
            <h2>login</h2>
            <form action="/fruit_front/src/Login" method="post">
                <input type="text" name="username" placeholder="id"/><br/>
                <input type="password" name="password" placeholder="password"/><br/>
                <input type="submit" value="login"/>
            </form>
        </>
    )
}

export default Login
