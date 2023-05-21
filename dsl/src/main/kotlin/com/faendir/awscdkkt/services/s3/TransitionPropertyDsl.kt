package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun transitionProperty(initializer: CfnBucket.TransitionProperty.Builder.() -> Unit = {}):
    CfnBucket.TransitionProperty = CfnBucket.TransitionProperty.builder().apply(initializer).build()
