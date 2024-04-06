package fr.kayp.bol.repository.impl;

import fr.kayp.bol.repository.ProofOfAuthenticityRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.EthChainId;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;
import org.web3j.tx.gas.DefaultGasProvider;

import java.io.IOException;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

@Repository
public class DefaultProofOfAuthenticityRepository implements ProofOfAuthenticityRepository {

    private final String privateKey;
    private final String network;
    private Credentials credentials;
    private Web3j web3j;
    private EthChainId chainId;

    public DefaultProofOfAuthenticityRepository(@Value("${proofOfAuthenticity.privateKey}") final String privateKey,
                                                @Value("${proofOfAuthenticity.network}") final String network) throws IOException {
        this.privateKey = privateKey;
        this.network = network;
        this.credentials = Credentials.create(privateKey);
        this.web3j = Web3j.build(new HttpService(network));
        this.chainId = web3j.ethChainId().send();
    }

    @Override
    public String createProofOfAuthenticity(String serializedEbl) throws Exception {
//        TransactionManager txManager = new RawTransactionManager(web3j, credentials, chainId.getChainId().longValue());
//
//        System.out.println("Deploying contract ...");
//        String eBL = "eBL";
//        Date date = new Date();
//        Timestamp ts = new Timestamp(date.getTime());
//
        /*
            to hash:

        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(
                serializedEbl.getBytes());
        */

//        RemoteCall<BillOfLadingContract> call = BillOfLadingContract.deploy(web3j, txManager, new DefaultGasProvider(),
//                eBL, BigInteger.valueOf(Timestamp.valueOf(ts.toString()).getTime()));
//
//        BillOfLadingContract billOfLadingContract = call.send();
//
//        System.out.println("Deploying contract : " + billOfLadingContract.getContractAddress());
//        return billOfLadingContract.getContractAddress();
        return "";
    }
}
