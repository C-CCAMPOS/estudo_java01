package repositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import entities.Pessoa;
import factory.ConnectionFactory;
import interfaces.IRepository;

public class PessoaRepository implements IRepository<Pessoa> {

	@Override
	public void save(Pessoa entity) throws Exception {
		// TODO Auto-generated method stub
		
		Connection connection = ConnectionFactory.getConnection();
		
		PreparedStatement statement = connection.prepareStatement("insert into pessoa(nome, email) values(?,?)");
		
		statement.setString(1, entity.getName());
		statement.setString(2, entity.getEmail());
		statement.execute();
		
		connection.close();;
		
		
	}

	@Override
	public void update(Pessoa entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Pessoa entity) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Pessoa> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pessoa finfById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
