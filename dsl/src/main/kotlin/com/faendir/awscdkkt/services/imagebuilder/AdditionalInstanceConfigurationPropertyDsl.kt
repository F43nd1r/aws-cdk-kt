package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@Generated
public
    fun additionalInstanceConfigurationProperty(initializer: CfnImageRecipe.AdditionalInstanceConfigurationProperty.Builder.() -> Unit
    = {}): CfnImageRecipe.AdditionalInstanceConfigurationProperty =
    CfnImageRecipe.AdditionalInstanceConfigurationProperty.builder().apply(initializer).build()
