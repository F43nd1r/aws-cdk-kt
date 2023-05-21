package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun tagFilterProperty(initializer: CfnBucket.TagFilterProperty.Builder.() -> Unit = {}):
    CfnBucket.TagFilterProperty = CfnBucket.TagFilterProperty.builder().apply(initializer).build()
