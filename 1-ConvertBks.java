import java.io.*;import java.security.*;import java.util.*;
public final class ConvertBks {
 public static void main(String[] args)throws Exception {
  Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
  char[] sp=System.getenv("KEYSTORE_PASSWORD").toCharArray(),kp=System.getenv("KEY_PASSWORD").toCharArray();
  String alias=System.getenv("KEY_ALIAS");
  KeyStore source=KeyStore.getInstance("BKS","BC");try(InputStream in=new FileInputStream(args[0])){source.load(in,sp);}
  Key key=source.getKey(alias,kp);if(key==null)throw new IllegalArgumentException("Requested signing alias is absent");
  java.security.cert.Certificate[] chain=source.getCertificateChain(alias);
  String fp=HexFormat.of().formatHex(MessageDigest.getInstance("SHA-256").digest(chain[0].getEncoded()));
  if(!fp.equals("0a8b609561f299eaba4518c57e558d506e3991bd0ac551cc167716241adad55f"))throw new IllegalStateException("Signing certificate mismatch");
  KeyStore dest=KeyStore.getInstance("PKCS12");dest.load(null,null);dest.setKeyEntry(alias,key,kp,chain);
  try(OutputStream out=new FileOutputStream(args[1])){dest.store(out,kp);}
  Arrays.fill(sp,'\0');Arrays.fill(kp,'\0');
 }
}
