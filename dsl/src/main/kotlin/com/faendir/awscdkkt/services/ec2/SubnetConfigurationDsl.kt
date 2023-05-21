package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SubnetConfiguration

@Generated
public fun subnetConfiguration(initializer: SubnetConfiguration.Builder.() -> Unit = {}):
    SubnetConfiguration = SubnetConfiguration.builder().apply(initializer).build()
