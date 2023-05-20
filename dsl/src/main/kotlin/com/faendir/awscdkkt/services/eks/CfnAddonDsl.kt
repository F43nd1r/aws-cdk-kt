@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnAddon
import software.amazon.awscdk.services.eks.CfnAddonProps
import software.constructs.Construct

public fun Construct.cfnAddon(
  id: String,
  props: CfnAddonProps,
  initializer: CfnAddon.() -> Unit = {},
): CfnAddon = CfnAddon(this, id, props).apply(initializer)
