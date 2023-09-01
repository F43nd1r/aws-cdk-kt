package com.faendir.awscdkkt.generated.services.eks

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnAddon.() -> Unit = {},
): CfnAddon = CfnAddon(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnAddon(id: String, initializer: @AwsCdkDsl CfnAddon.Builder.() -> Unit =
    {}): CfnAddon = CfnAddon.Builder.create(this, id).apply(initializer).build()
