package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@Generated
public
    fun containerDistributionConfigurationProperty(initializer: CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.Builder.() -> Unit
    = {}): CfnDistributionConfiguration.ContainerDistributionConfigurationProperty =
    CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.builder().apply(initializer).build()
