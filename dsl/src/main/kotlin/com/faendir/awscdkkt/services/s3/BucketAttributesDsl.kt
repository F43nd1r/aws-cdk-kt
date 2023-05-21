package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketAttributes

@Generated
public fun bucketAttributes(initializer: BucketAttributes.Builder.() -> Unit = {}): BucketAttributes
    = BucketAttributes.builder().apply(initializer).build()
