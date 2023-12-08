from rich import print
from rich.table import Table

# Criar uma tabela
table = Table(title="Painel de Exemplo", style="blue")
table.add_column("Coluna 1")
table.add_column("Coluna 2")
table.add_row("Oi, Amanadinha da minha vida!!!", "Salveeee")

# Imprimir a tabela
print(table)


#-----------------------------------------------------------------------------------------------------


from rich import print
from rich.panel import Panel

# Criar um painel com texto estilizado
panel = Panel("Texto estilizado no painel", title="Painel de Exemplo", style="bold green")

# Imprimir o painel
print(panel)