package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint

@Generated
public
    fun publicAccessBlockConfigurationProperty(initializer: CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.Builder.() -> Unit
    = {}): CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty =
    CfnMultiRegionAccessPoint.PublicAccessBlockConfigurationProperty.builder().apply(initializer).build()
