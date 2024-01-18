import Cookies from 'js-cookie';
import React from 'react'


function handleLogout() {
    Cookies.remove('LoginCookie');
    console.log('cookie removed');
};

function Logout() {
    return (
        <>
            <button onClick={handleLogout}>Logout</button>
        </>
    );
}

export default Logout;
