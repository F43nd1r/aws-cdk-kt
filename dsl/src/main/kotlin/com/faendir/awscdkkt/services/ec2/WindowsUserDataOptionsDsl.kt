package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.WindowsUserDataOptions

@Generated
public fun windowsUserDataOptions(initializer: WindowsUserDataOptions.Builder.() -> Unit = {}):
    WindowsUserDataOptions = WindowsUserDataOptions.builder().apply(initializer).build()
