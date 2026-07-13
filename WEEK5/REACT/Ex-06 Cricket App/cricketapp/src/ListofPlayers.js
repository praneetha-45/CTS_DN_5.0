import React from "react";

export function ListofPlayers(props) {

    return (

        <div>

            <ul>

                {

                    props.players.map((item) => {

                        return (

                            <li key={item.name}>
                                Mr. {item.name}
                                <span> {item.score}</span>
                            </li>

                        );

                    })

                }

            </ul>

        </div>

    );

}

export function Scorebelow70(props) {

    const players70 = props.players.filter(player => player.score <= 70);

    return (

        <div>

            <ul>

                {

                    players70.map((item) => {

                        return (

                            <li key={item.name}>
                                Mr. {item.name}
                                <span> {item.score}</span>
                            </li>

                        );

                    })

                }

            </ul>

        </div>

    );

}