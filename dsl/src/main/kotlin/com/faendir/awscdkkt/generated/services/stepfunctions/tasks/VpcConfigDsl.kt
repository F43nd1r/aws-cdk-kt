package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig

@Generated
public fun buildVpcConfig(initializer: @AwsCdkDsl VpcConfig.Builder.() -> Unit): VpcConfig =
    VpcConfig.Builder().apply(initializer).build()
