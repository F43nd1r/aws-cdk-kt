package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.ConfigureNatOptions

@Generated
public fun configureNatOptions(initializer: ConfigureNatOptions.Builder.() -> Unit = {}):
    ConfigureNatOptions = ConfigureNatOptions.builder().apply(initializer).build()
