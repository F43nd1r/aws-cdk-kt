package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.NotificationKeyFilter

@Generated
public fun notificationKeyFilter(initializer: NotificationKeyFilter.Builder.() -> Unit = {}):
    NotificationKeyFilter = NotificationKeyFilter.builder().apply(initializer).build()
