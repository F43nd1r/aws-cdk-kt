package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.RotationSingleUserOptions

@Generated
public fun rotationSingleUserOptions(initializer: RotationSingleUserOptions.Builder.() -> Unit =
    {}): RotationSingleUserOptions = RotationSingleUserOptions.builder().apply(initializer).build()
