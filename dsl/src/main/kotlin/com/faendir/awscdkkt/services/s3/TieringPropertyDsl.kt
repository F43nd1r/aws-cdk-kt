package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun tieringProperty(initializer: CfnBucket.TieringProperty.Builder.() -> Unit = {}):
    CfnBucket.TieringProperty = CfnBucket.TieringProperty.builder().apply(initializer).build()
