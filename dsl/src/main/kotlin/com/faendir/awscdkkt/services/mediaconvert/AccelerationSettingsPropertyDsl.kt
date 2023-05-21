package com.faendir.awscdkkt.services.mediaconvert

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.mediaconvert.CfnJobTemplate

@Generated
public
    fun accelerationSettingsProperty(initializer: CfnJobTemplate.AccelerationSettingsProperty.Builder.() -> Unit
    = {}): CfnJobTemplate.AccelerationSettingsProperty =
    CfnJobTemplate.AccelerationSettingsProperty.builder().apply(initializer).build()
