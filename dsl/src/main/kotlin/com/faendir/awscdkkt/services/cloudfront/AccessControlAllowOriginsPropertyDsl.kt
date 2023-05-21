package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun accessControlAllowOriginsProperty(initializer: CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty =
    CfnResponseHeadersPolicy.AccessControlAllowOriginsProperty.builder().apply(initializer).build()
