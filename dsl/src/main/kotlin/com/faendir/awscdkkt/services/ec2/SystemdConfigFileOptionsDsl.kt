package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SystemdConfigFileOptions

@Generated
public fun systemdConfigFileOptions(initializer: SystemdConfigFileOptions.Builder.() -> Unit = {}):
    SystemdConfigFileOptions = SystemdConfigFileOptions.builder().apply(initializer).build()
