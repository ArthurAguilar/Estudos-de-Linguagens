import style from "./Card.module.css"

export default function Card({ id }) {
    return (
        <div className={style.card}>
            <a 
                href={`https://www.youtube.com/watch?v=${ id }`}
                rel='noreferrer noopener'
                target='_blank'>
                    <img src={`https://img.youtube.com/vi/${ id }/maxresdefault.jpg`} alt='Capa do Video'/>         
            </a>
        </div>
    )
}
