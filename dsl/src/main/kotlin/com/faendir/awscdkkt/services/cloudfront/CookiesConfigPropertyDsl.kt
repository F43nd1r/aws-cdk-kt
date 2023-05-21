package com.faendir.awscdkkt.services.cloudfront

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.CfnOriginRequestPolicy

@Generated
public
    fun cookiesConfigProperty(initializer: CfnOriginRequestPolicy.CookiesConfigProperty.Builder.() -> Unit
    = {}): CfnOriginRequestPolicy.CookiesConfigProperty =
    CfnOriginRequestPolicy.CookiesConfigProperty.builder().apply(initializer).build()
