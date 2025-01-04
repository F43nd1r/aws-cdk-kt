package com.faendir.awscdkkt.generated.services.logs

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.CfnTransformer

@Generated
public fun buildGrokProperty(initializer: @AwsCdkDsl CfnTransformer.GrokProperty.Builder.() -> Unit
    = {}): CfnTransformer.GrokProperty =
    CfnTransformer.GrokProperty.Builder().apply(initializer).build()
