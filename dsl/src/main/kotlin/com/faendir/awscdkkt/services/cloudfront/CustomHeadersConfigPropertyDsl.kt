package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun customHeadersConfigProperty(initializer: CfnResponseHeadersPolicy.CustomHeadersConfigProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.CustomHeadersConfigProperty =
    CfnResponseHeadersPolicy.CustomHeadersConfigProperty.builder().apply(initializer).build()
