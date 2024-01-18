import Cookies from 'js-cookie'
import Hello from './Components/Hello/Hello'
import LoginForm from './Components/Login/LoginForm'
import React from 'react'
import LogoutButton from './Components/Logout/LogoutButton'

function getCookie() {
  const cookie = Cookies.get('LoginCookie')
  return cookie;
}

function App() {
  const cookie = getCookie();
  if (cookie === "undefined")
    return (
      <>
        <div>
          <Hello />
        </div>
        <div>
          <LogoutButton />
        </div>
      </>
    );

  return (
    <div>
      <LoginForm />
    </div>
  )

};

export default App;
