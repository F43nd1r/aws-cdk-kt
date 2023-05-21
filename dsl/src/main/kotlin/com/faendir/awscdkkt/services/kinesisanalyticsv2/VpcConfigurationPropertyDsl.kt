package com.faendir.awscdkkt.services.kinesisanalyticsv2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@Generated
public
    fun vpcConfigurationProperty(initializer: CfnApplication.VpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplication.VpcConfigurationProperty =
    CfnApplication.VpcConfigurationProperty.builder().apply(initializer).build()
