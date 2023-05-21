package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.LazyRoleProps

@Generated
public fun lazyRoleProps(initializer: LazyRoleProps.Builder.() -> Unit = {}): LazyRoleProps =
    LazyRoleProps.builder().apply(initializer).build()
