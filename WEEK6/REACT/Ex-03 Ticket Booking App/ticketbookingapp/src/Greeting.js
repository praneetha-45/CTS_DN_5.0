import UserPage from "./UserPage";
import GuestPage from "./GuestPage";

function Greeting(props) {

    if (props.isLoggedIn) {

        return <UserPage />;

    }

    return <GuestPage />;

}

export default Greeting;