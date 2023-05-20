@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.codepipeline

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.codepipeline.CfnCustomActionType
import software.amazon.awscdk.services.codepipeline.CfnCustomActionTypeProps
import software.constructs.Construct

public fun Construct.cfnCustomActionType(
  id: String,
  props: CfnCustomActionTypeProps,
  initializer: CfnCustomActionType.() -> Unit = {},
): CfnCustomActionType = CfnCustomActionType(this, id, props).apply(initializer)
