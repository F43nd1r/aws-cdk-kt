package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.BasePathMappingOptions

@Generated
public fun basePathMappingOptions(initializer: BasePathMappingOptions.Builder.() -> Unit = {}):
    BasePathMappingOptions = BasePathMappingOptions.builder().apply(initializer).build()
