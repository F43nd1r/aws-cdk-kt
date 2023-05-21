package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@Generated
public
    fun launchTemplateConfigurationProperty(initializer: CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.Builder.() -> Unit
    = {}): CfnDistributionConfiguration.LaunchTemplateConfigurationProperty =
    CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.builder().apply(initializer).build()
