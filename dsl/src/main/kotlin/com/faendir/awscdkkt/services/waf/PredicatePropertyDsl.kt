package com.faendir.awscdkkt.services.waf

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnRule

@Generated
public fun predicateProperty(initializer: CfnRule.PredicateProperty.Builder.() -> Unit = {}):
    CfnRule.PredicateProperty = CfnRule.PredicateProperty.builder().apply(initializer).build()
