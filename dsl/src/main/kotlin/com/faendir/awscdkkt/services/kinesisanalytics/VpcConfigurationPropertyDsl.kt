package com.faendir.awscdkkt.services.kinesisanalytics

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@Generated
public
    fun vpcConfigurationProperty(initializer: CfnApplicationV2.VpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnApplicationV2.VpcConfigurationProperty =
    CfnApplicationV2.VpcConfigurationProperty.builder().apply(initializer).build()
