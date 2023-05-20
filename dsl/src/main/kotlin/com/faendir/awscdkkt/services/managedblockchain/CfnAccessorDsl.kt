@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.managedblockchain

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.managedblockchain.CfnAccessor
import software.amazon.awscdk.services.managedblockchain.CfnAccessorProps
import software.constructs.Construct

public fun Construct.cfnAccessor(
  id: String,
  props: CfnAccessorProps,
  initializer: CfnAccessor.() -> Unit = {},
): CfnAccessor = CfnAccessor(this, id, props).apply(initializer)
