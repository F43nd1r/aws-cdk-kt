package com.faendir.awscdkkt.generated.services.scheduler.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.scheduler.targets.Universal

@Generated
public fun buildUniversal(initializer: @AwsCdkDsl Universal.Builder.() -> Unit = {}): Universal =
    Universal.Builder.create().apply(initializer).build()
