package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.CustomEndpointOptions

@Generated
public fun customEndpointOptions(initializer: CustomEndpointOptions.Builder.() -> Unit = {}):
    CustomEndpointOptions = CustomEndpointOptions.builder().apply(initializer).build()
