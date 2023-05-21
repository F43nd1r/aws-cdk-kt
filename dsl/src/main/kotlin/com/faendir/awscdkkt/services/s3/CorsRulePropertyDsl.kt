package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun corsRuleProperty(initializer: CfnBucket.CorsRuleProperty.Builder.() -> Unit = {}):
    CfnBucket.CorsRuleProperty = CfnBucket.CorsRuleProperty.builder().apply(initializer).build()
