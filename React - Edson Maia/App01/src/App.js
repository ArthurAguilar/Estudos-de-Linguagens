import Header from './Components/Header/header'
import Footer from './Components/Footer/footer'
import Banner from './Components/Banner/banner'
import Container from './Components/Container/container'
import Card from './Components/Card/card'
import videos from './json/db.json'


export default function App() {
  return (
    <>
      <Header/>
      <Banner image = "home"/>
      <Container>
          <h2>Geografia</h2>
          <section className="cards">
              {
                videos.map((video) => {
                  return <Card id={ video.id } key= { video.id }/>
                })
              }
          </section>
      </Container>
      <Footer/>
    </>
  )
}