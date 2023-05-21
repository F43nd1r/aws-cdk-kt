package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig

@Generated
public fun vpcConfig(initializer: VpcConfig.Builder.() -> Unit = {}): VpcConfig =
    VpcConfig.builder().apply(initializer).build()
