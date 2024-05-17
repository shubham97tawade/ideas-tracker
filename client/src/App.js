import { BrowserRouter, Route, Routes } from "react-router-dom";
import Home from "./Home";
import Idea from "./Idea";

const App = () => {
    return(
        <BrowserRouter>
            <Routes>
                <Route path="/" exact element={<Home/>} />
                <Route path="/idea/:id" exact element={<Idea/>} />
            </Routes>
        </BrowserRouter>
    )
}

export default App;