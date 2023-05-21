package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ConnectionRule

@Generated
public fun connectionRule(initializer: ConnectionRule.Builder.() -> Unit = {}): ConnectionRule =
    ConnectionRule.builder().apply(initializer).build()
