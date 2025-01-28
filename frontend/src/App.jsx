import {BrowserRouter, Route, Routes} from 'react-router-dom'
import './App.css'
import {HomeComponent} from './Components/Home/HomeComponent'

function App() {

    return (
        <>
            <BrowserRouter>
                <Routes>
                    <Route exact path='/' element={<HomeComponent/>}></Route>
                </Routes>
            </BrowserRouter>
        </>
    )
}

export default App
