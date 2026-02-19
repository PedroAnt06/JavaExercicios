package PedidosPOOENUM.entities;

import PedidosPOOENUM.entities.enums.StatusPedido;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {

    public static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private StatusPedido statusPedido;

    private Cliente cliente;
    private List<ItensPedido> itens = new ArrayList<>();

    public Pedido() {
    }

    public Pedido(Date moment, StatusPedido statusPedido, Cliente cliente) {
        this.moment = moment;
        this.statusPedido = statusPedido;
        this.cliente = cliente;
    }

    public Pedido(Date moment, StatusPedido statusPedido) {
        this.moment = moment;
        this.statusPedido = statusPedido;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public StatusPedido getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(StatusPedido statusPedido) {
        this.statusPedido = statusPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItensPedido> getItens() {
        return itens;
    }

    public void addItem(ItensPedido item){
        itens.add(item);
    }

    public void removeItem(ItensPedido item){
        itens.remove(item);
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "moment=" + moment +
                ", statusPedido=" + statusPedido +
                ", cliente =" + cliente.getNome() + cliente.getEmail() + cliente.getBirthDate() +
                ", itens=" +  +
                '}';
    }
}
