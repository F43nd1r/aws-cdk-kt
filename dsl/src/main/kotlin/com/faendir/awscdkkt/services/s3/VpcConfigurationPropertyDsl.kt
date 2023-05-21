package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnAccessPoint

@Generated
public
    fun vpcConfigurationProperty(initializer: CfnAccessPoint.VpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnAccessPoint.VpcConfigurationProperty =
    CfnAccessPoint.VpcConfigurationProperty.builder().apply(initializer).build()
