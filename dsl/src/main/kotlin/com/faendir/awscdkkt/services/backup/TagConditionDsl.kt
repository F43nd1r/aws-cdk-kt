@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.backup

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.backup.TagCondition

public fun tagCondition(initializer: TagCondition.Builder.() -> Unit): TagCondition =
    TagCondition.builder().apply(initializer).build()
