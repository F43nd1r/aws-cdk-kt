package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.RotationMultiUserOptions

@Generated
public fun rotationMultiUserOptions(initializer: RotationMultiUserOptions.Builder.() -> Unit = {}):
    RotationMultiUserOptions = RotationMultiUserOptions.builder().apply(initializer).build()
