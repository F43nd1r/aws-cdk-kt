package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun ruleProperty(initializer: CfnBucket.RuleProperty.Builder.() -> Unit = {}):
    CfnBucket.RuleProperty = CfnBucket.RuleProperty.builder().apply(initializer).build()
