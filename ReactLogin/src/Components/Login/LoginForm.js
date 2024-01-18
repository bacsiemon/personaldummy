import React from 'react'
import Cookies from 'js-cookie';
import { useState } from "react";

function Login() {

  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');

  const handleLogin = () => {
    Cookies.set('LoginCookie', {username}, { expires: 1 });
    console.log('Cookie set');
  };


  return (
    <form onSubmit={handleLogin}>
      <input
        type="text"
        placeholder="Username"
        value={username}
        onChange={(e) => setUsername(e.target.value)}
      />
      <br />
      <input
        type="password"
        placeholder="Password"
        value={password}
        onChange={(e) => setPassword(e.target.value)}
      />
      <br />
      <button type='submit'>Login</button>
    </form>

  );
}

export default Login;
