package com.faendir.awscdkkt.services.codedeploy

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codedeploy.AutoRollbackConfig

@Generated
public fun autoRollbackConfig(initializer: AutoRollbackConfig.Builder.() -> Unit = {}):
    AutoRollbackConfig = AutoRollbackConfig.builder().apply(initializer).build()
