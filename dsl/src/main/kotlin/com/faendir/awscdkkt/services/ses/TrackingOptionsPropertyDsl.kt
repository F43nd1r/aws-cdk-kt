@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSet

public
    fun trackingOptionsProperty(initializer: CfnConfigurationSet.TrackingOptionsProperty.Builder.() -> Unit):
    CfnConfigurationSet.TrackingOptionsProperty =
    CfnConfigurationSet.TrackingOptionsProperty.builder().apply(initializer).build()
