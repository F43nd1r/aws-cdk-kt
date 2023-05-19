@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

public
    fun statisticalThresholdProperty(initializer: CfnSecurityProfile.StatisticalThresholdProperty.Builder.() -> Unit):
    CfnSecurityProfile.StatisticalThresholdProperty =
    CfnSecurityProfile.StatisticalThresholdProperty.builder().apply(initializer).build()
