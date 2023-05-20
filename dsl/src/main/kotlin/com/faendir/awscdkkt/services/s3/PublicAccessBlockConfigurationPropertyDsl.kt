@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint

public
    fun publicAccessBlockConfigurationProperty(initializer: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit):
    CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty =
    CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.builder().apply(initializer).build()
