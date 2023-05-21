package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.TagCondition

@Generated
public fun tagCondition(initializer: TagCondition.Builder.() -> Unit = {}): TagCondition =
    TagCondition.builder().apply(initializer).build()
