package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.CfnDBProxyTargetGroup

@Generated
public
    fun connectionPoolConfigurationInfoFormatProperty(initializer: CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.Builder.() -> Unit
    = {}): CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty =
    CfnDBProxyTargetGroup.ConnectionPoolConfigurationInfoFormatProperty.builder().apply(initializer).build()
