import React from 'react'
import Cookies from 'js-cookie';

function getUsername() {
    const myCookie = Cookies.get('LoginCookie');
    return myCookie;
}

function Hello() {
    const username = getUsername();

    return (
        <>
            Hello, {username}
        </>
    )
};

export default Hello;
