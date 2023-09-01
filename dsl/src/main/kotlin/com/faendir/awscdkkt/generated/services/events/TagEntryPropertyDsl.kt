package com.faendir.awscdkkt.generated.services.events

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEventBus

@Generated
public fun buildTagEntryProperty(initializer: @AwsCdkDsl
    CfnEventBus.TagEntryProperty.Builder.() -> Unit = {}): CfnEventBus.TagEntryProperty =
    CfnEventBus.TagEntryProperty.Builder().apply(initializer).build()
