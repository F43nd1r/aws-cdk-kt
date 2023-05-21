package com.faendir.awscdkkt.services.wafv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.wafv2.CfnWebACL

@Generated
public fun fieldToMatchProperty(initializer: CfnWebACL.FieldToMatchProperty.Builder.() -> Unit =
    {}): CfnWebACL.FieldToMatchProperty =
    CfnWebACL.FieldToMatchProperty.builder().apply(initializer).build()
