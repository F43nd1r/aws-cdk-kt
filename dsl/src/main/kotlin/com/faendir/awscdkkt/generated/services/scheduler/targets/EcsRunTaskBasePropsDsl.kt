package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.EcsRunTaskBaseProps

@Generated
public fun buildEcsRunTaskBaseProps(initializer: @AwsCdkDsl EcsRunTaskBaseProps.Builder.() -> Unit =
    {}): EcsRunTaskBaseProps = EcsRunTaskBaseProps.Builder().apply(initializer).build()
