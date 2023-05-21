package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@Generated
public
    fun amiDistributionConfigurationProperty(initializer: CfnDistributionConfiguration.AmiDistributionConfigurationProperty.Builder.() -> Unit
    = {}): CfnDistributionConfiguration.AmiDistributionConfigurationProperty =
    CfnDistributionConfiguration.AmiDistributionConfigurationProperty.builder().apply(initializer).build()
