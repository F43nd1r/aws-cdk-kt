@file:Generated(value = ["Generated based on CDK v2.80.0"])

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
