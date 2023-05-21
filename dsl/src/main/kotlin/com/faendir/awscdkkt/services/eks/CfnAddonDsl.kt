package com.faendir.awscdkkt.services.eks

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks.CfnAddon
import software.amazon.awscdk.services.eks.CfnAddonProps
import software.constructs.Construct

@Generated
public fun Construct.cfnAddon(
  id: String,
  props: CfnAddonProps,
  initializer: CfnAddon.() -> Unit = {},
): CfnAddon = CfnAddon(this, id, props).apply(initializer)
