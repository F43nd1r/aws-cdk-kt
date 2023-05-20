@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

public
    fun notificationChannelProperty(initializer: CfnStreamProcessor.NotificationChannelProperty.Builder.() -> Unit):
    CfnStreamProcessor.NotificationChannelProperty =
    CfnStreamProcessor.NotificationChannelProperty.builder().apply(initializer).build()
