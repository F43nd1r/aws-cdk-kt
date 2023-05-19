@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint

public
    fun publicAccessBlockConfigurationProperty(initializer: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
    CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty =
    CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.builder().apply(initializer).build()
