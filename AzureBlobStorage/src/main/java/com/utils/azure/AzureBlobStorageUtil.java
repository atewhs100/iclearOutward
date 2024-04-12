/*
 * package com.utils.azure;
 * 
 * import java.io.File; import java.net.URISyntaxException; import
 * java.security.InvalidKeyException;
 * 
 * import com.microsoft.azure.storage.CloudStorageAccount; import
 * com.microsoft.azure.storage.blob.CloudBlobClient; import
 * com.microsoft.azure.storage.file.FileInputStream;
 * 
 * public class AzureBlobStorageUtil {
 * 
 * public static CloudBlobClient createCloudBlobClient(String connectionString)
 * throws InvalidKeyException, URISyntaxException {
 * 
 * CloudStorageAccount account = CloudStorageAccount.parse(connectionString);
 * return account.createCloudBlobClient();
 * 
 * }
 * 
 * public static ClientBlockBlob uploadFile(String connectionString, String
 * containerName, String filePath, byte[] data) {
 * 
 * String finalPath = getLocalPath(connectionString) + "/" + containerName + "/"
 * + filePath; File tempFile = new File(finalPath); if
 * (!tempFile.getParentFile().exists()) { tempFile.getParentFile().mkdirs(); }
 * try(FileInputStream fos = new FileInputStream(tempFile)){ fos.w } }
 * 
 * public static boolean getLocalPath(String connectionString) { return null !=
 * connectionString && connectionString.equals("LOCAL"); }
 * 
 * }
 */