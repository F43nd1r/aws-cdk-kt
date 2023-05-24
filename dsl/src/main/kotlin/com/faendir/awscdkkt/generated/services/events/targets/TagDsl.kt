package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.Tag

@Generated
public fun buildTag(initializer: @AwsCdkDsl Tag.Builder.() -> Unit): Tag =
    Tag.Builder().apply(initializer).build()
