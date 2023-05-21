package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Permission

@Generated
public fun permission(initializer: Permission.Builder.() -> Unit = {}): Permission =
    Permission.builder().apply(initializer).build()
