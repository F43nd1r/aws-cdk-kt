package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnConfigurationSetEventDestination

@Generated
public
    fun dimensionConfigurationProperty(initializer: CfnConfigurationSetEventDestination.DimensionConfigurationProperty.Builder.() -> Unit
    = {}): CfnConfigurationSetEventDestination.DimensionConfigurationProperty =
    CfnConfigurationSetEventDestination.DimensionConfigurationProperty.builder().apply(initializer).build()
