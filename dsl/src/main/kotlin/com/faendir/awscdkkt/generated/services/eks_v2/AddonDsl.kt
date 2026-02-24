package com.faendir.awscdkkt.generated.services.eks_v2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.eks_v2.Addon
import software.amazon.awscdk.services.eks_v2.AddonProps
import software.constructs.Construct

@Generated
public fun Construct.addon(
  id: String,
  props: AddonProps,
  initializer: @AwsCdkDsl Addon.() -> Unit = {},
): Addon = Addon(this, id, props).apply(initializer)

@Generated
public fun Construct.buildAddon(id: String, initializer: @AwsCdkDsl Addon.Builder.() -> Unit = {}): Addon = Addon.Builder.create(this, id).apply(initializer).build()
