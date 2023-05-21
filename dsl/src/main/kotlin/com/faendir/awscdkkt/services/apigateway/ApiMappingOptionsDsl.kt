package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiMappingOptions

@Generated
public fun apiMappingOptions(initializer: ApiMappingOptions.Builder.() -> Unit = {}):
    ApiMappingOptions = ApiMappingOptions.builder().apply(initializer).build()
