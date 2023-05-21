package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnAppProps

@Generated
public fun cfnAppProps(initializer: CfnAppProps.Builder.() -> Unit = {}): CfnAppProps =
    CfnAppProps.builder().apply(initializer).build()
