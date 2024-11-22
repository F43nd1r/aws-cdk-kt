package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.ProvisionedPollerConfig

@Generated
public fun buildProvisionedPollerConfig(initializer: @AwsCdkDsl
    ProvisionedPollerConfig.Builder.() -> Unit = {}): ProvisionedPollerConfig =
    ProvisionedPollerConfig.Builder().apply(initializer).build()
