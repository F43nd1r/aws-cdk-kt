package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.RoleProps

@Generated
public fun roleProps(initializer: RoleProps.Builder.() -> Unit = {}): RoleProps =
    RoleProps.builder().apply(initializer).build()
