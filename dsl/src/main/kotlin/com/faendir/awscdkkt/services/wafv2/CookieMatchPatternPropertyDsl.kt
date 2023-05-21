package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun cookieMatchPatternProperty(initializer: CfnWebACL.CookieMatchPatternProperty.Builder.() -> Unit
    = {}): CfnWebACL.CookieMatchPatternProperty =
    CfnWebACL.CookieMatchPatternProperty.builder().apply(initializer).build()
