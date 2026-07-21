import React, { useState } from "react";
import "./App.css";
import Greeting from "./Greeting";
import LoginButton from "./LoginButton";
import LogoutButton from "./LogoutButton";

function App() {

  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin = () => {
    setIsLoggedIn(true);
  };

  const handleLogout = () => {
    setIsLoggedIn(false);
  };

  return (

    <div className="App">

      <Greeting isLoggedIn={isLoggedIn} />

      {

        isLoggedIn ?

          <LogoutButton onClick={handleLogout} />

          :

          <LoginButton onClick={handleLogin} />

      }

    </div>

  );

}

export default App;