package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.Tag

@Generated
public fun tag(initializer: Tag.Builder.() -> Unit = {}): Tag =
    Tag.builder().apply(initializer).build()
