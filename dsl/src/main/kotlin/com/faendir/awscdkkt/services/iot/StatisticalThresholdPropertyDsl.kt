@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

public
    fun statisticalThresholdProperty(initializer: CfnSecurityProfile.StatisticalThresholdProperty.Builder.() -> Unit):
    CfnSecurityProfile.StatisticalThresholdProperty =
    CfnSecurityProfile.StatisticalThresholdProperty.builder().apply(initializer).build()
