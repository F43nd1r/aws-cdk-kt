package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public
    fun singleQueryArgumentProperty(initializer: CfnWebACL.SingleQueryArgumentProperty.Builder.() -> Unit
    = {}): CfnWebACL.SingleQueryArgumentProperty =
    CfnWebACL.SingleQueryArgumentProperty.builder().apply(initializer).build()
