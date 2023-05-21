package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.BastionHostLinuxProps

@Generated
public fun bastionHostLinuxProps(initializer: BastionHostLinuxProps.Builder.() -> Unit = {}):
    BastionHostLinuxProps = BastionHostLinuxProps.builder().apply(initializer).build()
