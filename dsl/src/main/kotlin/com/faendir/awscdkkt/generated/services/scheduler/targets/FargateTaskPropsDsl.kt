package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.FargateTaskProps

@Generated
public fun buildFargateTaskProps(initializer: @AwsCdkDsl FargateTaskProps.Builder.() -> Unit = {}):
    FargateTaskProps = FargateTaskProps.Builder().apply(initializer).build()
