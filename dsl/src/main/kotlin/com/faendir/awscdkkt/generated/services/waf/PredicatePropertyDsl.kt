package com.faendir.awscdkkt.generated.services.waf

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.waf.CfnRule

@Generated
public fun buildPredicateProperty(initializer: @AwsCdkDsl
    CfnRule.PredicateProperty.Builder.() -> Unit = {}): CfnRule.PredicateProperty =
    CfnRule.PredicateProperty.Builder().apply(initializer).build()
