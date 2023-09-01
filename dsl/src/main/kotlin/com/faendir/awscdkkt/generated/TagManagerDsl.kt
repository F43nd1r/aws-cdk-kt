package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.TagManager
import software.amazon.awscdk.TagType

@Generated
public fun buildTagManager(
  tagType: TagType,
  resourceTypeName: String,
  initializer: @AwsCdkDsl TagManager.Builder.() -> Unit = {},
): TagManager = TagManager.Builder.create(tagType, resourceTypeName).apply(initializer).build()

@Generated
public fun buildTagManager(
  tagType: TagType,
  resourceTypeName: String,
  initialTags: Any,
  initializer: @AwsCdkDsl TagManager.Builder.() -> Unit = {},
): TagManager = TagManager.Builder.create(tagType, resourceTypeName,
    initialTags).apply(initializer).build()
