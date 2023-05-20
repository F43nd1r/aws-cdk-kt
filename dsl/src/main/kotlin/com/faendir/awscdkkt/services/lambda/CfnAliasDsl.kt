@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnAlias
import software.amazon.awscdk.services.lambda.CfnAliasProps
import software.constructs.Construct

public fun Construct.cfnAlias(
  id: String,
  props: CfnAliasProps,
  initializer: CfnAlias.() -> Unit = {},
): CfnAlias = CfnAlias(this, id, props).apply(initializer)
