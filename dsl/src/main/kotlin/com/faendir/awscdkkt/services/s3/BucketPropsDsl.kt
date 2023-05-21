package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketProps

@Generated
public fun bucketProps(initializer: BucketProps.Builder.() -> Unit = {}): BucketProps =
    BucketProps.builder().apply(initializer).build()
