package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@Generated
public
    fun componentConfigurationProperty(initializer: CfnImageRecipe.ComponentConfigurationProperty.Builder.() -> Unit
    = {}): CfnImageRecipe.ComponentConfigurationProperty =
    CfnImageRecipe.ComponentConfigurationProperty.builder().apply(initializer).build()
