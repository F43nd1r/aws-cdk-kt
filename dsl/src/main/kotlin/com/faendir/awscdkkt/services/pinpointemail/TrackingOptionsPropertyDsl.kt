package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnConfigurationSet

@Generated
public
    fun trackingOptionsProperty(initializer: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.TrackingOptionsProperty =
    CfnConfigurationSet.TrackingOptionsProperty.builder().apply(initializer).build()
