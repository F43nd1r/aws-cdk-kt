package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun serverTimingHeadersConfigProperty(initializer: CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty =
    CfnResponseHeadersPolicy.ServerTimingHeadersConfigProperty.builder().apply(initializer).build()
