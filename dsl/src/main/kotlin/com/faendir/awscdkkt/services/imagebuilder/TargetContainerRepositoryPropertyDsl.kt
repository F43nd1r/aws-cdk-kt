package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration

@Generated
public
    fun targetContainerRepositoryProperty(initializer: CfnDistributionConfiguration.TargetContainerRepositoryProperty.Builder.() -> Unit
    = {}): CfnDistributionConfiguration.TargetContainerRepositoryProperty =
    CfnDistributionConfiguration.TargetContainerRepositoryProperty.builder().apply(initializer).build()
