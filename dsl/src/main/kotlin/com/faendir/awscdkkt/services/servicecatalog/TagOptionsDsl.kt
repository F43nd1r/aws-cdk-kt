package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.amazon.awscdk.services.servicecatalog.TagOptionsProps
import software.constructs.Construct

@Generated
public fun Construct.tagOptions(
  id: String,
  props: TagOptionsProps,
  initializer: TagOptions.() -> Unit = {},
): TagOptions = TagOptions(this, id, props).apply(initializer)
