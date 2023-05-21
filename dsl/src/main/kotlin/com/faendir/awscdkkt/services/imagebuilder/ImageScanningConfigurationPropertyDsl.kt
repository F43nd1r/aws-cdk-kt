package com.faendir.awscdkkt.services.imagebuilder

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.imagebuilder.CfnImagePipeline

@Generated
public
    fun imageScanningConfigurationProperty(initializer: CfnImagePipeline.ImageScanningConfigurationProperty.Builder.() -> Unit
    = {}): CfnImagePipeline.ImageScanningConfigurationProperty =
    CfnImagePipeline.ImageScanningConfigurationProperty.builder().apply(initializer).build()
