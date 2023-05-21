package com.faendir.awscdkkt.services.sagemaker

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sagemaker.CfnWorkteam

@Generated
public
    fun notificationConfigurationProperty(initializer: CfnWorkteam.NotificationConfigurationProperty.Builder.() -> Unit
    = {}): CfnWorkteam.NotificationConfigurationProperty =
    CfnWorkteam.NotificationConfigurationProperty.builder().apply(initializer).build()
