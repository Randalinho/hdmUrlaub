package de.hdm.hdmUrlaub.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import de.hdm.hdmUrlaub.shared.bo.UrlaubsantragBo;

/**
 * The client-side stub for the RPC service.
 */
@RemoteServiceRelativePath("greet")
public interface GreetingService extends RemoteService {
	String greetServer(String name) throws IllegalArgumentException;

	public List<UrlaubsantragBo> getUrlaubsantrags();

	public void saveUrlaubsAntrag(UrlaubsantragBo urlaubsantragBo);
}
