package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImageRecipe

@Generated
public
    fun ebsInstanceBlockDeviceSpecificationProperty(initializer: CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.Builder.() -> Unit
    = {}): CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty =
    CfnImageRecipe.EbsInstanceBlockDeviceSpecificationProperty.builder().apply(initializer).build()
