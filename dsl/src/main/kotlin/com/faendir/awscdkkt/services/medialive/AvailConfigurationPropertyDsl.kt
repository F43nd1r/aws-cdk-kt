package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun availConfigurationProperty(initializer: CfnChannel.AvailConfigurationProperty.Builder.() -> Unit
    = {}): CfnChannel.AvailConfigurationProperty =
    CfnChannel.AvailConfigurationProperty.builder().apply(initializer).build()
