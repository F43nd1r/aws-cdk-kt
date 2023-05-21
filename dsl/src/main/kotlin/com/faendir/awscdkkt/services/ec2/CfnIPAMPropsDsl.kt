package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMProps

@Generated
public fun cfnIPAMProps(initializer: CfnIPAMProps.Builder.() -> Unit = {}): CfnIPAMProps =
    CfnIPAMProps.builder().apply(initializer).build()
