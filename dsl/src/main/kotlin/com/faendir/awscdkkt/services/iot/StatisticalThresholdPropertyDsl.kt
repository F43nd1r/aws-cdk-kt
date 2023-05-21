package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@Generated
public
    fun statisticalThresholdProperty(initializer: CfnSecurityProfile.StatisticalThresholdProperty.Builder.() -> Unit
    = {}): CfnSecurityProfile.StatisticalThresholdProperty =
    CfnSecurityProfile.StatisticalThresholdProperty.builder().apply(initializer).build()
