package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun removeHeadersConfigProperty(initializer: CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.RemoveHeadersConfigProperty =
    CfnResponseHeadersPolicy.RemoveHeadersConfigProperty.builder().apply(initializer).build()
