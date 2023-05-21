package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PublicSubnetProps

@Generated
public fun publicSubnetProps(initializer: PublicSubnetProps.Builder.() -> Unit = {}):
    PublicSubnetProps = PublicSubnetProps.builder().apply(initializer).build()
