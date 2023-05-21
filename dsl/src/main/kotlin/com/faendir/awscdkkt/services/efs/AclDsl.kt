package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.Acl

@Generated
public fun acl(initializer: Acl.Builder.() -> Unit = {}): Acl =
    Acl.builder().apply(initializer).build()
