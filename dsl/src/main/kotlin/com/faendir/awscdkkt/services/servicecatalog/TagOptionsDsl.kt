@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.servicecatalog

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.servicecatalog.TagOptions
import software.amazon.awscdk.services.servicecatalog.TagOptionsProps
import software.constructs.Construct

public fun Construct.tagOptions(
  id: String,
  props: TagOptionsProps,
  initializer: TagOptions.() -> Unit = {},
): TagOptions = TagOptions(this, id, props).apply(initializer)
