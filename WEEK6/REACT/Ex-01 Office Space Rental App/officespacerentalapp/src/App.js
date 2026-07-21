import './App.css';
import office from './office.jpg';

function App() {

  const heading = "Office Space";

  const officeList = [

    {
      Name: "DBS",
      Rent: 50000,
      Address: "Chennai",
      Image: office
    },

    {
      Name: "Regus",
      Rent: 75000,
      Address: "Hyderabad",
      Image: office
    },

    {
      Name: "WeWork",
      Rent: 90000,
      Address: "Bangalore",
      Image: office
    }

  ];

  return (

    <div className="container">

      <h1>{heading}, at Affordable Range</h1>

      {

        officeList.map((item, index) => (

          <div key={index} className="card">

            <img
              src={item.Image}
              alt="Office Space"
              width="25%"
              height="25%"
            />

            <h2>Name: {item.Name}</h2>

            <h3
              style={{
                color: item.Rent <= 60000 ? "red" : "green"
              }}
            >
              Rent: Rs. {item.Rent}
            </h3>

            <h3>Address: {item.Address}</h3>

          </div>

        ))

      }

    </div>

  );

}

export default App;