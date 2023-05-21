package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnWebACL

@Generated
public fun wafActionProperty(initializer: CfnWebACL.WafActionProperty.Builder.() -> Unit = {}):
    CfnWebACL.WafActionProperty = CfnWebACL.WafActionProperty.builder().apply(initializer).build()
