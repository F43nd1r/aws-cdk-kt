package com.faendir.awscdkkt.services.s3outposts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint

@Generated
public
    fun vpcConfigurationProperty(initializer: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnAccessPoint.VpcConfigurationProperty =
    CfnAccessPoint.VpcConfigurationProperty.builder().apply(initializer).build()
