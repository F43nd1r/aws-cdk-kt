package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.PortProps

@Generated
public fun portProps(initializer: PortProps.Builder.() -> Unit = {}): PortProps =
    PortProps.builder().apply(initializer).build()
