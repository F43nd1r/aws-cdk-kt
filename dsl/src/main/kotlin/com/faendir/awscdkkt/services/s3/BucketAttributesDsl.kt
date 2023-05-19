@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketAttributes

public fun bucketAttributes(initializer: BucketAttributes.Builder.() -> Unit): BucketAttributes =
    BucketAttributes.builder().apply(initializer).build()
