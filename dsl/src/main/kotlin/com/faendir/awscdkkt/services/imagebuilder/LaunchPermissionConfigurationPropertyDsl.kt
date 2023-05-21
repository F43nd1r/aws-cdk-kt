package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@Generated
public
    fun launchPermissionConfigurationProperty(initializer: CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.Builder.() -> Unit
    = {}): CfnDistributionConfiguration.LaunchPermissionConfigurationProperty =
    CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.builder().apply(initializer).build()
