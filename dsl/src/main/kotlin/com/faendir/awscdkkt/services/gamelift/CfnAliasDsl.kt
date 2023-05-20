@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnAlias
import software.amazon.awscdk.services.gamelift.CfnAliasProps
import software.constructs.Construct

public fun Construct.cfnAlias(
  id: String,
  props: CfnAliasProps,
  initializer: CfnAlias.() -> Unit = {},
): CfnAlias = CfnAlias(this, id, props).apply(initializer)
