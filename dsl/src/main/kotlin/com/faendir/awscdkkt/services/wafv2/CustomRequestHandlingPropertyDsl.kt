package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun customRequestHandlingProperty(initializer: CfnWebACL.CustomRequestHandlingProperty.Builder.() -> Unit
    = {}): CfnWebACL.CustomRequestHandlingProperty =
    CfnWebACL.CustomRequestHandlingProperty.builder().apply(initializer).build()
