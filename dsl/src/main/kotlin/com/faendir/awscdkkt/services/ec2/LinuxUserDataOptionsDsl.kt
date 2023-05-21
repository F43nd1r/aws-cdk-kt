package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.LinuxUserDataOptions

@Generated
public fun linuxUserDataOptions(initializer: LinuxUserDataOptions.Builder.() -> Unit = {}):
    LinuxUserDataOptions = LinuxUserDataOptions.builder().apply(initializer).build()
