@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
