@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.LayerVersion
import software.amazon.awscdk.services.lambda.LayerVersionProps
import software.constructs.Construct

public fun Construct.layerVersion(
  id: String,
  props: LayerVersionProps,
  initializer: LayerVersion.() -> Unit = {},
): LayerVersion = LayerVersion(this, id, props).apply(initializer)
