package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.TagManager
import software.amazon.awscdk.TagManagerOptions
import software.amazon.awscdk.TagType

@Generated
public fun tagManager(
  tagType: TagType,
  resourceTypeName: String,
  tagStructure: Any,
  options: TagManagerOptions,
): TagManager = TagManager(tagType, resourceTypeName, tagStructure, options)

@Generated
public fun tagManager(
  tagType: TagType,
  resourceTypeName: String,
  tagStructure: Any,
): TagManager = TagManager(tagType, resourceTypeName, tagStructure)

@Generated
public fun tagManager(tagType: TagType, resourceTypeName: String): TagManager = TagManager(tagType,
    resourceTypeName)

@Generated
public fun buildTagManager(
  tagType: TagType,
  resourceTypeName: String,
  tagStructure: Any,
  initializer: @AwsCdkDsl TagManager.Builder.() -> Unit,
): TagManager = TagManager.Builder.create(tagType, resourceTypeName,
    tagStructure).apply(initializer).build()

@Generated
public fun buildTagManager(
  tagType: TagType,
  resourceTypeName: String,
  initializer: @AwsCdkDsl TagManager.Builder.() -> Unit,
): TagManager = TagManager.Builder.create(tagType, resourceTypeName).apply(initializer).build()
