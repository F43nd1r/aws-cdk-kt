package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun filterRuleProperty(initializer: CfnBucket.FilterRuleProperty.Builder.() -> Unit = {}):
    CfnBucket.FilterRuleProperty = CfnBucket.FilterRuleProperty.builder().apply(initializer).build()
