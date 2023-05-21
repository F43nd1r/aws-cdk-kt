package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.Tag

@Generated
public fun tag(initializer: Tag.Builder.() -> Unit = {}): Tag =
    Tag.builder().apply(initializer).build()
