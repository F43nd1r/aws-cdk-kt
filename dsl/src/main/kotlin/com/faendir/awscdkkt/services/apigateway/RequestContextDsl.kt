package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestContext

@Generated
public fun requestContext(initializer: RequestContext.Builder.() -> Unit = {}): RequestContext =
    RequestContext.builder().apply(initializer).build()
