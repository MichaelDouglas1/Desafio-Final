package com.stefanini.teste.servico;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.stefanini.dao.PessoaPerfilDao;
import com.stefanini.model.PessoaPerfil;
import com.stefanini.servico.PessoaPerfilServico;



@RunWith(MockitoJUnitRunner.class)
public class PessoaPerfilServicoTest {

    @InjectMocks
    PessoaPerfilServico servico;

    @Mock
    PessoaPerfilDao dao;

    Stream<PessoaPerfil> streansRetorno;

    @Before
    public void setup() {
        Set<PessoaPerfil> conjuntoPessoaPerfil = new HashSet<>();
        conjuntoPessoaPerfil.add(new PessoaPerfil());
        streansRetorno = conjuntoPessoaPerfil.stream();

        buscarPessoaPerfilMock();
    }

    public void buscarPessoaPerfilMock() {
        Mockito.when(dao.buscarPessoaPerfil(Mockito.anyLong(), Mockito.anyLong())).thenReturn(streansRetorno);
    }

    @Test
    public void buscarPessoaPerfilTest() {
        servico.buscarPessoaPerfil(Long.MIN_VALUE, Long.MAX_VALUE);
    }

}