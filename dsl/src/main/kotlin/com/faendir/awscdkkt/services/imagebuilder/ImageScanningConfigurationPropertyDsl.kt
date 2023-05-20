@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

public
    fun imageScanningConfigurationProperty(initializer: CfnImagePipeline.ImageScanningConfigurationProperty.Builder.() -> Unit):
    CfnImagePipeline.ImageScanningConfigurationProperty =
    CfnImagePipeline.ImageScanningConfigurationProperty.builder().apply(initializer).build()
