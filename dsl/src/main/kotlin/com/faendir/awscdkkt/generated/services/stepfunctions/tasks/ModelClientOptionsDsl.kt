package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.ModelClientOptions

@Generated
public fun buildModelClientOptions(initializer: @AwsCdkDsl ModelClientOptions.Builder.() -> Unit =
    {}): ModelClientOptions = ModelClientOptions.Builder().apply(initializer).build()
