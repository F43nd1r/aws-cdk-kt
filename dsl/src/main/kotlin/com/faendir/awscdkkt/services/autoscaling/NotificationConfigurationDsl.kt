@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.autoscaling

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.NotificationConfiguration

public fun notificationConfiguration(initializer: NotificationConfiguration.Builder.() -> Unit):
    NotificationConfiguration = NotificationConfiguration.builder().apply(initializer).build()
