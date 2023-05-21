package com.faendir.awscdkkt.services.appconfig

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.appconfig.CfnEnvironment

@Generated
public fun monitorsProperty(initializer: CfnEnvironment.MonitorsProperty.Builder.() -> Unit = {}):
    CfnEnvironment.MonitorsProperty =
    CfnEnvironment.MonitorsProperty.builder().apply(initializer).build()
