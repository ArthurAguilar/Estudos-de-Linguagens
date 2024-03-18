import Header from './Components/Header/header'
import Footer from './Components/Footer/footer'
import Banner from './Components/Banner/banner'
import Container from './Components/Container/container'



export default function App() {
  return (
    <>
      <Header/>
      <Banner/>
      <Container>
          <h1>Hello World! Olá mundo!</h1>
          <p>Oi, eu sou o Arthur Aguilar!</p>
          <p>Sou desenvolvedor de software.</p>
          <p>Hoje estou aprendendo sobre ReactJS</p>
      </Container>
      <Footer/>
    </>
  )
}