package fr.kayp.bol.repository.impl;

import fr.kayp.bol.repository.ProofOfAuthenticityRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.stream.Collectors;

@Repository
public class DefaultProofOfAuthenticityRepository implements ProofOfAuthenticityRepository {

    private final String privateKey;
    private final String network;

    public DefaultProofOfAuthenticityRepository(@Value("${proofOfAuthenticity.privateKey}") final String privateKey,
                                                @Value("${proofOfAuthenticity.network}") final String network) throws IOException {
        this.privateKey = privateKey;
        this.network = network;
    }

    @Override
    public String createProofOfAuthenticity(String serializedEbl) throws Exception {
        String[] command = { "python3", "src/main/resources/onChain/deploy.py", "--seed", privateKey, "--ebl" ,  serializedEbl };
        Process proc = new ProcessBuilder(command).start();

        proc.waitFor();
        BufferedReader lineReader = new BufferedReader(new InputStreamReader(proc.getInputStream()));
        return lineReader.lines().collect(Collectors.joining());
    }
}
