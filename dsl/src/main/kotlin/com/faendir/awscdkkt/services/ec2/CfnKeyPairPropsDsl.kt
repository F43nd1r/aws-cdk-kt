package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnKeyPairProps

@Generated
public fun cfnKeyPairProps(initializer: CfnKeyPairProps.Builder.() -> Unit = {}): CfnKeyPairProps =
    CfnKeyPairProps.builder().apply(initializer).build()
