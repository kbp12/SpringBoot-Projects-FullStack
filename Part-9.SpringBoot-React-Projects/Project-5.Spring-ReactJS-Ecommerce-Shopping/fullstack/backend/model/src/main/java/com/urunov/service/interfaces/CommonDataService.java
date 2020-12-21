package com.urunov.service.interfaces;

import com.urunov.dto.ProductInfoDTO;
import com.urunov.entity.elements.info.ProductInfo;
import com.urunov.model.FilterAttributesResponse;
import com.urunov.model.HomeTabsDataResponse;
import com.urunov.model.MainScreenResponse;
import com.urunov.model.SearchSuggestionResponse;

import java.util.HashMap;

/**
 * User: hamdamboy
 * Project: model
 * Github: @urunov
 */
public interface CommonDataService {

    MainScreenResponse getHomeScreenData(String apiName);

    FilterAttributesResponse getFilterAttributesByProducts(String queryParams);

    ProductInfoDTO getProductsByCategories(String queryParams);

    HashMap<Integer, ProductInfo> getProductsById(String queryParams);

    HomeTabsDataResponse getBrainsAndApparelsByGender(String apiName);

    SearchSuggestionResponse getSearchSuggestionList();
}