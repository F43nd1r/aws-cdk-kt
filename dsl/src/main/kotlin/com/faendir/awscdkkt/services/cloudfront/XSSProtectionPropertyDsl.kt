package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnResponseHeadersPolicy

@Generated
public
    fun xSSProtectionProperty(initializer: CfnResponseHeadersPolicy.XSSProtectionProperty.Builder.() -> Unit
    = {}): CfnResponseHeadersPolicy.XSSProtectionProperty =
    CfnResponseHeadersPolicy.XSSProtectionProperty.builder().apply(initializer).build()
