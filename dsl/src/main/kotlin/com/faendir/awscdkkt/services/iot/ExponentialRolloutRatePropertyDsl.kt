package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnJobTemplate

@Generated
public
    fun exponentialRolloutRateProperty(initializer: CfnJobTemplate.ExponentialRolloutRateProperty.Builder.() -> Unit
    = {}): CfnJobTemplate.ExponentialRolloutRateProperty =
    CfnJobTemplate.ExponentialRolloutRateProperty.builder().apply(initializer).build()
