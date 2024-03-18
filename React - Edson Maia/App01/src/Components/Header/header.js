import styles from './Header.module.css';

export default function Header(){
    return (
        <header className={styles.containerHeader}>
            <span>TuzaFlix</span>
            <nav>
                <a href='#'>HOME</a>
                <a href='#'>ASSISTIR</a>
            </nav>  
        </header>
    )
}
