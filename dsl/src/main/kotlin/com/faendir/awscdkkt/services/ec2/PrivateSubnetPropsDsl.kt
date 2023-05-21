package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PrivateSubnetProps

@Generated
public fun privateSubnetProps(initializer: PrivateSubnetProps.Builder.() -> Unit = {}):
    PrivateSubnetProps = PrivateSubnetProps.builder().apply(initializer).build()
