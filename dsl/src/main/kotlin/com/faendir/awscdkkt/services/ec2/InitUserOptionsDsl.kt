package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.InitUserOptions

@Generated
public fun initUserOptions(initializer: InitUserOptions.Builder.() -> Unit = {}): InitUserOptions =
    InitUserOptions.builder().apply(initializer).build()
