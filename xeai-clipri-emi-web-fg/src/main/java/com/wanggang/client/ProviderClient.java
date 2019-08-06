package com.wanggang.client;

import com.wanggang.core.api.ProviderApi;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient("core-service")
public interface ProviderClient extends ProviderApi {

}
