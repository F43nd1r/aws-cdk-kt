@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

public
    fun ecrConfigurationProperty(initializer: CfnImagePipeline.EcrConfigurationProperty.Builder.() -> Unit):
    CfnImagePipeline.EcrConfigurationProperty =
    CfnImagePipeline.EcrConfigurationProperty.builder().apply(initializer).build()
