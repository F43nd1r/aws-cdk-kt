package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

@Generated
public
    fun ecrConfigurationProperty(initializer: CfnImagePipeline.EcrConfigurationProperty.Builder.() -> Unit
    = {}): CfnImagePipeline.EcrConfigurationProperty =
    CfnImagePipeline.EcrConfigurationProperty.builder().apply(initializer).build()
