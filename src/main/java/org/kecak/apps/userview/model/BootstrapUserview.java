package org.kecak.apps.userview.model;

/**
 * @author aristo
 *
 * Bootstrap Web UI Framework for Userview Theme
 */
public interface BootstrapUserview {
    /**
     * WARNING!!!!! these methods have to be implemented in Kecak Core
     * JSP File in Plugins cannot be recognized by Kecak Core
     * @return
     */

    String getUserviewJsp();

    String getPreviewJsp();

    String getDataListJsp();

    String getFormJsp();

    String getRunProcessJsp();

    String getLoginJsp();

    default String getUnauthorizedJsp() {
        return "userview/plugin/unauthorized.jsp";
    }

}
