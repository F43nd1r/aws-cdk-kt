@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.CfnRepository

public
    fun imageScanningConfigurationProperty(initializer: CfnRepository.ImageScanningConfigurationProperty.Builder.() -> Unit):
    CfnRepository.ImageScanningConfigurationProperty =
    CfnRepository.ImageScanningConfigurationProperty.builder().apply(initializer).build()
