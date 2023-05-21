package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InitFileOptions

@Generated
public fun initFileOptions(initializer: InitFileOptions.Builder.() -> Unit = {}): InitFileOptions =
    InitFileOptions.builder().apply(initializer).build()
