@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.PosixUser

public fun posixUser(initializer: PosixUser.Builder.() -> Unit): PosixUser =
    PosixUser.builder().apply(initializer).build()
