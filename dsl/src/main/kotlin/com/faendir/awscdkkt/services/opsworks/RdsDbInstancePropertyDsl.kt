package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnStack

@Generated
public fun rdsDbInstanceProperty(initializer: CfnStack.RdsDbInstanceProperty.Builder.() -> Unit =
    {}): CfnStack.RdsDbInstanceProperty =
    CfnStack.RdsDbInstanceProperty.builder().apply(initializer).build()
