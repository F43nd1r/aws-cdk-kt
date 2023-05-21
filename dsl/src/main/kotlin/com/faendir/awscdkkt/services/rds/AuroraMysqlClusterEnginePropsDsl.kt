package com.faendir.awscdkkt.services.rds

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps

@Generated
public
    fun auroraMysqlClusterEngineProps(initializer: AuroraMysqlClusterEngineProps.Builder.() -> Unit
    = {}): AuroraMysqlClusterEngineProps =
    AuroraMysqlClusterEngineProps.builder().apply(initializer).build()
