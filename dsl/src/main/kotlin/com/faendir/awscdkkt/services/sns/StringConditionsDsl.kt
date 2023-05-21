package com.faendir.awscdkkt.services.sns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sns.StringConditions

@Generated
public fun stringConditions(initializer: StringConditions.Builder.() -> Unit = {}): StringConditions
    = StringConditions.builder().apply(initializer).build()
