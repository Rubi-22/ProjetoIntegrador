package com.example.AulaTeste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.AulaTeste.model.UserModel;
import com.example.AulaTeste.repository.IUserRepository;
import jakarta.transaction.Transactional;
@Service
public class UsuarioService {
    @Autowired
    private IUserRepository usuarioRepository;

    public UserModel criarUsuario(UserModel userModel) {
        var userExistente = usuarioRepository.findByEmail(userModel.getEmail());
        if (userExistente != null) {
            throw new Error();
        }

        return usuarioRepository.save(userModel);
    }

    public List<UserModel> listarUsuarios() {
        return usuarioRepository.findAll();
    }

    public UserModel buscarPorEmail(String email) {
        return usuarioRepository.findByEmail(email);
    }


    @Transactional
    public void deletarPorEmail(String email) {
        usuarioRepository.deleteByEmail(email);
    }
}
