package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

@Generated
public
    fun imageTestsConfigurationProperty(initializer: CfnImagePipeline.ImageTestsConfigurationProperty.Builder.() -> Unit
    = {}): CfnImagePipeline.ImageTestsConfigurationProperty =
    CfnImagePipeline.ImageTestsConfigurationProperty.builder().apply(initializer).build()
