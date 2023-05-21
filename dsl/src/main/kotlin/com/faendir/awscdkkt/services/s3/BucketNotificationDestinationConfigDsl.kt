package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.BucketNotificationDestinationConfig

@Generated
public
    fun bucketNotificationDestinationConfig(initializer: BucketNotificationDestinationConfig.Builder.() -> Unit
    = {}): BucketNotificationDestinationConfig =
    BucketNotificationDestinationConfig.builder().apply(initializer).build()
