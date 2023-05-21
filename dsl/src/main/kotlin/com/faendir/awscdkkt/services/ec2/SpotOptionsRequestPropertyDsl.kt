package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun spotOptionsRequestProperty(initializer: CfnEC2Fleet.SpotOptionsRequestProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.SpotOptionsRequestProperty =
    CfnEC2Fleet.SpotOptionsRequestProperty.builder().apply(initializer).build()
