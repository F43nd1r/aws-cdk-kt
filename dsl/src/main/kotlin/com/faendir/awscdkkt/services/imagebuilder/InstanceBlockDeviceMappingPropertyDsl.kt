package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@Generated
public
    fun instanceBlockDeviceMappingProperty(initializer: CfnImageRecipe.InstanceBlockDeviceMappingProperty.Builder.() -> Unit
    = {}): CfnImageRecipe.InstanceBlockDeviceMappingProperty =
    CfnImageRecipe.InstanceBlockDeviceMappingProperty.builder().apply(initializer).build()
