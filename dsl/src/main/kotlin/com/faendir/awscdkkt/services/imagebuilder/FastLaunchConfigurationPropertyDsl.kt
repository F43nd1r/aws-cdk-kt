package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@Generated
public
    fun fastLaunchConfigurationProperty(initializer: CfnDistributionConfiguration.FastLaunchConfigurationProperty.Builder.() -> Unit
    = {}): CfnDistributionConfiguration.FastLaunchConfigurationProperty =
    CfnDistributionConfiguration.FastLaunchConfigurationProperty.builder().apply(initializer).build()
