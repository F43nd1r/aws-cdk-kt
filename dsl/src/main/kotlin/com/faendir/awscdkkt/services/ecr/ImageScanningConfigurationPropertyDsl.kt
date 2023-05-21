package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository

@Generated
public
    fun imageScanningConfigurationProperty(initializer: CfnRepository.ImageScanningConfigurationProperty.Builder.() -> Unit
    = {}): CfnRepository.ImageScanningConfigurationProperty =
    CfnRepository.ImageScanningConfigurationProperty.builder().apply(initializer).build()
