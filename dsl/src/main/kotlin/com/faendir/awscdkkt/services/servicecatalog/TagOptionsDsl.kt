@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
