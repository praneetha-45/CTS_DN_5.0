import './App.css';

import { ListofPlayers, Scorebelow70 } from './ListofPlayers';

import {
  OddPlayers,
  EvenPlayers,
  IndianPlayers,
  ListofIndianPlayers
} from './IndianPlayers';

function App() {

  const players = [

    { name: "Sachin1", score: 80 },
    { name: "Dhoni", score: 95 },
    { name: "Virat", score: 88 },
    { name: "Rohit", score: 70 },
    { name: "Rahul", score: 65 },
    { name: "Hardik", score: 60 },
    { name: "Jadeja", score: 75 },
    { name: "Ashwin", score: 55 },
    { name: "Bumrah", score: 90 },
    { name: "Shami", score: 68 },
    { name: "Gill", score: 78 }

  ];

  const oddTeam = ["Sachin", "Virat", "Rahul"];

  const evenTeam = ["Dhoni", "Rohit", "Hardik"];

  const flag = false;

  if (flag === false) {

    return (

      <div className="App">

        <h1>List of Players</h1>

        <ListofPlayers players={players} />

        <hr />

        <h1>List of Players having Scores Less than 70</h1>

        <Scorebelow70 players={players} />

      </div>

    );

  }

  else {

    return (

      <div className="App">

        <h1>Odd Players</h1>

        <OddPlayers players={oddTeam} />

        <hr />

        <h1>Even Players</h1>

        <EvenPlayers players={evenTeam} />

        <hr />

        <h1>List of Indian Players Merged:</h1>

        <ListofIndianPlayers IndianPlayers={IndianPlayers} />

      </div>

    );

  }

}

export default App;