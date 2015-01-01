package de.hdm.hdmUrlaub.shared;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;

import de.hdm.hdmUrlaub.shared.bo.UrlaubsantragBo;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface GreetingServiceAsync {
	void greetServer(String input, AsyncCallback<String> callback)
			throws IllegalArgumentException;

	void getUrlaubsantrags(AsyncCallback<List<UrlaubsantragBo>> callback);

	void saveUrlaubsAntrag(UrlaubsantragBo urlaubsantragBo,
			AsyncCallback<Void> callback);
}
