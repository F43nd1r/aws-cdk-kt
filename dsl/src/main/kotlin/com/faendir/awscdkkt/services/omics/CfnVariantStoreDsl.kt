package com.faendir.awscdkkt.services.omics

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.omics.CfnVariantStore
import software.amazon.awscdk.services.omics.CfnVariantStoreProps
import software.constructs.Construct

@Generated
public fun Construct.cfnVariantStore(
  id: String,
  props: CfnVariantStoreProps,
  initializer: CfnVariantStore.() -> Unit = {},
): CfnVariantStore = CfnVariantStore(this, id, props).apply(initializer)
