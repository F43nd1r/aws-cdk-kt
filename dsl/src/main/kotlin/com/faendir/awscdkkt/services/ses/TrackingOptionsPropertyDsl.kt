package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

@Generated
public
    fun trackingOptionsProperty(initializer: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit
    = {}): CfnConfigurationSet.TrackingOptionsProperty =
    CfnConfigurationSet.TrackingOptionsProperty.builder().apply(initializer).build()
