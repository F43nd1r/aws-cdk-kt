package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@Generated
public
    fun systemsManagerAgentProperty(initializer: CfnImageRecipe.SystemsManagerAgentProperty.Builder.() -> Unit
    = {}): CfnImageRecipe.SystemsManagerAgentProperty =
    CfnImageRecipe.SystemsManagerAgentProperty.builder().apply(initializer).build()
