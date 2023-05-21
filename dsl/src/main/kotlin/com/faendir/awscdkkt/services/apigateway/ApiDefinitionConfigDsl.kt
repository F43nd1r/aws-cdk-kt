package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ApiDefinitionConfig

@Generated
public fun apiDefinitionConfig(initializer: ApiDefinitionConfig.Builder.() -> Unit = {}):
    ApiDefinitionConfig = ApiDefinitionConfig.builder().apply(initializer).build()
