package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration

@Generated
public fun notificationConfiguration(initializer: NotificationConfiguration.Builder.() -> Unit =
    {}): NotificationConfiguration = NotificationConfiguration.builder().apply(initializer).build()
