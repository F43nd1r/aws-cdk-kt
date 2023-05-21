package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SubnetProps

@Generated
public fun subnetProps(initializer: SubnetProps.Builder.() -> Unit = {}): SubnetProps =
    SubnetProps.builder().apply(initializer).build()
