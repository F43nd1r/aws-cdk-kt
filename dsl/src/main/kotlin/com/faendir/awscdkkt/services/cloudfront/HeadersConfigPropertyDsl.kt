package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

@Generated
public
    fun headersConfigProperty(initializer: CfnOriginRequestPolicy.HeadersConfigProperty.Builder.() -> Unit
    = {}): CfnOriginRequestPolicy.HeadersConfigProperty =
    CfnOriginRequestPolicy.HeadersConfigProperty.builder().apply(initializer).build()
