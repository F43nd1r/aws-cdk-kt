package com.faendir.awscdkkt.services.pipes

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.pipes.CfnPipe

@Generated
public
    fun awsVpcConfigurationProperty(initializer: CfnPipe.AwsVpcConfigurationProperty.Builder.() -> Unit
    = {}): CfnPipe.AwsVpcConfigurationProperty =
    CfnPipe.AwsVpcConfigurationProperty.builder().apply(initializer).build()
