package com.faendir.awscdkkt.services.efs

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.efs.PosixUser

@Generated
public fun posixUser(initializer: PosixUser.Builder.() -> Unit = {}): PosixUser =
    PosixUser.builder().apply(initializer).build()
