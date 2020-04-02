package io.exiled.salesbook.service;

import java.util.List;

public interface PreOrderService {
    String buildLink(String link);

    List<String> findFolders(String path);
}
