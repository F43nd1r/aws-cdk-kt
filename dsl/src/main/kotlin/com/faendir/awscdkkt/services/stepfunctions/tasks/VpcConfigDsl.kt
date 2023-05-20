@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.stepfunctions.tasks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig

public fun vpcConfig(initializer: VpcConfig.Builder.() -> Unit): VpcConfig =
    VpcConfig.builder().apply(initializer).build()
