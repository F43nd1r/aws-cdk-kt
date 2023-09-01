package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.RequestContext

@Generated
public fun buildRequestContext(initializer: @AwsCdkDsl RequestContext.Builder.() -> Unit = {}):
    RequestContext = RequestContext.Builder().apply(initializer).build()
