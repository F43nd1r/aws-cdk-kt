package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public
    fun notificationFilterProperty(initializer: CfnBucket.NotificationFilterProperty.Builder.() -> Unit
    = {}): CfnBucket.NotificationFilterProperty =
    CfnBucket.NotificationFilterProperty.builder().apply(initializer).build()
