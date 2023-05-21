package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.AclTrafficConfig

@Generated
public fun aclTrafficConfig(initializer: AclTrafficConfig.Builder.() -> Unit = {}): AclTrafficConfig
    = AclTrafficConfig.builder().apply(initializer).build()
