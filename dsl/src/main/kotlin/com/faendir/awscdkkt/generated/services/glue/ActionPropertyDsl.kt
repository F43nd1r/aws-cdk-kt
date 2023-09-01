package com.faendir.awscdkkt.generated.services.glue

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.glue.CfnTrigger

@Generated
public fun buildActionProperty(initializer: @AwsCdkDsl CfnTrigger.ActionProperty.Builder.() -> Unit
    = {}): CfnTrigger.ActionProperty =
    CfnTrigger.ActionProperty.Builder().apply(initializer).build()
