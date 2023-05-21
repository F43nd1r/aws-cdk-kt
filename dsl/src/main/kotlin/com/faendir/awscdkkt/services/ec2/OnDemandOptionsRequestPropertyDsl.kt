package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnEC2Fleet

@Generated
public
    fun onDemandOptionsRequestProperty(initializer: CfnEC2Fleet.OnDemandOptionsRequestProperty.Builder.() -> Unit
    = {}): CfnEC2Fleet.OnDemandOptionsRequestProperty =
    CfnEC2Fleet.OnDemandOptionsRequestProperty.builder().apply(initializer).build()
