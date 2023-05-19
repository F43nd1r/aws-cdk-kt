@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CustomResource
import software.amazon.awscdk.CustomResourceProps
import software.constructs.Construct

public fun Construct.customResource(
  id: String,
  props: CustomResourceProps,
  initializer: CustomResource.() -> Unit = {},
): CustomResource = CustomResource(this, id, props).apply(initializer)
