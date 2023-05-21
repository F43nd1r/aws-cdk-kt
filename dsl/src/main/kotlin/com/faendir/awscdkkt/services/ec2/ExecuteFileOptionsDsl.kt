package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ExecuteFileOptions

@Generated
public fun executeFileOptions(initializer: ExecuteFileOptions.Builder.() -> Unit = {}):
    ExecuteFileOptions = ExecuteFileOptions.builder().apply(initializer).build()
