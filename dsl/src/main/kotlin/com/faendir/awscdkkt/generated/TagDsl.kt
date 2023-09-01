package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Tag

@Generated
public fun buildTag(
  key: String,
  `value`: String,
  initializer: @AwsCdkDsl Tag.Builder.() -> Unit = {},
): Tag = Tag.Builder.create(key, value).apply(initializer).build()
