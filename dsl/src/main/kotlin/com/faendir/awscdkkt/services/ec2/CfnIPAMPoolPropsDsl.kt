package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIPAMPoolProps

@Generated
public fun cfnIPAMPoolProps(initializer: CfnIPAMPoolProps.Builder.() -> Unit = {}): CfnIPAMPoolProps
    = CfnIPAMPoolProps.builder().apply(initializer).build()
