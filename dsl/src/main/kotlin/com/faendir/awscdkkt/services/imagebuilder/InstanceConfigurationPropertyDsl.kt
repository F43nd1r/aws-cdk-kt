package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

@Generated
public
    fun instanceConfigurationProperty(initializer: CfnContainerRecipe.InstanceConfigurationProperty.Builder.() -> Unit
    = {}): CfnContainerRecipe.InstanceConfigurationProperty =
    CfnContainerRecipe.InstanceConfigurationProperty.builder().apply(initializer).build()
