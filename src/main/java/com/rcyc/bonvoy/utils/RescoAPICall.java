/**
 *
 */
package com.rcyc.bonvoy.utils;

import com.rcyc.bonvoy.dto.resco.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * @author Sreejith J Nair
 * @date 2020-04-15
 *
 */
@Configuration
@SuppressWarnings("unused")
public class RescoAPICall<T> {

    private String rescoUrl = EnvironmentConstants.RESCO_URL;
    //private String rescoUrl="https://stgwebapi.ritz-carltonyachtcollection.com/rescoweb/ResWebConvert/InterfaceResco.aspx";

    private final Logger log = LoggerFactory.getLogger(com.rcyc.bonvoy.utils.RescoAPICall.class);

    /**
     *
     * @return
     * @throws IOException
     * @throws ConnectException
     */
    public HttpURLConnection rescoAPIConnection() throws IOException, ConnectException {
        log.debug("RescoService.rescoAPIConnection() started ******");

//		URL url = new URL("https://testresapi.ritz-carltonyachtcollection.com/rescoweb/ResWebConvert/InterfaceResco.aspx");
        URL url = new URL(rescoUrl);
        HttpURLConnection connection = null;
        connection = (HttpURLConnection) url.openConnection();
        connection.setDoOutput(true);
        connection.setInstanceFollowRedirects(false);
        connection.setRequestMethod("POST");
        connection.setRequestProperty("Content-Type", "application/xml");
        connection.setConnectTimeout(EnvironmentConstants.CONNECTION_TIMEOUT);
        connection.setReadTimeout(EnvironmentConstants.READ_TIMEOUT);

        log.debug("RescoService.rescoAPIConnection() ended ******");
        return connection;
    }

    @SuppressWarnings({"unchecked", "rawtypes"})
    /**
     *
     * Function is used to execute the Resco API . using JAXB for marshal and
     * unmarshal the request and response.
     *
     * @param requestJaxbElement
     * @param requestClassArray
     * @param resClass
     * @return
     * @throws ConnectException
     * @throws IOException
     * @throws JAXBException
     * @throws Exception
     */
    public T executeRescoAPI(Object requestJaxbElement, Class[] requestClassArray, Class resClass)
            throws ConnectException, IOException, JAXBException, Exception {

//		Class c = requestJaxbElement.getClass();
//		try {
//			Field field = c.getField("user");
//			Object fieldValue = field.get(requestJaxbElement);
//			User user = (User) fieldValue;
//			field.set(c, user);
//		} catch (Exception e) {
//			try {
//				Field field = c.getField("User");
//				Object fieldValue = field.get(requestJaxbElement);
//				User user = (User) fieldValue;
//				field.set(c, user);
//			} catch (Exception ex) {
//
//			}
//
//		}

        log.debug("RescoService.executeRescoAPI() started ******");
        T resChangeFolio = null;
        HttpURLConnection connection = null;
        try {
            connection = rescoAPIConnection();

            if (connection != null) {
                OutputStream os = connection.getOutputStream();
                JAXBContext jaxbContext = JAXBContext.newInstance(requestClassArray);
                try {
                    logRescoCall(jaxbContext, requestJaxbElement);
                } catch (Exception e) {
                    log.info("logging resco request failed");
                }
                jaxbContext.createMarshaller().marshal(requestJaxbElement, os);
                os.flush();
                BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuffer response = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    response.append(inputLine);
                }
                br.close();

                /*
                 * StringReader stringReader = null; if
                 * (resClass.getSimpleName().equalsIgnoreCase("ResInfoBookingDetail")) { //
                 * log.info("resco response of {},{}:", resClass.getSimpleName(),
                 * response.toString()); String resTest = ; stringReader = new
                 * StringReader(resTest);
                 *
                 * } else
                 */
                StringReader stringReader = new StringReader(response.toString());
                JAXBContext jaxbContextResponse = JAXBContext.newInstance(resClass);
                Unmarshaller unmarshaller = jaxbContextResponse.createUnmarshaller();

                resChangeFolio = (T) unmarshaller.unmarshal(stringReader);
            }
        } catch (ConnectException e) {
            throw e;
        } catch (IOException e) {
            throw e;
        } catch (JAXBException e) {
            e.printStackTrace();
            throw e;
        } catch (Exception e) {
            throw e;
        } finally {
            if (connection != null)
                connection.disconnect();
        }
        log.debug("RescoService.executeRescoAPI() ended ******");
        return resChangeFolio;
    }


    public void logRescoCall(JAXBContext jaxbContext, Object requestJaxbElement) throws JAXBException {
        boolean isLoggable = true;
//		if (requestJaxbElement instanceof ReqInfoFolio) {
//			ReqInfoFolio reqInfoFolio = (ReqInfoFolio) requestJaxbElement;
//			if (reqInfoFolio != null) {
//				Folio folio = reqInfoFolio.getFolio();
//				if (folio != null && (folio.getLogin() != null || folio.getPassword() != null)) {
//					isLoggable = false;
//				}
//			}
//
//		}
//
//		if (requestJaxbElement instanceof ReqAddFolio) {
//			ReqAddFolio reqAddFolio = (ReqAddFolio) requestJaxbElement;
//			if (reqAddFolio != null && reqAddFolio.getFoliolist() != null
//					&& reqAddFolio.getFoliolist().getFolio() != null
//					&& !reqAddFolio.getFoliolist().getFolio().isEmpty()) {
//
//				Folio folio = reqAddFolio.getFoliolist().getFolio().get(0);
//
//				if (folio != null && (folio.getLogin() != null || folio.getPassword() != null)) {
//					isLoggable = false;
//				}
//			}
//		}
//
//		if (requestJaxbElement instanceof ReqAddAgent) {
//			ReqAddAgent reqAddAgent = (ReqAddAgent) requestJaxbElement;
//			if (reqAddAgent != null) {
//				if (reqAddAgent.getAgentList() != null && reqAddAgent.getAgentList().getAgent() != null
//						&& !reqAddAgent.getAgentList().getAgent().isEmpty()) {
//					Agent agent = reqAddAgent.getAgentList().getAgent().get(0);
//					if (agent != null && (agent.getPassword() != null || agent.getPassword() != null)) {
//						isLoggable = false;
//					}
//				}
//			}
//
//		}
//
//		if (requestJaxbElement instanceof ReqChangeFolio) {
//			ReqChangeFolio reqChangeFolio = (ReqChangeFolio) requestJaxbElement;
//			if (reqChangeFolio != null) {
//				if (reqChangeFolio.getFoliolist() != null && reqChangeFolio.getFoliolist().getFolio() != null
//						&& !reqChangeFolio.getFoliolist().getFolio().isEmpty()) {
//
//					Folio folio = reqChangeFolio.getFoliolist().getFolio().get(0);
//					if (folio != null && (folio.getPassword() != null || folio.getLogin() != null)) {
//						isLoggable = false;
//					}
//				}
//
//			}
//
//		}
//
//		if (requestJaxbElement instanceof ReqSystemLogin) {
//			ReqSystemLogin reqSystemLogin = (ReqSystemLogin) requestJaxbElement;
//			if (reqSystemLogin != null && reqSystemLogin.getIdentity() != null) {
//				Identity identity = reqSystemLogin.getIdentity();
//				if (identity != null && (identity.getLogin() != null || identity.getPassword() != null)) {
//					isLoggable = false;
//				}
//			}
//
//		}
//
        if (isLoggable) {
            jaxbContext.createMarshaller().marshal(requestJaxbElement, System.out);
            log.info("\n");
        }

    }

}
