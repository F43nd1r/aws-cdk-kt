package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.BatchJobProps

@Generated
public fun buildBatchJobProps(initializer: @AwsCdkDsl BatchJobProps.Builder.() -> Unit = {}):
    BatchJobProps = BatchJobProps.Builder().apply(initializer).build()
