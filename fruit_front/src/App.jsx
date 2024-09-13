import { useState } from 'react'
import {BrowserRouter as Router, Route, Routes} from 'react-router-dom'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import Login from "./login.jsx";
import List from "./goods/list.jsx";
import Detail from "./goods/detail.jsx";
import Update from "./goods/admin/update.jsx";
import Insert from "./goods/admin/insert.jsx";

function App() {
  return (
      <>
          <Router>
              <Routes>
                  <Route path="/" element={<Login/>}/>
                  <Route path="/goods/list" element={<List/>}/>
                  <Route path="/goods/detail" element={<Detail/>}/>
                  <Route path="/goods/admin/insert" element={<Insert/>}/>
                  <Route path="/goods/admin/update" element={<Update/>}/>
              </Routes>
          </Router>
      </>

  )
}

export default App
