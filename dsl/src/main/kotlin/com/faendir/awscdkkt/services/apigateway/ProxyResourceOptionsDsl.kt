package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.ProxyResourceOptions

@Generated
public fun proxyResourceOptions(initializer: ProxyResourceOptions.Builder.() -> Unit = {}):
    ProxyResourceOptions = ProxyResourceOptions.builder().apply(initializer).build()
