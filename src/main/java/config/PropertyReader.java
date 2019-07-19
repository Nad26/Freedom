package config;

import java.io.*;
import java.util.Properties;

public class PropertyReader {

	File projectDir = new File(System.getProperty("user.dir"));
    String env;
    public String browser;


    public PropertyReader() {
		loadEnvProperties();
	}

	private void loadEnvProperties() {
		Properties prop = new Properties();
	    try {
			prop.load(new FileInputStream(getFile(Constant.CONFIG_PROPERTIES_DIRECTORY)));
			env = prop.getProperty("AppEnv");
			browser = prop.getProperty("browser");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}


	private String getDataFile() throws Exception {

		String File = null;

		if (env.equals("QC")){
			File = getFile(Constant.QC_PROPERTIES_DIRECTORY);
		}
		else if (env.equals("PROD")){
			File = getFile(Constant.PROD_PROPERTIES_DIRECTORY);
		}
		return File;
	}


	public String getData (String key)throws Exception {

        Properties DataProp = new Properties();
        DataProp.load(new FileInputStream(getDataFile()));
		if (DataProp.getProperty(key) ==null){
			return "";
		}
		return DataProp.getProperty(key);
	}

	public String readPropertiesFileForCMD(String term) throws IOException {
		Properties p = new Properties();
		FileInputStream fi = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\properties\\config.properties");
		p.load(fi);
		return p.getProperty(term.toLowerCase());
	}

	private String getFile(String relativePath) {
		String data = null;
		try {
			File FilePath = projectDir;
			File file = new File(FilePath, relativePath);
			data = String.valueOf(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return data;
	}

	public String getUserName () throws Exception {
		return getData("user");
	}

	public String getUserPassword () throws Exception {
		return getData("pass");
	}

	public String getAppUrl (String portal) throws Exception {
		return getData("URL")+"/"+portal;
	}



}


