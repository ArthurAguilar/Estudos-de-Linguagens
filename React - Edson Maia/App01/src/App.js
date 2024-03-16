import React from 'react'
import Header from './Components/Header'
import Footer from './Components/Footer'


export default function App() {
  return (
    <>
      <Header/>
      <div className='containerPai'>
        <p>Hello World! Olá mundo!</p>
        <p>Oi, eu sou o Arthur Aguilar!</p>
        <p>Sou desenvolvedor de software.</p>
        <p>Hoje estou aprendendo sobre ReactJS</p>
      </div>
      <Footer/>
    </>
  )
}