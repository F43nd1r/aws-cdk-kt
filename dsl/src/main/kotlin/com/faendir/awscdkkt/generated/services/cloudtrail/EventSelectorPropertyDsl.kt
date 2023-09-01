package com.faendir.awscdkkt.generated.services.cloudtrail

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnTrail

@Generated
public fun buildEventSelectorProperty(initializer: @AwsCdkDsl
    CfnTrail.EventSelectorProperty.Builder.() -> Unit = {}): CfnTrail.EventSelectorProperty =
    CfnTrail.EventSelectorProperty.Builder().apply(initializer).build()
