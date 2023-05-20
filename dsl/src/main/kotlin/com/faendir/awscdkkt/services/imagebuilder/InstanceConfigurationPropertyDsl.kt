@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

public
    fun instanceConfigurationProperty(initializer: CfnContainerRecipe.InstanceConfigurationProperty.Builder.() -> Unit):
    CfnContainerRecipe.InstanceConfigurationProperty =
    CfnContainerRecipe.InstanceConfigurationProperty.builder().apply(initializer).build()
