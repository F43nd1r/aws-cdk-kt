package com.faendir.awscdkkt.services.evidently

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.evidently.CfnLaunch

@Generated
public
    fun launchGroupObjectProperty(initializer: CfnLaunch.LaunchGroupObjectProperty.Builder.() -> Unit
    = {}): CfnLaunch.LaunchGroupObjectProperty =
    CfnLaunch.LaunchGroupObjectProperty.builder().apply(initializer).build()
