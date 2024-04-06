package fr.kayp.bol.repository;

public interface ProofOfAuthenticityRepository {

    String createProofOfAuthenticity(String serializedEbl) throws Exception;

}