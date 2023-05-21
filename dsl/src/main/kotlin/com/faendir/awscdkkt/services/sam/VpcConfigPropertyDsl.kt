package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun vpcConfigProperty(initializer: CfnFunction.VpcConfigProperty.Builder.() -> Unit = {}):
    CfnFunction.VpcConfigProperty =
    CfnFunction.VpcConfigProperty.builder().apply(initializer).build()
