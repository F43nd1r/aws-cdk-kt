@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.kms

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kms.CfnAlias
import software.amazon.awscdk.services.kms.CfnAliasProps
import software.constructs.Construct

public fun Construct.cfnAlias(
  id: String,
  props: CfnAliasProps,
  initializer: CfnAlias.() -> Unit = {},
): CfnAlias = CfnAlias(this, id, props).apply(initializer)
