
function Login(){
    return (
        <>
            <h2>Login</h2>
            <form action="/login" method="post">
                <input type="text" name="username" placeholder="id"/><br/>
                <input type="password" name="password" placeholder="password"/><br/>
                <input type="submit" value="Login"/>
            </form>
        </>
    )
}

export default Login