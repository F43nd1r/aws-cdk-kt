@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnLayerVersion
import software.amazon.awscdk.services.lambda.CfnLayerVersionProps
import software.constructs.Construct

public fun Construct.cfnLayerVersion(
  id: String,
  props: CfnLayerVersionProps,
  initializer: CfnLayerVersion.() -> Unit = {},
): CfnLayerVersion = CfnLayerVersion(this, id, props).apply(initializer)
