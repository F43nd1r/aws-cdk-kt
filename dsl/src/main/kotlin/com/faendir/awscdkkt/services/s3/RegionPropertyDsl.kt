package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnMultiRegionAccessPoint

@Generated
public fun regionProperty(initializer: CfnMultiRegionAccessPoint.RegionProperty.Builder.() -> Unit =
    {}): CfnMultiRegionAccessPoint.RegionProperty =
    CfnMultiRegionAccessPoint.RegionProperty.builder().apply(initializer).build()
