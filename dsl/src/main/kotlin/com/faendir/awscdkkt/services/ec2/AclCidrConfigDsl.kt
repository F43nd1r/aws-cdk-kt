package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AclCidrConfig

@Generated
public fun aclCidrConfig(initializer: AclCidrConfig.Builder.() -> Unit = {}): AclCidrConfig =
    AclCidrConfig.builder().apply(initializer).build()
