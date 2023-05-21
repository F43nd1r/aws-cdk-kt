package com.faendir.awscdkkt.services.rekognition

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rekognition.CfnStreamProcessor

@Generated
public
    fun notificationChannelProperty(initializer: CfnStreamProcessor.NotificationChannelProperty.Builder.() -> Unit
    = {}): CfnStreamProcessor.NotificationChannelProperty =
    CfnStreamProcessor.NotificationChannelProperty.builder().apply(initializer).build()
