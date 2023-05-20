@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketMetrics

public fun bucketMetrics(initializer: BucketMetrics.Builder.() -> Unit): BucketMetrics =
    BucketMetrics.builder().apply(initializer).build()
