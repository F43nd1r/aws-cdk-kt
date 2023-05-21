package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InitCommandOptions

@Generated
public fun initCommandOptions(initializer: InitCommandOptions.Builder.() -> Unit = {}):
    InitCommandOptions = InitCommandOptions.builder().apply(initializer).build()
