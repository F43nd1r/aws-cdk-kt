package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnWebACL

@Generated
public fun activatedRuleProperty(initializer: CfnWebACL.ActivatedRuleProperty.Builder.() -> Unit =
    {}): CfnWebACL.ActivatedRuleProperty =
    CfnWebACL.ActivatedRuleProperty.builder().apply(initializer).build()
