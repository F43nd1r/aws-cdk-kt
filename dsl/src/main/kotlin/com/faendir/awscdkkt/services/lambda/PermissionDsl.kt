@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Permission

public fun permission(initializer: Permission.Builder.() -> Unit): Permission =
    Permission.builder().apply(initializer).build()
