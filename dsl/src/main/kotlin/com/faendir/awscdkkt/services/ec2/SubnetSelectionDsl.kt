package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SubnetSelection

@Generated
public fun subnetSelection(initializer: SubnetSelection.Builder.() -> Unit = {}): SubnetSelection =
    SubnetSelection.builder().apply(initializer).build()
